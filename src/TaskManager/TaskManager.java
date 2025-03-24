package TaskManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager implements TaskManagerInterface {

    private final List<Task> tasks = new ArrayList<>();
    private final Map<User, List<Task>> userTasks = new HashMap<>();
    private final LocalDate today = LocalDate.now();

    //Itt miért Class 'Task' is exposed outside its defined visibility scope ?
    public void storeTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void assignTaskByID(User user, Integer taskID) {
        Task task = getTaskByID(taskID);
        if (task == null) {
            System.out.println("Task not found");
            return;
        }
        if (!userTasks.containsKey(user)) {
            System.out.println("User does not exist in map");
            System.out.println("Adding user: " + user.getName());
            userTasks.put(user, new ArrayList<>());
            System.out.println("Adding task to " + user.getName());
            userTasks.get(user).add(task);
            System.out.println("Done\n");
        } else {
            System.out.println("Existing user found. Adding task...");
            userTasks.get(user).add(task);
            System.out.println("Done\n");
        }
    }

    private Task getTaskByID(Integer taskID) {
        return tasks.stream()
                .filter(t -> t.getID() == taskID)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateStatus() {
        tasks.stream()
                .filter(t -> t.status.equals(Status.DUE))
                .filter(t -> t.getDueDate().isBefore(today))
                .forEach(t -> t.setStatus(Status.OVERDUE));
    }

    @Override
    public void updateStatus(Task task, Status status) {
        tasks.stream()
                .filter(t -> t.equals(task))
                .forEach(t -> t.setStatus(status));
    }

    @Override
    public void listUserTasks(User user) {
        if (userTasks.containsKey(user))
            userTasks.get(user).forEach(t -> System.out.println(t.getTitle()));
        else System.out.println("No such user");
    }

    @Override
    public void listOverdueTasks() {
        tasks.stream()
                .filter(task -> task.getStatus().equals(Status.OVERDUE))
                .forEach(t -> System.out.println(t.getTitle()));
    }

    public void listUnassignedTasks() {
        List<Task> assignedTasks = new ArrayList<>();
        userTasks.values().forEach(assignedTasks::addAll);

        tasks.stream()
                .filter(task -> !assignedTasks.contains(task))
                .forEach(t -> System.out.println(t.getTitle()));
    }
}

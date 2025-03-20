package TaskManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager implements TaskManagerInterface {

    private final List<Task> taskList = new ArrayList<>();
    private final Map<User, List<Task>> userTaskMap = new HashMap<>();
    private LocalDate today = LocalDate.now();

    public void storeTask(Task task) {
        taskList.add(task);
    }

    @Override
    public void assignTaskByID(User user, Integer taskID) {
        Task task = getTaskByID(taskID);
        if (task == null) {
            System.out.println("Task not found");
            return;
        }
        if (!userTaskMap.containsKey(user)) {
            System.out.println("User does not exist in map");
            System.out.println("Adding user: " + user.getName());
            userTaskMap.put(user, new ArrayList<>());
            System.out.println("Adding task to " + user.getName());
            userTaskMap.get(user).add(task);
            System.out.println("Done\n");
        } else {
            System.out.println("Existing user found. Adding task...");
            userTaskMap.get(user).add(task);
            System.out.println("Done\n");
        }
    }

    private Task getTaskByID(Integer taskID) {
        return taskList.stream()
                .filter(t -> t.getID() == taskID)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateStatus() {
        taskList.stream()
                .filter(t -> t.status.equals(Status.DUE))
                .filter(t -> t.getDueDate().isBefore(today))
                .forEach(t -> t.setStatus(Status.OVERDUE));
    }

    @Override
    public void updateStatus(Task task, Status status) {
        taskList.stream()
                .filter(t -> t.equals(task))
                .forEach(t -> t.setStatus(status));
    }

    @Override
    public void listUserTasks(User user) {
        if (userTaskMap.containsKey(user))
            userTaskMap.get(user).forEach(t -> System.out.println(t.getTitle()));
        else System.out.println("No such user");
    }

    @Override
    public void listOverdueTasks() {
        taskList.stream()
                .filter(task -> task.getStatus().equals(Status.OVERDUE))
                .forEach(t -> System.out.println(t.getTitle()));
    }


}

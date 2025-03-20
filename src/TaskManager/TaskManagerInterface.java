package TaskManager;

public interface TaskManagerInterface {
    //    Ha nem Done és ma > dutedate -> Status -> OverDue
    void updateStatus();

    void assignTaskByID(User user, Integer taskID);

    void updateStatus(Task task, Status status);

    void listUserTasks(User user);

    void listOverdueTasks();
}

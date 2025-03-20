package TaskManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        User user1 = new User("Nyufter Frankó", "asd@asd.asd");
//        User user2 = new ExtraOrdinaryUser();
        Task task1 = new SimpleTask("FontosFeladat1", "description1", LocalDate.of(2025,3,10), Status.DUE, 100);
        Task task2 = new SimpleTask("FontosFeladat2", "description2", LocalDate.of(2025,3,24), Status.DUE, 101);
        Task task3 = new SimpleTask("OverDueFeladat1", "description2", LocalDate.of(2025,3,10), Status.OVERDUE, 103);
        Task task4 = new SimpleTask("OverDueFeladat2", "description2", LocalDate.of(2025,3,10), Status.OVERDUE, 104);

        taskManager.storeTask(task1);
        taskManager.storeTask(task2);
        taskManager.storeTask(task3);
        taskManager.storeTask(task4);

        //Userhez rendelés taskid alapján
        taskManager.assignTaskByID(user1, 100);
        taskManager.assignTaskByID(user1, 101);

        //User feladatainak listázása
        taskManager.listUserTasks(user1);

        //Tesztek:
        //Status lekérdezése:
        System.out.println();
        System.out.println(task1.getStatus());
        //Dátum alapján update
        taskManager.updateStatus();
        System.out.println(task1.getStatus());
        //manuális update
        taskManager.updateStatus(task1, Status.DONE);
        System.out.println(task1.getStatus());
        //Overdue projektek:
        System.out.println();
        taskManager.listOverdueTasks();
    }
}

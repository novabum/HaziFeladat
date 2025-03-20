package TaskManager;

import java.time.LocalDate;

abstract class Task implements TaskInterface{
    String title;
    String desc;
    LocalDate dueDate;
    Enum<Status> status;
    Integer id;

    public Task(String title, String desc, LocalDate dueDate, Enum<Status> status, Integer id) {
        this.title = title;
        this.desc = desc;
        this.dueDate = dueDate;
        this.status = status;
        this.id = id;
    }

}

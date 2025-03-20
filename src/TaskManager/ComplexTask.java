package TaskManager;

import java.time.LocalDate;

public class ComplexTask extends Task implements TaskInterface {

    public ComplexTask(String title, String desc, LocalDate dueDate, Enum<Status> status, Integer id) {
        super(title, desc, dueDate, status, id);
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public Enum<Status> getStatus() {
        return status;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setStatus(Enum<Status> status) {
        this.status = status;
    }
}


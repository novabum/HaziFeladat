package TaskManager;

import java.time.LocalDate;

public interface TaskInterface {
    Integer getID();
    String getTitle();
    LocalDate getDueDate();
    void setStatus(Enum<Status> status);
    Enum<Status> getStatus();
    Integer getId();





}
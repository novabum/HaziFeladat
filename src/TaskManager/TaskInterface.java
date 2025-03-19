package TaskManager;

public interface TaskInterface {

    //    Ha nem Done és ma > dutedate -> Status -> OverDue
    void updateStatus();
    void updateStatus(Status status);

}

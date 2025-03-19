package TaskManager;

import java.util.Date;

abstract class TaskParent {
    String title;
    String desc;
    Date dueDate;
    Enum<Status> status;
    Integer id;
}

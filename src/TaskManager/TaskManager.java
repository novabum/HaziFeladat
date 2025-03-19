package TaskManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    private List<TaskParent> tasks = new ArrayList<>();
    private Map<OrdinaryUser, List<TaskParent>> userTasks = new HashMap<>();

    public void listTasks(){
        System.out.println();
    }

    public void assignToUserByTaskId(Integer taskID){
        System.out.println();
    }

    public void printOverdueTasks(){
        System.out.println();
    }

    public void printUnassignedTasks(){
        System.out.println();
    }

}

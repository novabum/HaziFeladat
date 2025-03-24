package StudyRoomver2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeStorage {
    private final Map<ClassEnum, List<Integer>> gradeStorage;


    public GradeStorage() {
        gradeStorage = new HashMap<>();
    }


    public void addClassAndGrade(ClassEnum schoolClass, Integer grade) {
        if (!gradeStorage.containsKey(schoolClass)) {
            gradeStorage.put(schoolClass, new ArrayList<>());
            gradeStorage.get(schoolClass).add(grade);
        } else gradeStorage.get(schoolClass).add(grade);
    }

}

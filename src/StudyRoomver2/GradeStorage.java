package StudyRoomver2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeStorage {
    private final Map<SubjectEnum, List<Integer>> gradeStorage;

    public GradeStorage() {
        gradeStorage = new HashMap<>();
    }

    public Map<SubjectEnum, List<Integer>> getGradeStorage() {
        return gradeStorage;
    }

    public void addSubjectAndGrade(SubjectEnum subjectEnum, Integer grade) {
        if (!gradeStorage.containsKey(subjectEnum)) {
            gradeStorage.put(subjectEnum, new ArrayList<>());
            gradeStorage.get(subjectEnum).add(grade);
        } else gradeStorage.get(subjectEnum).add(grade);
    }

    public void printClassesAndGrades(GradeStorage storageOfStudent){
        Map<SubjectEnum, List<Integer>> storedClassesAndGrades = storageOfStudent.getGradeStorage();
        for (SubjectEnum subject : storedClassesAndGrades.keySet()){
            System.out.println(subject.toString());
            storedClassesAndGrades.get(subject).forEach(System.out::println);
        }
    }

}

package StudyRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeTracker {
    private final Map<Student, Map<ClassEnum, List<Integer>>> grades = new HashMap<>();

    public void newGradeForStudent(Student student, ClassEnum schoolClass, Integer grade) {
        if (!grades.containsKey(student)) {
            addToMapFromScratch(student, schoolClass, grade);
            System.out.println("New Student " + student.getName() + ". New " + schoolClass + " grade added");
        } else {
            addToExistingStudent(student, schoolClass, grade);
        }
    }

    private void addToExistingStudent(Student student, ClassEnum schoolClass, Integer grade) {
        if (grades.get(student).containsKey(schoolClass)) {
            grades.get(student).get(schoolClass).add(grade);
            System.out.println("New " + schoolClass + " grade added for " + student.getName());
        } else {
            Map<ClassEnum, List<Integer>> classGrades = new HashMap<>();
            grades.get(student).put(schoolClass, new ArrayList<>());
            grades.get(student).get(schoolClass).add(grade);
        }
    }

    private void addToMapFromScratch(Student student, ClassEnum schoolClass, Integer grade) {
        Map<ClassEnum, List<Integer>> classGrades = new HashMap<>();
        classGrades.put(schoolClass, new ArrayList<>());
        grades.put(student, classGrades);
        grades.get(student).get(schoolClass).add(grade);
    }

    //! hibákat nem kezeltem le.
    public void printStudentGradesByName(String studentName) {
        Student student = grades.keySet().stream().filter(e -> e.getName().equals(studentName)).findFirst().orElse(null);
        if (grades.containsKey(student)) {
            Map<ClassEnum, List<Integer>> studentGrades = grades.get(student); // javítani, mert már list van a második mapben!!!
            System.out.println("Name: " + student.getName());
            for (Map.Entry<ClassEnum, List<Integer>> entry : studentGrades.entrySet()) {
                System.out.println("Class: " + entry.getKey() + ", Grade: " + entry.getValue());
            }
        } else System.out.println("No student can be found by that name.");
    }


}

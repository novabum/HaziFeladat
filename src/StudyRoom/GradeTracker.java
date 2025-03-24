package StudyRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeTracker {
    private final Map<Student, Map<Subject, List<Integer>>> grades = new HashMap<>();


    public void newGradeForStudent(Student student, Subject schoolClass, Integer grade) {
        if (!grades.containsKey(student)) {
            addToMapFromScratch(student, schoolClass, grade);
            System.out.println("New Student " + student.getName() + ". New " + schoolClass + " grade added");
        } else {
            addToExistingStudent(student, schoolClass, grade);
        }
    }

    private void addToExistingStudent(Student student, Subject schoolClass, Integer grade) {
        if (grades.get(student).containsKey(schoolClass)) {
            grades.get(student).get(schoolClass).add(grade);
            System.out.println("New " + schoolClass + " grade added for " + student.getName());
        } else {
            Map<Subject, List<Integer>> classGrades = new HashMap<>();
            grades.get(student).put(schoolClass, new ArrayList<>());
            grades.get(student).get(schoolClass).add(grade);
        }
    }

    private void addToMapFromScratch(Student student, Subject schoolClass, Integer grade) {
        Map<Subject, List<Integer>> classGrades = new HashMap<>();
        classGrades.put(schoolClass, new ArrayList<>());
        grades.put(student, classGrades);
        grades.get(student).get(schoolClass).add(grade);
    }

    //! exceptionoket nem kezeltem le.
    public void printStudentGradesByName(String studentName) {
        Student student = grades.keySet().stream().filter(e -> e.getName().equals(studentName)).findFirst().orElse(null);
        if (student != null && grades.containsKey(student)) {
            Map<Subject, List<Integer>> studentGrades = grades.get(student);
            System.out.println("Name: " + student.getName());
            for (Map.Entry<Subject, List<Integer>> entry : studentGrades.entrySet()) {
                System.out.println("Class: " + entry.getKey() + ", Grade: " + entry.getValue());
            }
        } else System.out.println("No student can be found by that name.");
    }

}

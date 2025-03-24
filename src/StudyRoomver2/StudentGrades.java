package StudyRoomver2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {
    private final Map<Student, GradeStorage> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public boolean existingStudent(Student student) {
        return studentGrades.containsKey(student);
    }

    public void addStudentAndGrades(Student student, ClassEnum schoolClass, Integer grade) {
        GradeStorage gradeStorage = new GradeStorage();
        gradeStorage.addClassAndGrade(schoolClass, grade);
        studentGrades.put(student, gradeStorage);
    }

    public void addGradeToExistingStudent(Student student, ClassEnum schoolclass, Integer grade) {
        studentGrades.get(student).addClassAndGrade(schoolclass, grade);
    }

    public boolean weHaveStudentNamed(String studentName) {
        Student student = studentGrades.keySet().stream()
                .filter(st -> st.getName().equals(studentName))
                .findFirst()
                .orElse(null);
        return student != null;
    }
}

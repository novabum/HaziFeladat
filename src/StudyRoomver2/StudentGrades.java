package StudyRoomver2;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private final Map<Student, GradeStorage> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    public boolean existingStudent(Student student) {
        return studentGrades.containsKey(student);
    }

    public void addStudentAndGrades(Student student, SubjectEnum subjectEnum, Integer grade) {
        GradeStorage gradeStorage = new GradeStorage();
        gradeStorage.addSubjectAndGrade(subjectEnum, grade);
        studentGrades.put(student, gradeStorage);
    }

    public void addGradeToExistingStudent(Student student, SubjectEnum subjectEnum, Integer grade) {
        studentGrades.get(student).addSubjectAndGrade(subjectEnum, grade);
    }

    public boolean isStudentNamedExist(String studentName) {
        Student student = studentGrades.keySet().stream()
                .filter(st -> st.getName().equals(studentName))
                .findFirst()
                .orElse(null);
        return student != null;
    }

    public GradeStorage getClassesOfStudent(String studentName) {
        Student thisStudent = studentGrades.keySet().stream()
                .filter(e -> e.getName().equals(studentName))
                .findFirst()
                .orElse(null);
        return studentGrades.get(thisStudent);
    }
}

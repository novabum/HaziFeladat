package StudyRoom;

public class Main {
    public static void main(String[] args) {

    Student st1 = new Student("Jani", 454);
    Student st2 = new Student("Bence", 666);

    GradeTracker gradeTracker = new GradeTracker();

    gradeTracker.newGradeForStudent(st1, ClassEnum.Biology, 4);
    gradeTracker.newGradeForStudent(st1, ClassEnum.French, 4);
    gradeTracker.newGradeForStudent(st1, ClassEnum.Math, 1);
    gradeTracker.newGradeForStudent(st1, ClassEnum.Math, 3);
    gradeTracker.newGradeForStudent(st1, ClassEnum.Math, 2);
    gradeTracker.newGradeForStudent(st1, ClassEnum.French, 1);
    gradeTracker.newGradeForStudent(st1, ClassEnum.Biology, 4);
    gradeTracker.newGradeForStudent(st1, ClassEnum.Biology, 3);

    gradeTracker.printStudentGradesByName("Jani");

    }
}

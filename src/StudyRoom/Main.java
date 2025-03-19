package StudyRoom;

public class Main {
    public static void main(String[] args) {

        //ezzel durván belementem. Mapben map, amiben Enum és List. Hát mi folyik itt Gyöngyösön?
        Student st1 = new Student("Jani", 454);
        Student st2 = new Student("Bence", 666);

        GradeTracker gradeTracker = new GradeTracker();

        gradeTracker.newGradeForStudent(st1, ClassEnum.BIOLOGY, 4);
        gradeTracker.newGradeForStudent(st1, ClassEnum.FRENCH, 4);
        gradeTracker.newGradeForStudent(st1, ClassEnum.MATH, 1);
        gradeTracker.newGradeForStudent(st1, ClassEnum.MATH, 3);
        gradeTracker.newGradeForStudent(st1, ClassEnum.MATH, 2);
        gradeTracker.newGradeForStudent(st1, ClassEnum.FRENCH, 1);
        gradeTracker.newGradeForStudent(st1, ClassEnum.BIOLOGY, 4);
        gradeTracker.newGradeForStudent(st1, ClassEnum.BIOLOGY, 3);

        gradeTracker.newGradeForStudent(st2, ClassEnum.BIOLOGY, 4);
        gradeTracker.newGradeForStudent(st2, ClassEnum.FRENCH, 4);
        gradeTracker.newGradeForStudent(st2, ClassEnum.MATH, 1);
        gradeTracker.newGradeForStudent(st2, ClassEnum.MATH, 3);
        gradeTracker.newGradeForStudent(st2, ClassEnum.MATH, 2);
        gradeTracker.newGradeForStudent(st2, ClassEnum.FRENCH, 1);
        gradeTracker.newGradeForStudent(st2, ClassEnum.BIOLOGY, 4);
        gradeTracker.newGradeForStudent(st2, ClassEnum.BIOLOGY, 3);

        gradeTracker.printStudentGradesByName("Jani");
        gradeTracker.printStudentGradesByName("Bence");


    }
}

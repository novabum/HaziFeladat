package StudyRoomver2;

public class Main {
    public static void main(String[] args) {

        //ezzel durván belementem. Mapben map, amiben Enum és List. Hát mi folyik itt Gyöngyösön?
        Student st1 = new Student("Jani", 454);
        Student st2 = new Student("Bence", 666);

        GradeTracker gradeTracker = new GradeTracker();

        gradeTracker.newGradeForStudent(st1, SubjectEnum.BIOLOGY, 4);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.FRENCH, 4);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.MATH, 1);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.MATH, 3);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.MATH, 2);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.FRENCH, 1);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.BIOLOGY, 4);
        gradeTracker.newGradeForStudent(st1, SubjectEnum.BIOLOGY, 3);

        gradeTracker.newGradeForStudent(st2, SubjectEnum.BIOLOGY, 1);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.FRENCH, 1);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.MATH, 2);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.MATH, 1);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.MATH, 1);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.FRENCH, 5);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.BIOLOGY, 2);
        gradeTracker.newGradeForStudent(st2, SubjectEnum.BIOLOGY, 3);

        gradeTracker.printStudentGradesByName("Jani");
        gradeTracker.printStudentGradesByName("Bence");


    }
}

package StudyRoomver2;

public class GradeTracker {

    StudentGrades studentGrades = new StudentGrades();

    public void newGradeForStudent(Student student, ClassEnum schoolClass, Integer grade) {
        if (!studentGrades.existingStudent(student)) {
            studentGrades.addStudentAndGrades(student, schoolClass, grade);
        } else
            studentGrades.addGradeToExistingStudent(student, schoolClass, grade);
    }

//    public void printStudentGradesByName(String studentName) {
//        if (studentGrades.weHaveStudentNamed(studentName)){
//
//        } else System.out.println("Student cannot be found");
//
//    }

    //    public void printStudentGradesByName(String studentName) {
//        Student student = grades.keySet().stream().filter(e -> e.getName().equals(studentName)).findFirst().orElse(null);
//        if (student != null && grades.containsKey(student)) {
//            Map<ClassEnum, List<Integer>> studentGrades = grades.get(student);
//            System.out.println("Name: " + student.getName());
//            for (Map.Entry<ClassEnum, List<Integer>> entry : studentGrades.entrySet()) {
//                System.out.println("Class: " + entry.getKey() + ", Grade: " + entry.getValue());
//            }
//        } else System.out.println("No student can be found by that name.");
//    }

//        if (!grades.containsKey(student)) {
//            addToMapFromScratch(student, schoolClass, grade);
//            System.out.println("New Student " + student.getName() + ". New " + schoolClass + " grade added");
//        } else {
//            addToExistingStudent(student, schoolClass, grade);
//        }
//    }
//
//    private void addToExistingStudent(Student student, ClassEnum schoolClass, Integer grade) {
//        if (grades.get(student).containsKey(schoolClass)) {
//            grades.get(student).get(schoolClass).add(grade);
//            System.out.println("New " + schoolClass + " grade added for " + student.getName());
//        } else {
//            Map<ClassEnum, List<Integer>> classGrades = new HashMap<>();
//            grades.get(student).put(schoolClass, new ArrayList<>());
//            grades.get(student).get(schoolClass).add(grade);
//        }
//    }
//
//    private void addToMapFromScratch(Student student, ClassEnum schoolClass, Integer grade) {
//        Map<ClassEnum, List<Integer>> classGrades = new HashMap<>();
//        classGrades.put(schoolClass, new ArrayList<>());
//        grades.put(student, classGrades);
//        grades.get(student).get(schoolClass).add(grade);
//    }
//
//    //! exceptionoket nem kezeltem le.


}

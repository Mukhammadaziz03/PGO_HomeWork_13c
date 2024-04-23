import java.util.ArrayList;

public class Students {
    private static ArrayList<Student> studentList = new ArrayList<>();

    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Index Number: " + student.getIndexNumber());
            // Print other information about the student
        }
    }

    public static void addStudent(Student student) {
        studentList.add(student);
    }
}

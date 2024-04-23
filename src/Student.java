import java.util.Date;
import java.util.ArrayList;

public class Student {
    private static int nextIndexNumber = 1;

    private int indexNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthdate;
    private String status;
    private Studies studies;
    private int currentSemester;
    private ArrayList<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date birthdate) {
        this.indexNumber = nextIndexNumber++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.status = "Candidate";
        this.grades = new ArrayList<>();
    }

    public void enrollStudent(Studies studies) {
        this.studies = studies;
        this.currentSemester = 1;
    }

    public void addGrade(int grade, String subject) {
        grades.add(new Grade(grade, subject));
    }

    public void promoteToNextSemester() {
        if (currentSemester < studies.getNumberOfSemesters()) {
            currentSemester++;
        } else {
            status = "Graduate";
        }
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    // Other getters and setters for student information
}

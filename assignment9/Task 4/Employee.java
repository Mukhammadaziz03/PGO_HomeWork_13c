import java.util.Calendar;

public class Employee extends Person {
    private final int hireDate;
    private final String companyName;
    private final double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return Calendar.getInstance().get(Calendar.YEAR) - hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
import java.util.Calendar;

public abstract class Person {
    protected final String firstName;
    protected final String lastName;
    protected final int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthdayYear;
    }
}
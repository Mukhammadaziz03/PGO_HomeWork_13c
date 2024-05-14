public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isGuest;

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isGuest = false;
    }

    public User(String email) {
        this.email = email;
        this.isGuest = true;
    }
    public void displayInfo(){
        System.out.println("User info: ");
        System.out.println(getEmail());
    }


    public void createAccount(String name, String lastName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.isGuest = false;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isGuest() {
        return isGuest;
    }
}
package oops.abstraction;

public class Admin implements User {

    public static void main(String[] args) {
        var a = new Admin();
        a.setFirstName("John");
        a.setLastName("Doe");
        a.whoami();
    }
    
    private String firstName;
    private String lastName;

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String myFullName() {
        return firstName + " " + lastName;
    }

}

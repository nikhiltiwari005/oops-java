package oops.encapsulation;

public class Example1 {
    private String firstName;
    private String lastName;

    public static void main(String[] args) {
        Example1 e = new Example1();
        e.setFirstName("John");
        e.setLastName("Doe");

        System.out.println(e.getFullName());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
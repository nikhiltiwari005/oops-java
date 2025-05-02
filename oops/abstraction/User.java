package oops.abstraction;

public interface User {
    
    default String whoami() {
        System.out.println(myFullName());
        return myFullName();
    }

    public String myFullName();

}

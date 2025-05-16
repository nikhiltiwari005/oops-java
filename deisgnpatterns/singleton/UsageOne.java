package deisgnpatterns.singleton;

public class UsageOne {

    public static void main(String[] args) {
        DatabaseConnection.getInstance();
        DatabaseConnection.getInstance();

        // Output:
        // Connected to DB!

        // "Connected to DB!" is printed only once now matter how many times you call the method.
        // Simple but naive solution. because in a concurrent/parallel system this will fail.
    }
}

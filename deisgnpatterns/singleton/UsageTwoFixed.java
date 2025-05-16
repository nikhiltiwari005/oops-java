package deisgnpatterns.singleton;

public class UsageTwoFixed {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            new Thread(() -> DatabaseConnection.getInstanceWithSynchronized()).start();
        }

        // Output:
        // Connected to DB!
        // "Connected to DB!" printed only once because of synchronized only one thread can enter or access that method at a time.
    }
}

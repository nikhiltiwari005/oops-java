package deisgnpatterns.singleton;

public class UsageTwo {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            new Thread(() -> DatabaseConnection.getInstance()).start();
        }
        // Output:
        // Connected to DB!
        // Connected to DB!
        // Connected to DB!
        // Connected to DB!
        // Connected to DB!
        // Connected to DB!
        // Connected to DB!
        // Connected to DB!
        // Above code will print multiple "Connected to DB!". Reason, because in parallel execution, there will be states
        // inside threads where, an object might not have been instantiated. So, those threads created their own objects.

    }
}

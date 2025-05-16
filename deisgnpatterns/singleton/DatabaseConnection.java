package deisgnpatterns.singleton;

import java.util.Objects;

public class DatabaseConnection {

    private static DatabaseConnection db;

    {
        System.out.println("Connected to DB!");
    }

    public static DatabaseConnection getInstance() {
        if (Objects.isNull(DatabaseConnection.db)) {
            DatabaseConnection.db = new DatabaseConnection();
        }
        return DatabaseConnection.db;
    }

    public synchronized static DatabaseConnection getInstanceWithSynchronized() {
        if (Objects.isNull(DatabaseConnection.db)) {
            DatabaseConnection.db = new DatabaseConnection();
        }
        return DatabaseConnection.db;
    }
}

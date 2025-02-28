public class LazySingleton {
    // Declare the instance variable
    private static LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton() {
        System.out.println("Lazy Singleton Instance Created");
    }

    // Public method to provide access to the instance
    public static synchronized LazySingleton getInstance() {
        // Create the instance when it is first needed
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Lazy loading: instance is created only when called
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        // Both should point to the same instance
        System.out.println(instance1 == instance2);  // Output: true
    }
}


// update
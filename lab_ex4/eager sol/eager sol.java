public class EagerSingleton {
    // Eagerly create the instance when the class is loaded
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
        System.out.println("Eager Singleton Instance Created");
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Eager loading: instance is created when class is loaded
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        // Both should point to the same instance
        System.out.println(instance1 == instance2);  // Output: true
    }
}


// uploadd 
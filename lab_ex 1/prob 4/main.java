class One {
    // Parameterized constructor
    public One(int x) {
        System.out.println("One's constructor with value: " + x);
    }
}

class Two extends One {
    // Constructor for class Two
    public Two(int x) {
        // Explicitly call the parent class constructor with an argument
        super(x);
        System.out.println("Two's constructor");
    }
}

public class main {
    public static void main(String[] args) {
        // Create an instance of class Two, passing an integer value
        Two obj = new Two(5);
    }
}

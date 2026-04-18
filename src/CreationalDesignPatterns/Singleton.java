package CreationalDesignPatterns;

/**
 * Singleton Design Pattern
 * Singleton ensures only ONE object of a class can be created anywhere in the program.
 * Useful for: Database connections, Logger, Configuration
 * Real-life example: Your phone has only one battery, not multiple
 */
public class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;
    // Private constructor - prevents creating new objects with 'new' keyword
    private Singleton() {
    }

    // Public method to get the single instance
    public static Singleton getInstance() {
        // If instance doesn't exist, create it only once
        if (instance == null) {
            instance = new Singleton();
        }
        // Return the same instance every time
        return instance;
    }

    public void displayMessage() {
        System.out.println("Welcome to the Singleton Design Pattern!");
    }

    public static void main(String[] args) {
        // Create first instance
        Singleton obj1 = Singleton.getInstance();
        // Create second instance
        Singleton obj2 = Singleton.getInstance();
        // Both obj1 and obj2 are the SAME object
        System.out.println("Are obj1 and obj2 same? " + (obj1 == obj2));
        obj1.displayMessage();
    }
}

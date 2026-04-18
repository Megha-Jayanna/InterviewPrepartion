package CreationalDesignPatterns;

/**
 * Factory Method Design Pattern
 * Instead of creating objects directly with 'new', we use a factory method
 * The factory method decides which type of object to create based on input
 * Real-life example: Ordering food - you say "give me Burger" instead of making it yourself
 */

public class FactoryMethod {

    // Simple factory method
    public static String getFood(String type) {
        if (type.equals("Burger")) {
            return "Delicious Burger";
        } else if (type.equals("Pizza")) {
            return "Hot Pizza";
        } else if (type.equals("Biryani")) {
            return "Fragrant Biryani";
        }
        return "Unknown Food";
    }

    public static void main(String[] args) {
        // Without factory - you would do: new Burger(), new Pizza() etc (bad)
        // With factory - just ask factory to give you food (good)

        String food1 = FactoryMethod.getFood("Burger");
        System.out.println("Order 1: " + food1);

        String food2 = FactoryMethod.getFood("Pizza");
        System.out.println("Order 2: " + food2);

        String food3 = FactoryMethod.getFood("Biryani");
        System.out.println("Order 3: " + food3);
    }
}

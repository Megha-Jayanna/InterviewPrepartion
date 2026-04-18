package CreationalDesignPatterns;

/**
 * Abstract Factory Design Pattern
 * Abstract Factory creates families of related objects
 * One factory creates different products together
 * Real-life example: Car manufacturer -
 * Ferrari factory makes Ferrari cars,
 * BMW factory makes BMW cars - each factory makes its own products
 */

public class AbstractFactory {

    // Factory that creates Car objects
    public static String createCar(String brand, String model) {
        if (brand.equals("Ferrari")) {
            if (model.equals("Sports")) {
                return "🏎️  Ferrari F8 Tributo - Ultra Fast";
            } else if (model.equals("SUV")) {
                return "🚙 Ferrari FF - Luxury SUV";
            }
        } else if (brand.equals("BMW")) {
            if (model.equals("Sports")) {
                return "🏎️  BMW M440i - Fast & Sporty";
            } else if (model.equals("SUV")) {
                return "🚙 BMW X7 - Luxury SUV";
            }
        }
        return "Unknown Car";
    }

    public static void main(String[] args) {
        // Ferrari factory creates Ferrari cars
        String car1 = AbstractFactory.createCar("Ferrari", "Sports");
        System.out.println(car1);

        String car2 = AbstractFactory.createCar("Ferrari", "SUV");
        System.out.println(car2);

        // BMW factory creates BMW cars
        String car3 = AbstractFactory.createCar("BMW", "Sports");
        System.out.println(car3);

        String car4 = AbstractFactory.createCar("BMW", "SUV");
        System.out.println(car4);
    }
}

package StructuralDesignPatterns;

/**
 * Decorator Design Pattern - SIMPLE Demon Slayer Example
 * Decorator adds new functionality to objects dynamically
 * Example: Adding power-ups to Demon Slayers
 */

public class DecoratorPattern {

    // Component interface
    interface DemonSlayer {
        void display();
    }

    // Concrete component
    static class BaseSlayer implements DemonSlayer {
        private String name;

        public BaseSlayer(String name) {
            this.name = name;
        }

        @Override
        public void display() {
            System.out.println("Demon Slayer: " + name);
        }
    }

    // Decorator - adds power-ups
    static class PowerUpDecorator implements DemonSlayer {
        private DemonSlayer slayer;
        private String powerUp;

        public PowerUpDecorator(DemonSlayer slayer, String powerUp) {
            this.slayer = slayer;
            this.powerUp = powerUp;
        }

        @Override
        public void display() {
            slayer.display();
            System.out.println("+ " + powerUp);
        }
    }

    public static void main(String[] args) {
        // Base slayer
        DemonSlayer tanjiro = new BaseSlayer("Tanjiro");
        tanjiro.display();

        // Add power-up
        tanjiro = new PowerUpDecorator(tanjiro, "Strength Boost");
        tanjiro.display();

        // Add another power-up
        tanjiro = new PowerUpDecorator(tanjiro, "Speed Boost");
        tanjiro.display();
    }
}

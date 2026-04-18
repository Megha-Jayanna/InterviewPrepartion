package StructuralDesignPatterns;

/**
 * Bridge Design Pattern - SIMPLE Demon Slayer Example
 * Bridge decouples abstraction from implementation
 * Example: Different Demon Slayers with different Breathing Styles
 */

public class BridgePattern {

    // Implementor interface
    interface BreathingStyle {
        void perform();
    }

    // Concrete implementors
    static class WaterBreathing implements BreathingStyle {
        @Override
        public void perform() {
            System.out.println("💧 Water Breathing - Flowing Technique");
        }
    }

    static class FlameBreathing implements BreathingStyle {
        @Override
        public void perform() {
            System.out.println("🔥 Flame Breathing - Burning Technique");
        }
    }

    // Abstraction
    static abstract class DemonSlayer {
        protected BreathingStyle breathing;

        public DemonSlayer(BreathingStyle breathing) {
            this.breathing = breathing;
        }

        abstract void fight();
    }

    // Refined abstraction
    static class RegularSlayer extends DemonSlayer {
        public RegularSlayer(BreathingStyle breathing) {
            super(breathing);
        }

        @Override
        void fight() {
            System.out.print("Regular Slayer: ");
            breathing.perform();
        }
    }

    public static void main(String[] args) {
        // Different combinations
        DemonSlayer tanjiro = new RegularSlayer(new WaterBreathing());
        tanjiro.fight();

        DemonSlayer rengoku = new RegularSlayer(new FlameBreathing());
        rengoku.fight();
    }
}

package BehavioralDesignPatterns;

/**
 * Strategy Design Pattern - SIMPLE Demon Slayer Example
 * Strategy defines interchangeable algorithms
 * Example: Different breathing techniques as strategies
 */

public class StrategyPattern {

    // Strategy interface
    interface BreathingStrategy {
        void perform();
    }

    // Concrete strategies
    static class WaterBreathing implements BreathingStrategy {
        @Override
        public void perform() {
            System.out.println("💧 Water Breathing - Flowing attack");
        }
    }

    static class FlameBreathing implements BreathingStrategy {
        @Override
        public void perform() {
            System.out.println("🔥 Flame Breathing - Burning attack");
        }
    }

    // Context class
    static class DemonSlayer {
        private BreathingStrategy strategy;

        public void setStrategy(BreathingStrategy strategy) {
            this.strategy = strategy;
        }

        public void attack() {
            strategy.perform();
        }
    }

    public static void main(String[] args) {
        DemonSlayer tanjiro = new DemonSlayer();

        tanjiro.setStrategy(new WaterBreathing());
        tanjiro.attack();

        tanjiro.setStrategy(new FlameBreathing());
        tanjiro.attack();
    }
}

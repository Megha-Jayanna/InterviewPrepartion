package BehavioralDesignPatterns;

/**
 * Template Method Pattern - Demon Slayer Example (SIMPLE)
 * Defines skeleton of algorithm, subclasses implement details
 * Example: Training process - warmup → practice → test
 */

public class TemplateMethodPattern {

    public static abstract class TrainingProgram {
        public final void train() {
            warmUp();
            practice();
            test();
        }

        public void warmUp() {
            System.out.println("⚡ Warming up...");
        }

        abstract public void practice();

        abstract public void test();
    }

    public static class WaterBreathingTraining extends TrainingProgram {
        @Override
        public void practice() {
            System.out.println("💧 Practicing Water Breathing technique");
        }

        @Override
        public void test() {
            System.out.println("✅ Testing Water Breathing combat");
        }
    }

    public static class FlameBreathingTraining extends TrainingProgram {
        @Override
        public void practice() {
            System.out.println("🔥 Practicing Flame Breathing technique");
        }

        @Override
        public void test() {
            System.out.println("✅ Testing Flame Breathing combat");
        }
    }

    public static void main(String[] args) {
        TrainingProgram waterTraining = new WaterBreathingTraining();
        waterTraining.train();

        System.out.println();

        TrainingProgram flameTraining = new FlameBreathingTraining();
        flameTraining.train();
    }
}


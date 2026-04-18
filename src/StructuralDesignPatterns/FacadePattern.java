package StructuralDesignPatterns;

/**
 * Facade Design Pattern - SIMPLE Demon Slayer Example
 * Facade provides simplified interface to complex subsystems
 * Example: Headquarters handles all mission coordination
 */

public class FacadePattern {

    // Subsystems
    static class Mission {
        public void plan() {
            System.out.println("📋 Planning mission...");
        }
    }

    static class Training {
        public void train() {
            System.out.println("🥋 Training slayers...");
        }
    }

    static class Weapons {
        public void craft() {
            System.out.println("⚒️ Crafting swords...");
        }
    }

    // Facade class
    static class Headquarters {
        private Mission mission = new Mission();
        private Training training = new Training();
        private Weapons weapons = new Weapons();

        public void launchMission() {
            mission.plan();
            training.train();
            weapons.craft();
            System.out.println("✅ Mission Ready!");
        }
    }

    public static void main(String[] args) {
        Headquarters hq = new Headquarters();
        hq.launchMission();
    }
}

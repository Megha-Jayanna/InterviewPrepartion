package BehavioralDesignPatterns;

/**
 * Visitor Pattern - SIMPLE Demon Slayer Example
 * Visitor performs operations on elements without changing their classes
 * Example: Different actions on Demon Slayers
 */

public class VisitorPattern {

    // Visitor interface
    interface DemonSlayerVisitor {
        void visit(String slayerName);
    }

    // Element interface
    interface DemonSlayer {
        void accept(DemonSlayerVisitor visitor);
    }

    // Concrete elements
    static class Tanjiro implements DemonSlayer {
        @Override
        public void accept(DemonSlayerVisitor visitor) {
            visitor.visit("Tanjiro");
        }
    }

    static class Zenitsu implements DemonSlayer {
        @Override
        public void accept(DemonSlayerVisitor visitor) {
            visitor.visit("Zenitsu");
        }
    }

    // Concrete visitors
    static class TrainingVisitor implements DemonSlayerVisitor {
        @Override
        public void visit(String slayerName) {
            System.out.println("🥋 Training " + slayerName);
        }
    }

    static class BattleVisitor implements DemonSlayerVisitor {
        @Override
        public void visit(String slayerName) {
            System.out.println("⚔️ " + slayerName + " fighting!");
        }
    }

    public static void main(String[] args) {
        DemonSlayer tanjiro = new Tanjiro();
        DemonSlayer zenitsu = new Zenitsu();

        DemonSlayerVisitor trainer = new TrainingVisitor();
        DemonSlayerVisitor fighter = new BattleVisitor();

        tanjiro.accept(trainer);
        zenitsu.accept(trainer);

        tanjiro.accept(fighter);
        zenitsu.accept(fighter);
    }
}

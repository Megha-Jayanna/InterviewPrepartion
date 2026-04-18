package StructuralDesignPatterns;



/**
 * Adapter Design Pattern - SIMPLE Demon Slayer Example
 * Adapter converts interface of one class to another
 * Example: Demon Slayer adapts to fight demons
 */

public class AdapterPattern {

    // Target interface - what we want
    interface DemonSlayer {
        void attack();
    }

    // Incompatible class - what we have
    static class Demon {
        public void demonAttack() {
            System.out.println("🔥 Demon attacks with dark powers!");
        }
    }

    // Adapter - makes Demon compatible with DemonSlayer
    static class DemonSlayerAdapter implements DemonSlayer {
        private Demon demon;

        public DemonSlayerAdapter(Demon demon) {
            this.demon = demon;
        }

        @Override
        public void attack() {
            // Adapt demon attack to slayer attack
            demon.demonAttack();
            System.out.println("⚔️ Tanjiro counters with Water Breathing!");
        }
    }

    public static void main(String[] args) {
        Demon demon = new Demon();
        DemonSlayer slayer = new DemonSlayerAdapter(demon);

        slayer.attack();
    }
}

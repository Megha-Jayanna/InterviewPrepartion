package BehavioralDesignPatterns;

/**
 * Memento Pattern - Demon Slayer Example (SIMPLE)
 * Captures and stores object state without violating encapsulation
 * Example: Saving Demon Slayer stats at different points
 */

public class MementoPattern {

    public static class Memento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public static class DemonSlayer {
        private String name;
        private int health;
        private int power;

        public DemonSlayer(String name, int health, int power) {
            this.name = name;
            this.health = health;
            this.power = power;
        }

        public void takeDamage(int damage) {
            health -= damage;
            System.out.println(name + " took damage. Health: " + health);
        }

        public Memento saveState() {
            return new Memento(name + "|Health:" + health + "|Power:" + power);
        }

        public void restoreState(Memento memento) {
            String state = memento.getState();
            String[] parts = state.split("\\|");
            health = Integer.parseInt(parts[1].split(":")[1]);
            power = Integer.parseInt(parts[2].split(":")[1]);
            System.out.println(name + " restored! Health: " + health + ", Power: " + power);
        }

        public void displayState() {
            System.out.println(name + " - Health: " + health + ", Power: " + power);
        }
    }

    public static void main(String[] args) {
        DemonSlayer tanjiro = new DemonSlayer("Tanjiro", 100, 80);
        tanjiro.displayState();

        Memento savedState = tanjiro.saveState();

        tanjiro.takeDamage(30);
        tanjiro.displayState();

        tanjiro.restoreState(savedState);
        tanjiro.displayState();
    }
}


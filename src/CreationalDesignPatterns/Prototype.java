package CreationalDesignPatterns;

/**
 * Prototype Design Pattern - Demon Slayer Example
 * Explanation: Prototype pattern creates new objects by copying (cloning) existing objects
 * Don't create from scratch - just copy an existing one and modify the copy
 * Creating new Demon Slayer characters by cloning existing ones
 */

public class Prototype {

    // Demon Slayer Character class
    public static class DemonSlayerCharacter implements Cloneable {
        private String name;
        private String breathingStyle;
        private String rank;

        // Constructor
        public DemonSlayerCharacter(String name, String breathingStyle, String rank) {
            this.name = name;
            this.breathingStyle = breathingStyle;
            this.rank = rank;
        }

        // Clone method - creates a copy
        @Override
        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setBreathingStyle(String breathingStyle) {
            this.breathingStyle = breathingStyle;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        // Display details
        public void display() {
            System.out.println("Name: " + name + ", Breathing Style: " + breathingStyle + ", Rank: " + rank);
        }
    }

    public static void main(String[] args) {
        // Create original character - Tanjiro Kamado
        DemonSlayerCharacter tanjiro = new DemonSlayerCharacter("Tanjiro Kamado", "Water Breathing", "Demon Slayer");
        System.out.println("Original Character:");
        tanjiro.display();

        // Clone the character
        DemonSlayerCharacter clone = (DemonSlayerCharacter) tanjiro.clone();
        System.out.println("\nCloned Character (before change):");
        clone.display();

        // Modify the clone - original stays the same
        clone.setName("Nezuko Kamado");
        clone.setBreathingStyle("Blood Demon Art");
        clone.setRank("Demon");

        System.out.println("\nAfter modifying clone:");
        System.out.println("Original Character (unchanged):");
        tanjiro.display();

        System.out.println("Modified Clone:");
        clone.display();
    }
}

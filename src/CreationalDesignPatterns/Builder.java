package CreationalDesignPatterns;

/**
 * Builder Design Pattern - Demon Slayer Example
 * Builder pattern creates objects step by step
 * Instead of passing many parameters, we set values one at a time
 * Real-life example: Building a Demon Slayer character - name → breathing style → rank
 * Each step is optional - you choose what you want
 */

public class Builder {

    // Demon Slayer Character class
    public static class DemonSlayerCharacter {
        private String name;
        private String breathingStyle;
        private String rank;
        // Constructor
        public DemonSlayerCharacter() {
        }
        // Setter methods - return 'this' for method chaining
        public DemonSlayerCharacter setName(String name) {
            this.name = name;
            return this;
        }
        public DemonSlayerCharacter setBreathingStyle(String breathingStyle) {
            this.breathingStyle = breathingStyle;
            return this;
        }
        public DemonSlayerCharacter setRank(String rank) {
            this.rank = rank;
            return this;
        }

        // Display character details
        public void display() {
            System.out.println("\n⚔️ Demon Slayer Character:");
            System.out.println("Name: " + name);
            System.out.println("Breathing Style: " + breathingStyle);
            System.out.println("Rank: " + rank);
        }
    }

    public static void main(String[] args) {
        // Build character 1 - Tanjiro Kamado
        DemonSlayerCharacter tanjiro = new DemonSlayerCharacter()
                .setName("Tanjiro Kamado")
                .setBreathingStyle("Water Breathing")
                .setRank("Demon Slayer");
        tanjiro.display();

        // Build character 2 - Zenitsu Agatsuma
        DemonSlayerCharacter zenitsu = new DemonSlayerCharacter()
                .setName("Zenitsu Agatsuma")
                .setBreathingStyle("Thunder Breathing")
                .setRank("Demon Slayer");
        zenitsu.display();

        // Build character 3 - Hashira level
        DemonSlayerCharacter rengoku = new DemonSlayerCharacter()
                .setName("Kyojuro Rengoku")
                .setBreathingStyle("Flame Breathing")
                .setRank("Flame Hashira");
        rengoku.display();
    }
}

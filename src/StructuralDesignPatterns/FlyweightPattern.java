package StructuralDesignPatterns;

/**
 * Flyweight Design Pattern - Demon Slayer Example (SIMPLE)
 * Flyweight shares common data to reduce memory usage
 * Example: Reusing breathing styles instead of creating new ones
 */

public class FlyweightPattern {

    public static class BreathingStyle {
        private String name;
        private String technique;

        public BreathingStyle(String name, String technique) {
            this.name = name;
            this.technique = technique;
        }

        public void display() {
            System.out.println("🌊 " + name + " - " + technique);
        }
    }

    // Flyweight factory - reuses breathing styles
    public static class BreathingStyleFactory {
        private static java.util.Map<String, BreathingStyle> styles = new java.util.HashMap<>();

        public static BreathingStyle getBreathingStyle(String name) {
            if (!styles.containsKey(name)) {
                if (name.equals("Water")) {
                    styles.put(name, new BreathingStyle("Water Breathing", "Flowing technique"));
                } else if (name.equals("Flame")) {
                    styles.put(name, new BreathingStyle("Flame Breathing", "Burning technique"));
                } else if (name.equals("Thunder")) {
                    styles.put(name, new BreathingStyle("Thunder Breathing", "Fast strikes"));
                }
            }
            return styles.get(name);
        }
    }

    public static void main(String[] args) {
        // Reusing the same Water Breathing object
        BreathingStyle style1 = BreathingStyleFactory.getBreathingStyle("Water");
        BreathingStyle style2 = BreathingStyleFactory.getBreathingStyle("Water");
        BreathingStyle style3 = BreathingStyleFactory.getBreathingStyle("Flame");

        System.out.println("Are style1 and style2 same object? " + (style1 == style2));

        style1.display();
        style2.display();
        style3.display();
    }
}


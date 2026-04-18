package StructuralDesignPatterns;

/**
 * Composite Design Pattern - Demon Slayer Example (SIMPLE)
 * Composite allows you to compose objects into tree structures
 * Example: Squad structure (Squads contain members and sub-squads)
 */

public class CompositePattern {

    // Simple squad class that can contain members and sub-squads
    public static class Squad {
        private String name;
        private java.util.List<Squad> subSquads = new java.util.ArrayList<>();

        public Squad(String name) {
            this.name = name;
        }

        public void addSubSquad(Squad squad) {
            subSquads.add(squad);
        }

        public void displayStructure(String indent) {
            System.out.println(indent + "🏢 " + name);
            for (Squad squad : subSquads) {
                squad.displayStructure(indent + "  ");
            }
        }
    }

    public static void main(String[] args) {
        Squad mainSquad = new Squad("Demon Slayer Corps");

        Squad waterSquad = new Squad("Water Breathing Squad");
        Squad flameSquad = new Squad("Flame Breathing Squad");
        Squad thunderSquad = new Squad("Thunder Breathing Squad");

        mainSquad.addSubSquad(waterSquad);
        mainSquad.addSubSquad(flameSquad);
        mainSquad.addSubSquad(thunderSquad);

        mainSquad.displayStructure("");
    }
}


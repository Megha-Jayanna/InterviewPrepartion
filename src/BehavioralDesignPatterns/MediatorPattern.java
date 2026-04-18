package BehavioralDesignPatterns;

/**
 * Mediator Pattern - SIMPLE Demon Slayer Example
 * Mediator centralizes communication between objects
 * Example: Hashira coordinates between Demon Slayers
 */

public class MediatorPattern {

    // Mediator interface
    interface Mediator {
        void sendMessage(String message, String sender);
    }

    // Concrete mediator
    static class HashiraMediator implements Mediator {
        private java.util.List<String> slayers = new java.util.ArrayList<>();

        public void addSlayer(String slayer) {
            slayers.add(slayer);
        }

        @Override
        public void sendMessage(String message, String sender) {
            System.out.println("🏯 Hashira broadcasting from " + sender + ": " + message);
            for (String slayer : slayers) {
                if (!slayer.equals(sender)) {
                    System.out.println("📢 " + slayer + " received: " + message);
                }
            }
        }
    }

    // Colleague class
    static class DemonSlayer {
        private String name;
        private Mediator mediator;

        public DemonSlayer(String name, Mediator mediator) {
            this.name = name;
            this.mediator = mediator;
        }

        public void sendMessage(String message) {
            mediator.sendMessage(message, name);
        }
    }

    public static void main(String[] args) {
        HashiraMediator hashira = new HashiraMediator();

        DemonSlayer tanjiro = new DemonSlayer("Tanjiro", hashira);
        DemonSlayer zenitsu = new DemonSlayer("Zenitsu", hashira);

        hashira.addSlayer("Tanjiro");
        hashira.addSlayer("Zenitsu");

        tanjiro.sendMessage("Demon spotted!");
        System.out.println();
        zenitsu.sendMessage("Covering the left flank!");
    }
}

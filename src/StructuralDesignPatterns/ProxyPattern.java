package StructuralDesignPatterns;

/**
 * Proxy Design Pattern - SIMPLE Demon Slayer Example
 * Proxy controls access to another object
 * Example: Trainee (Proxy) accessing Hashira training grounds
 */

public class ProxyPattern {

    // Subject interface
    interface Training {
        void access();
    }

    // Real subject
    static class HashiraTraining implements Training {
        @Override
        public void access() {
            System.out.println("✅ Advanced Hashira Training in progress!");
        }
    }

    // Proxy class
    static class TraineeProxy implements Training {
        private Training realTraining;
        private int rank;

        public TraineeProxy(int rank) {
            this.rank = rank;
        }

        @Override
        public void access() {
            if (rank >= 5) {
                if (realTraining == null) {
                    realTraining = new HashiraTraining();
                }
                realTraining.access();
            } else {
                System.out.println("❌ Access Denied! Rank: " + rank + " (Need 5+)");
            }
        }
    }

    public static void main(String[] args) {
        Training trainee1 = new TraineeProxy(3);
        trainee1.access();

        System.out.println();

        Training trainee2 = new TraineeProxy(6);
        trainee2.access();
    }
}

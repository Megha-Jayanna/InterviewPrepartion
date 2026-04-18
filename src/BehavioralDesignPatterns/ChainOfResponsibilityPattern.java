package BehavioralDesignPatterns;
/**
 * Chain of Responsibility - Chain passes requests through handlers until one handles it. Example: Demon Slayer command chain - Squad member → Officer → Hashira
 */
public class ChainOfResponsibilityPattern {
    // Handler interface
    interface Handler {
        void setNext(Handler next);
        void handle(String request, int level);
    }
    // Concrete handlers
    static class SquadMember implements Handler {
        private Handler next;

        @Override
        public void setNext(Handler next) {
            this.next = next;
        }
        @Override
        public void handle(String request, int level) {
            if (level == 1) {
                System.out.println("Squad Member: " + request);
            } else if (next != null) {
                next.handle(request, level - 1);
            }}}
    static class Officer implements Handler {
        private Handler next;

        @Override
        public void setNext(Handler next) {
            this.next = next;
        }
        @Override
        public void handle(String request, int level) {
            if (level == 2) {
                System.out.println("Officer: " + request);
            } else if (next != null) {
                next.handle(request, level - 1);
            }
        }
    }
    static class Hashira implements Handler {
        private Handler next;
        @Override
        public void setNext(Handler next) {
            this.next = next;
        }

        @Override
        public void handle(String request, int level) {
            if (level == 3) {
                System.out.println("Hashira: " + request);
            } else if (next != null) {
                next.handle(request, level - 1);
            }
        }
    }
    public static void main(String[] args) {
        Handler member = new SquadMember();
        Handler officer = new Officer();
        Handler hashira = new Hashira();
        member.setNext(officer);
        officer.setNext(hashira);
        // Pass request through chain
        member.handle("Defeat upper moon demon", 3);
    }
}

package BehavioralDesignPatterns;

/**
 * State Design Pattern - SIMPLE Demon Slayer Example
 * State changes object behavior based on internal state
 * Example: Demon Slayer states - Normal, Fighting, Injured
 */

public class StatePattern {

    // State interface
    interface State {
        void handle();
    }

    // Concrete states
    static class NormalState implements State {
        @Override
        public void handle() {
            System.out.println("Demon Slayer is standing normally");
        }
    }

    static class FightingState implements State {
        @Override
        public void handle() {
            System.out.println("Demon Slayer is fighting a demon!");
        }
    }

    static class InjuredState implements State {
        @Override
        public void handle() {
            System.out.println("Demon Slayer is injured and recovering");
        }
    }

    // Context class
    static class DemonSlayer {
        private State currentState;

        public DemonSlayer() {
            currentState = new NormalState();
        }

        public void setState(State state) {
            currentState = state;
        }

        public void performAction() {
            currentState.handle();
        }
    }

    public static void main(String[] args) {
        DemonSlayer tanjiro = new DemonSlayer();

        tanjiro.performAction(); // Normal

        tanjiro.setState(new FightingState());
        tanjiro.performAction(); // Fighting

        tanjiro.setState(new InjuredState());
        tanjiro.performAction(); // Injured
    }
}

package BehavioralDesignPatterns;

/**
 * Interpreter Pattern - SIMPLE Demon Slayer Example
 * Interpreter defines grammar and interpreter for language
 * Example: Interpreting breathing technique commands
 */

public class InterpreterPattern {

    // Expression interface
    interface Expression {
        String interpret();
    }

    // Terminal expressions
    static class BreathingExpression implements Expression {
        private String type;

        public BreathingExpression(String type) {
            this.type = type;
        }

        @Override
        public String interpret() {
            if (type.equals("Water")) {
                return "💧 Water Breathing Technique";
            } else if (type.equals("Flame")) {
                return "🔥 Flame Breathing Technique";
            }
            return "Unknown Technique";
        }
    }

    static class CommandExpression implements Expression {
        private String command;

        public CommandExpression(String command) {
            this.command = command;
        }

        @Override
        public String interpret() {
            return "Command: " + command;
        }
    }

    public static void main(String[] args) {
        Expression expr1 = new BreathingExpression("Water");
        Expression expr2 = new BreathingExpression("Flame");
        Expression expr3 = new CommandExpression("Attack Demon");

        System.out.println(expr1.interpret());
        System.out.println(expr2.interpret());
        System.out.println(expr3.interpret());
    }
}

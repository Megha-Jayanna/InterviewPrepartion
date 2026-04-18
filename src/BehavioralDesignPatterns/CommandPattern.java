package BehavioralDesignPatterns;

/**
 * Command Design Pattern - Demon Slayer Example
 * Command pattern encapsulates a request as an object
 * allowing you to parameterize clients with different requests
 * Real-life example: Demon Slayer commands - Attack, Defend, Run Away
 */

// Command interface
interface CommandInterface {
    void execute();
}

// Concrete commands
class AttackCommand implements CommandInterface {
    private String characterName;

    public AttackCommand(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void execute() {
        System.out.println(characterName + " executes ATTACK! ⚔️");
    }
}

class DefendCommand implements CommandInterface {
    private String characterName;

    public DefendCommand(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void execute() {
        System.out.println(characterName + " executes DEFEND! 🛡️");
    }
}

class RunAwayCommand implements CommandInterface {
    private String characterName;

    public RunAwayCommand(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void execute() {
        System.out.println(characterName + " executes RUN AWAY! 🏃");
    }
}

// Invoker class
class Battlefield {
    private CommandInterface command;

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        Battlefield battlefield = new Battlefield();

        // Execute different commands
        battlefield.setCommand(new AttackCommand("Tanjiro"));
        battlefield.executeCommand();

        battlefield.setCommand(new DefendCommand("Zenitsu"));
        battlefield.executeCommand();

        battlefield.setCommand(new RunAwayCommand("Inosuke"));
        battlefield.executeCommand();
    }
}



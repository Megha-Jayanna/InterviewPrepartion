# Design Patterns - Demon Slayer Edition 🔥⚔️

A comprehensive collection of **23 Gang of Four Design Patterns** (5 Creational + 7 Structural + 11 Behavioral) implemented with **Demon Slayer anime examples** for easy understanding.

---

## 📋 Table of Contents

1. [Creational Design Patterns](#creational-design-patterns)
2. [Structural Design Patterns](#structural-design-patterns)
3. [Behavioral Design Patterns](#behavioral-design-patterns)

---

## 🏗️ Creational Design Patterns

Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

### 5 Types of Creational Design Patterns:

| # | Pattern | File | Description |
|---|---------|------|-------------|
| 1 | **Singleton** | `Singleton.java` | Ensures only one instance of a class exists globally |
| 2 | **Factory Method** | `FactoryMethod.java` | Creates objects without specifying their exact classes |
| 3 | **Abstract Factory** | `AbstractFactory.java` | Creates families of related objects |
| 4 | **Builder** | `Builder.java` | Constructs complex objects step-by-step |
| 5 | **Prototype** | `Prototype.java` | Creates objects by cloning existing ones |

**Location:** `src/CreationalDesignPatterns/`

**Examples Used:**
- Singleton: Database connection instance
- Factory Method: Creating different foods
- Abstract Factory: Different car brands and models
- Builder: Building Demon Slayer characters with attributes
- Prototype: Cloning Demon Slayer characters

---

## 🏢 Structural Design Patterns

Structural patterns deal with object composition, creating relationships between entities to form larger structures.

### 7 Types of Structural Design Patterns:

| # | Pattern | File | Description |
|---|---------|------|-------------|
| 1 | **Adapter** | `AdapterPattern.java` | Converts interface of one class to another |
| 2 | **Decorator** | `DecoratorPattern.java` | Adds new functionality to objects dynamically |
| 3 | **Facade** | `FacadePattern.java` | Provides simplified interface to complex subsystems |
| 4 | **Bridge** | `BridgePattern.java` | Decouples abstraction from implementation |
| 5 | **Proxy** | `ProxyPattern.java` | Provides placeholder/surrogate for another object |
| 6 | **Composite** | `CompositePattern.java` | Composes objects into tree structures |
| 7 | **Flyweight** | `FlyweightPattern.java` | Shares common data to reduce memory usage |

**Location:** `src/StructuralDesignPatterns/`

**Examples Used:**
- Adapter: Demon Slayer adapting to fight demons
- Decorator: Adding power-ups to Demon Slayers
- Facade: Demon Slayer Corps Headquarters coordinating missions
- Bridge: Demon Slayers with different breathing styles
- Proxy: Trainee access control to training grounds
- Composite: Squad hierarchy structure
- Flyweight: Reusing breathing styles

---

## 🎯 Behavioral Design Patterns

Behavioral patterns focus on communication between objects, defining how objects interact and distribute responsibility.

### 11 Types of Behavioral Design Patterns:

| # | Pattern | File | Description |
|---|---------|------|-------------|
| 1 | **Strategy** | `StrategyPattern.java` | Defines interchangeable algorithms |
| 2 | **Observer** | `ObserverPattern.java` | Notifies multiple objects about state changes |
| 3 | **State** | `StatePattern.java` | Changes object behavior based on internal state |
| 4 | **Command** | `CommandPattern.java` | Encapsulates requests as objects |
| 5 | **Iterator** | `IteratorPattern.java` | Accesses elements of collection sequentially |
| 6 | **Chain of Responsibility** | `ChainOfResponsibilityPattern.java` | Passes requests through handler chain |
| 7 | **Template Method** | `TemplateMethodPattern.java` | Defines algorithm skeleton in base class |
| 8 | **Mediator** | `MediatorPattern.java` | Centralizes communication between objects |
| 9 | **Memento** | `MementoPattern.java` | Captures and restores object state |
| 10 | **Interpreter** | `InterpreterPattern.java` | Defines grammar and interpreter for language |
| 11 | **Visitor** | `VisitorPattern.java` | Performs operations without changing classes |

**Location:** `src/BehavioralDesignPatterns/`

**Examples Used:**
- Strategy: Different breathing techniques as strategies
- Observer: Demon Slayer Corps notifying members of attacks
- State: Demon Slayer states (Normal, Fighting, Injured, Defeated)
- Command: Battle commands (Attack, Defend, Run Away)
- Iterator: Iterating through Demon Slayer members
- Chain of Responsibility: Command chain through ranks
- Template Method: Training program structure
- Mediator: Hashira coordinating between slayers
- Memento: Saving/restoring Demon Slayer stats
- Interpreter: Interpreting breathing techniques
- Visitor: Different actions on slayers

---

## 🚀 Quick Start

### Running a Pattern Example:

```bash
# Compile all patterns
javac src/**/*.java

# Run a specific pattern
java CreationalDesignPatterns.Singleton
java BehavioralDesignPatterns.StrategyPattern
java StructuralDesignPatterns.AdapterPattern
```

---

## 📚 Project Structure

```
DesignPatterns/
├── src/
│   ├── CreationalDesignPatterns/
│   │   ├── Singleton.java
│   │   ├── FactoryMethod.java
│   │   ├── AbstractFactory.java
│   │   ├── Builder.java
│   │   └── Prototype.java
│   │
│   ├── BehavioralDesignPatterns/
│   │   ├── StrategyPattern.java
│   │   ├── ObserverPattern.java
│   │   ├── StatePattern.java
│   │   ├── CommandPattern.java
│   │   ├── IteratorPattern.java
│   │   ├── ChainOfResponsibilityPattern.java
│   │   ├── TemplateMethodPattern.java
│   │   ├── MediatorPattern.java
│   │   ├── MementoPattern.java
│   │   ├── InterpreterPattern.java
│   │   └── VisitorPattern.java
│   │
│   ├── StructuralDesignPatterns/
│   │   ├── AdapterPattern.java
│   │   ├── DecoratorPattern.java
│   │   ├── FacadePattern.java
│   │   ├── BridgePattern.java
│   │   ├── ProxyPattern.java
│   │   ├── CompositePattern.java
│   │   └── FlyweightPattern.java
│   │
│   └── Main.java
└── README.md
```

---

## 🎓 Key Concepts

### Creational Patterns - Object Creation
- **Focus:** How to create objects in flexible ways
- **Benefit:** Decouples client code from concrete classes
- **Use When:** Need flexibility in what objects are created

### Structural Patterns - Object Composition
- **Focus:** How objects compose to form larger structures
- **Benefit:** Simplifies complex systems, adds functionality
- **Use When:** Need to combine objects or add features dynamically

### Behavioral Patterns - Object Collaboration
- **Focus:** How objects communicate and distribute responsibility
- **Benefit:** Improves object interaction, increases flexibility
- **Use When:** Need to define how objects interact over time

---

## 🎌 Demon Slayer Theme

All examples use the **Demon Slayer (Kimetsu no Yaiba)** anime as reference:
- **Characters:** Tanjiro, Zenitsu, Inosuke, Rengoku, etc.
- **Concepts:** Breathing Styles, Hashira ranks, Demon attacks, Training
- **Real-world mapping:** Makes patterns easy to understand and remember

---

## 💡 Learning Tips

1. **Start with Creational Patterns** - Understand object creation first
2. **Move to Structural** - Learn how to organize and combine objects
3. **End with Behavioral** - Master object interactions and communication
4. **Run Examples** - Execute each pattern and modify the code
5. **Compare Patterns** - See similarities and differences between patterns

---

## 📖 Pattern Categories Summary

| Category | Count | Focus | Common Use |
|----------|-------|-------|-----------|
| **Creational** | 5 | Object creation | How to make objects |
| **Structural** | 7 | Object composition | How to organize objects |
| **Behavioral** | 11 | Object interaction | How objects work together |
| **Total** | **23** | - | Complete Gang of Four patterns |

---

## ✨ Features

✅ **Simple & Beginner-Friendly** - Easy to understand code with clear comments  
✅ **Real-World Examples** - Demon Slayer anime references make learning fun  
✅ **Complete Implementation** - All patterns fully implemented with examples  
✅ **Well-Documented** - Each file has detailed explanations  
✅ **Runnable Code** - Every pattern has a working main() method  

---

## 📝 Notes

- All code follows Java conventions
- Each pattern is self-contained in its own file
- Comments explain the pattern and its usage
- Examples show practical applications
- No external dependencies required

---

**Happy Learning! May your code be as strong as a Hashira! ⚔️🔥**


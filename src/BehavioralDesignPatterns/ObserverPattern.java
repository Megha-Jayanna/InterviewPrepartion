package BehavioralDesignPatterns;

/**
 * Observer Design Pattern - Simple Weather Station Example
 * Observer pattern defines a one-to-many relationship between objects
 * When one object changes state, all observers are notified automatically
 */

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    // Observer interface
    interface Observer {
        void update(float temperature);
    }

    // Subject interface
    interface Subject {
        void registerObserver(Observer o);
        void removeObserver(Observer o);
        void notifyObservers();
    }

    // Concrete Subject
    static class WeatherStation implements Subject {
        private List<Observer> observers;
        private float temperature;

        public WeatherStation() {
            observers = new ArrayList<>();
        }

        @Override
        public void registerObserver(Observer o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            observers.remove(o);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(temperature);
            }
        }

        public void setTemperature(float temperature) {
            this.temperature = temperature;
            notifyObservers();
        }
    }

    // Concrete Observer
    static class Display implements Observer {
        private String name;

        public Display(String name) {
            this.name = name;
        }

        @Override
        public void update(float temperature) {
            System.out.println(name + " displays temperature: " + temperature + "°C");
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting Observer Pattern Demo");
        WeatherStation station = new WeatherStation();

        Display display1 = new Display("Mobile App");
        Display display2 = new Display("Website");

        station.registerObserver(display1);
        station.registerObserver(display2);

        station.setTemperature(25.0f);
        station.setTemperature(30.0f);
    }
}

package observerPattern.weatherMonitoringExample.customObserverPattern.weather;

import observerPattern.weatherMonitoringExample.customObserverPattern.Observer;
import observerPattern.weatherMonitoringExample.customObserverPattern.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Initialize observer list
     */
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Register new observer
     *
     * @param observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove/UnSubscribe observer
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0)
            observers.remove(i);
    }

    /**
     * Notify all the registered observers with new updates
     */
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Notify observers when measurement is changed
     */
    public void measurementChanged() {
        notifyObserver();
    }

    /**
     * Set new measurements
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}

package observerPattern.weatherMonitoringExample.customObserverPattern.displayData;

import observerPattern.weatherMonitoringExample.customObserverPattern.DisplayElement;
import observerPattern.weatherMonitoringExample.customObserverPattern.Observer;
import observerPattern.weatherMonitoringExample.customObserverPattern.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions | Temperature:: " + temperature + " | Humidity:: " + humidity + " | Pressure:: " + pressure);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

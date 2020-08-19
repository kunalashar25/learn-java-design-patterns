package observerPattern.weatherMonitoringExample.usingJavaLibraries.displayData;

import observerPattern.weatherMonitoringExample.usingJavaLibraries.DisplayElement;
import observerPattern.weatherMonitoringExample.usingJavaLibraries.weather.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions | Temperature:: " + temperature + " | Humidity:: " + humidity);
    }
}

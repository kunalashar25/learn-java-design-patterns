package observerPattern.weatherMonitoringExample.customObserverPattern.displayData;

import observerPattern.weatherMonitoringExample.customObserverPattern.DisplayElement;
import observerPattern.weatherMonitoringExample.customObserverPattern.Observer;
import observerPattern.weatherMonitoringExample.customObserverPattern.weather.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg | Max | Min temperature:: " + (tempSum / numReadings) + " | " + maxTemp + " | " + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }
}

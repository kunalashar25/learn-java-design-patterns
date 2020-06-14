package observerPattern.weatherMonitoringExample.customObserverPattern.displayData;

import observerPattern.weatherMonitoringExample.customObserverPattern.DisplayElement;
import observerPattern.weatherMonitoringExample.customObserverPattern.Observer;
import observerPattern.weatherMonitoringExample.customObserverPattern.weather.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast Update:: ");

        if (currentPressure > lastPressure) {
            System.out.println("Increase in Pressure");
        } else if (currentPressure == lastPressure) {
            System.out.println("No Changes in Pressure");
        } else {
            System.out.println("Pressure Decreasing");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}

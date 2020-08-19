package observerPattern.weatherMonitoringExample.usingJavaLibraries.run;

import observerPattern.weatherMonitoringExample.usingJavaLibraries.displayData.CurrentConditionsDisplay;
import observerPattern.weatherMonitoringExample.usingJavaLibraries.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 90);
    }
}

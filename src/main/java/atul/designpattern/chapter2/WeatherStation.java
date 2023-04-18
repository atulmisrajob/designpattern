package atul.designpattern.chapter2;

public class WeatherStation {
    public static void main(String [] args){
        WeatherData weatherData =new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurementChanged(80,20,30);
    }
}

package models.other;

import enums.Seasons;
import enums.WeatherStatus;
import exceptions.SeasonException;
import exceptions.gooutsideexception;

public class Weather {
    private int temperature;
    private WeatherStatus skyCondition;

    public Weather(int temperature, WeatherStatus skyCondition) {
        this.temperature = temperature;
        this.skyCondition = skyCondition;
    }

    public void displayWeather(Seasons season) throws SeasonException {
        if (season.equals(Seasons.SUMMER)) {
            System.out.println("На улице потеплело, " + season + " еще не сдавало позиции.");
        } else {
            throw new SeasonException("Время года не лето, ничего не произошло.");
        }
        System.out.println("Небо было голубым и " + skyCondition + ", температура " + temperature + " градуса.");
    }

    public static void main(String[] args) throws gooutsideexception {
        Seasons currentSeason = Seasons.SUMMER;

        if (currentSeason == Seasons.SUMMER) {
            System.out.println("Louis can go outside in the summer");
        } else {
            throw new gooutsideexception("Rachel and Doctor cannot go outside in the current season");
        }
    }
}


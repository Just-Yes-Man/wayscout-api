package com.wayscout.wayscout.weather;

public record HourlyForecast(
        String time,
        double temperatureC,
        int chanceOfRain,
        String condition
) {
}

package com.wayscout.wayscout.weather;

public record CurrentWeatherResponse(
        String city,
        String region,
        String country,
        double temperatureC,
        double feelsLikeC,
        String condition,
        int humidity,
        double windKph,
        String lastUpdated
) {
}

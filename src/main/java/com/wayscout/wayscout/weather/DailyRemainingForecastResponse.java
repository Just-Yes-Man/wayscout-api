package com.wayscout.wayscout.weather;

import java.util.List;

public record DailyRemainingForecastResponse(
        String city,
        String region,
        String country,
        String localTime,
        List<HourlyForecast> remainingHourlyForecast
) {
}

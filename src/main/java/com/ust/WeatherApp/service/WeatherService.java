package com.ust.WeatherApp.service;

import com.ust.WeatherApp.model.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;

    private final String apiKey = "b0fcbdc6e18ba92ece0f8c954f74a5ae";
    private final String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={API_KEY}";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Weather getWeather(String city) {
        return restTemplate.getForObject(apiUrl, Weather.class, city, apiKey);
    }
}

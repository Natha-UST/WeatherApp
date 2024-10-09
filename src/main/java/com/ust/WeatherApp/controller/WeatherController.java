package com.ust.WeatherApp.controller;

import com.ust.WeatherApp.model.Weather;
import com.ust.WeatherApp.service.WeatherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    @GetMapping
    public ResponseEntity<Weather> getWeather (@Valid @RequestParam String city){
        Weather weather = weatherService.getWeather(city);
        return ResponseEntity.ok(weather);
    }
}

package com.ust.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Weather {
    @JsonProperty("name")
    private String city;
    @JsonProperty("main")
    private Details details;

}

 class Details {
    @JsonProperty("temp")
    private double temperature;
    @JsonProperty("humidity")
    private double humidity;
    @JsonProperty("wind")
    private double windSpeed;
}

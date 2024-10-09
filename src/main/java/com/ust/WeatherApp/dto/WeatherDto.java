package com.ust.WeatherApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class WeatherDto {
    @NotBlank(message = "City cannot be blank")
    private String city;

}

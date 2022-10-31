package com.ghartur.LocaCar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private String description;
    @NotBlank
    private double dailyPrice;
    @NotBlank
    private String plate;
    @NotBlank
    private Long brand;
    @NotBlank
    private Long category;
    @NotBlank
    private String color;
}

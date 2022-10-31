package com.ghartur.LocaCar.dto;

import com.ghartur.LocaCar.model.Car;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarImageDTO {

    @NotNull
    private Car car;
    @NotBlank
    private String name;

}

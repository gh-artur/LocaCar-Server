package com.ghartur.LocaCar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    @NotBlank
    private Long id;
    @NotBlank
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDay;
    @Email
    private String email;
    @NotBlank
    private String driversLicence;
    @NotBlank
    private String address;
    @Pattern(regexp = "^\\(?[1-9]{2}\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$")
    private String phoneNumber;

}

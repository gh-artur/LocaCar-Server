package com.ghartur.LocaCar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name="birth_date")
    private LocalDate birthDay;
    private String email;
    //não podem existir dois clientes com o mesmo numero de cnh
    @Column(name="driver_license")
    private String driversLicence;
    private String adress;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="created_at")
    @CreationTimestamp
    private LocalDate customerCreationDate;
    @Column(name="update_at")
    @UpdateTimestamp
    private LocalDate customerUpdate;

}


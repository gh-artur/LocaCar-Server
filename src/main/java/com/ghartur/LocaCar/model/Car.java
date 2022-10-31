package com.ghartur.LocaCar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cars")
@Builder
public class Car{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Column(name="daily_rate")
    private double dailyPrice;
    private boolean available = true;
    private String plate;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private Color color;
    @Column(name="created_at")
    private LocalDate carCreationDate;
    @JsonIgnore
    @OneToMany(mappedBy = "carRental", fetch = FetchType.LAZY )
    private List<Rental> rentals;
    @OneToMany(mappedBy = "carSpecification")
    private Set<CarSpecification> specifications;

    @OneToOne(mappedBy = "carImage")
    private CarImage carsImages;
}

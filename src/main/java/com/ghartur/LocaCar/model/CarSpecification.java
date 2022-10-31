package com.ghartur.LocaCar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    Car carSpecification;
    @ManyToOne
    @JoinColumn(name = "specification_id")
    Specification specifications;

}

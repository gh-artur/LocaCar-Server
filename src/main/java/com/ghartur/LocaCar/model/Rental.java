package com.ghartur.LocaCar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "rentals")
@Builder
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car carRental;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name="start_date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;
    private double total;
    @Column(name="created_at")
    @CreationTimestamp
    private LocalDate rentCreationDate;
    @Column(name="update_at")
    @UpdateTimestamp
    private LocalDate rentUpdateDate;

}

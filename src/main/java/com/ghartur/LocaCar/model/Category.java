package com.ghartur.LocaCar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "categories")
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Column(name="created_at")
    @CreationTimestamp
    private LocalDate categoryCreationDate;

    @JsonIgnore
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY )
    private List<Car> cars;

}

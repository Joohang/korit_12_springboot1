package com.korit12.cardatabase.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private String color;
    @NonNull
    private String registrationNumber;
    @NonNull
    private int modelYear;
    @NonNull
    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")
    @NonNull
    @JsonIgnore
    private Owner owner;

}

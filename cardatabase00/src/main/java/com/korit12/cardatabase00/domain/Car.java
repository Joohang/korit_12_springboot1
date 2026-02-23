package com.korit12.cardatabase00.domain;

import jakarta.persistence.*;

@Entity

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String brand;

    private String model;

    private String color;

    private String registrationNumber;

    private int modelYear;

    private int price;

    @ManyToOne
    @JoinColumn(name = "owner")
    private Owner owner;

    public Car() {
    }

    public Car( String brand, String model, String color, String registrationNumber, int modelYear, int price, Owner owner) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }


}

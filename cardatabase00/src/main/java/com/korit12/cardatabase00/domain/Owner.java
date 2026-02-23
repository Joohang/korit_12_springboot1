package com.korit12.cardatabase00.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;

    private String firstName;

    private String lastName;

    public Owner() {
    }

    public Owner( String firstName, String lastName, List<Car> cars) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.cars = cars;
    }

    public Owner(String jone, String doe) {
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")

    private List<Car> cars;
}

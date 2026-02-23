package com.korit12.cardatabase.domain;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
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
    private Owner owner;            // @NonNull이 없으니까 얘는 옵셔널이라고 봐야겠네요.

}

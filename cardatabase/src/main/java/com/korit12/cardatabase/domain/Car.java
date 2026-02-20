package com.korit12.cardatabase.domain;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

@Entity
// Lombok을 의존성 주입하고, Car 클래스를 롬복 적용 버전으로 다 수정하시오
// 이후 동일하게 localhost:8080/h2-console을 통해서 접속에 성공하시오.
@Data
@NoArgsConstructor
// AllArgsConstructor 는 추후에 충돌및 에러 가능성 기본생성자만 생성후
// field에서 @이용해 지정하는 방식이 좋다.

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String brand, model, color, registrationNumber;
    @NonNull
    private int modelYear, price;

    public Car(@NonNull String brand, @NonNull String model, @NonNull String color, @NonNull String registrationNumber, @NonNull int modelYear, @NonNull int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;

       // @NonNull이 없으니까 얘는 옵셔널이라고 봐야겠네요.

    }
}

package com.korit12.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long ownerId;
    @Getter @Setter @NonNull
    private String firstName;
    @Getter @Setter @NonNull
    private String lastName;
}

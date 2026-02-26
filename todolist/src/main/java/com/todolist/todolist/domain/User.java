package com.todolist.todolist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Schema(description = "Todo앱 유저 DB")
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @Column(unique = true)
    @Schema(description = "유저이름", example = "example@example.com")
    private String username;

    @NonNull
    @Schema(description = "비밀번호", example = "abcd1234@")
    private String password;

    @NonNull
    @Schema(description = "역할?", example = "???")
    private String role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @Getter
    @Setter
    private List<Todo> todos;

}

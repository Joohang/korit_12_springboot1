package com.todolist.todolist.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long Id;

    @Getter @Setter
    @NonNull
    private String content;
    @Getter @Setter @NonNull
    private String isCompleted;

    @ManyToOne
    @JoinColumn(name = "user_username",referencedColumnName = "username")

    @JsonIgnore
    private User user;

}

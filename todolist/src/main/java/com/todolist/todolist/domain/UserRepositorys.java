package com.todolist.todolist.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorys extends JpaRepository<User,Long> {
}

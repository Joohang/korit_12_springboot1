package com.todolist.todolist.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface TodoRepositorys extends JpaRepository<Todo, Long> {
}

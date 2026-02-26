package com.todolist.todolist;

import com.todolist.todolist.domain.Todo;
import com.todolist.todolist.domain.TodoRepositorys;
import com.todolist.todolist.domain.User;
import com.todolist.todolist.domain.UserRepositorys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(TodolistApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
		logger.info("애플리케이션이 실행됩니다.");
	}

	private final UserRepositorys userRepositorys;
	private final TodoRepositorys todoRepositorys;

	public TodolistApplication(UserRepositorys userRepositorys, TodoRepositorys todoRepositorys) {
		this.userRepositorys = userRepositorys;
		this.todoRepositorys = todoRepositorys;
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

package com.example.simplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; // Add this import
import org.springframework.web.bind.annotation.RestController; // Add this import

@SpringBootApplication
public class SimpleSpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringbootAppApplication.class, args);
    }
}

@RestController
class TaskController {

    @GetMapping("/tasks")
    public String getTasks() {
        return "List of tasks: task1, task2, task3";
    }
}

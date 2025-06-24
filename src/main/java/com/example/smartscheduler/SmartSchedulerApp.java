package com.example.smartscheduler;

// Required imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Task 4: Create the Main Application Class:
 *
 * Create the main class with the main() method.
 * Annotate the class to mark it as a Spring Boot application.
 * Add a method that runs once at startup and adds sample data.
 *
 */
@SpringBootApplication
@EnableScheduling

public class SmartSchedulerApp {
    public static void main(String[] args) {
        SpringApplication.run(SmartSchedulerApp.class, args);
    }


}

package com.example.smartscheduler.model;

import jakarta.persistence.*;
import java.util.Map;

/**
 * Task 5: Create the Person Entity
 * Create a class to represent a person with:
 * An ID (auto-generated)
 * A name (String)
 * Use JPA annotations to map it to a database table.
 * Add a no-args constructor and getters/setters.
 *
 */
@Entity

public class Person {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long id;
private String name;

// No-args constructor (required by JPA)
    public Person() {
    }

    //All args Constructor (without id), getters and setters

    public Person (String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

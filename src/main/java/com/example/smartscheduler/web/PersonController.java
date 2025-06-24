package com.example.smartscheduler.web;


//import:

import com.example.smartscheduler.model.Person;
import com.example.smartscheduler.repo.PersonRepository;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

/**
 *  Task 7: Create the REST Controller
 * Create a REST controller class to handle HTTP requests.
 * Add endpoints to:
 * Create a new person (POST)
 * Get a person by ID (GET)
 * Inject the repository using constructor injection.
 */

@RestController
@RequestMapping("/people")

public class PersonController {
    private final PersonRepository repo;

    // Inject the repository using constructor injection.
    public PersonController(PersonRepository repo){
        this.repo = repo;
    }

    //Get a person by ID (GET)

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return repo.findById(id);

    }

    //Create a new person (POST)

    @PostMapping
    public Person createPerson(@RequestBody Person person){

        return repo.save(person);
    }

}

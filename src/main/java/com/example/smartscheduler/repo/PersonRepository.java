package com.example.smartscheduler.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Task 6: Create the PersonRepository
 * Create a repository interface for the Person entity.
 * Extend the appropriate Spring Data interface to get built-in CRUD methods.
 */

@Repository
public interface PersonRepository extends CrudRepository {
}
G
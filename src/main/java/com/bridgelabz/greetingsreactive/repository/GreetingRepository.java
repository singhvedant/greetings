package com.bridgelabz.greetingsreactive.repository;

import com.bridgelabz.greetingsreactive.model.Greeting;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends R2dbcRepository<Greeting, Integer> {
}

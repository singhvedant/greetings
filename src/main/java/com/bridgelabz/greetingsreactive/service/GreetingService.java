package com.bridgelabz.greetingsreactive.service;

import com.bridgelabz.greetingsreactive.model.Greeting;
import com.bridgelabz.greetingsreactive.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class GreetingService implements GreetingServiceInterface {

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Mono<Greeting> save(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    @Override
    public Flux<Greeting> getAll() {
        return greetingRepository.findAll();
    }

    @Override
    public Mono<Greeting> getGreetingByID(int id) {
        return greetingRepository.findById(id);
    }
}

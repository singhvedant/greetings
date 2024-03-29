package com.bridgelabz.greetingsreactive.service;

import com.bridgelabz.greetingsreactive.model.Greeting;
import com.bridgelabz.greetingsreactive.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface GreetingServiceInterface {
    Mono<Greeting> save(Greeting greeting);
    Flux<Greeting> getAll();
    Mono<Greeting> getGreetingByID(int id);
    Mono<Void> deleteGreeting(int id);
}

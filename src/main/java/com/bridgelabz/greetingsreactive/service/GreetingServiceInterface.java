package com.bridgelabz.greetingsreactive.service;

import com.bridgelabz.greetingsreactive.model.Greeting;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface GreetingServiceInterface {
    Mono<Greeting> save(Greeting greeting);
    Flux<Greeting> getAll();

}

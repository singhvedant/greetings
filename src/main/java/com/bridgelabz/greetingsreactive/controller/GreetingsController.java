package com.bridgelabz.greetingsreactive.controller;

import com.bridgelabz.greetingsreactive.model.Greeting;
import com.bridgelabz.greetingsreactive.service.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @Autowired
    private GreetingServiceInterface service;

    @PostMapping("/add")
    public Mono<Greeting> addGreeting(@RequestBody Greeting greeting) {
        return service.save(greeting);
    }

    @GetMapping("/getAll")
    public Flux<Greeting> all() {
        return service.getAll();
    }
}

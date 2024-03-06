package com.bridgelabz.greetingsreactive.controller;

import com.bridgelabz.greetingsreactive.model.Greeting;
import com.bridgelabz.greetingsreactive.model.Response;
import com.bridgelabz.greetingsreactive.service.GreetingServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/get/{id}")
    public Mono<Greeting> getGreeting(@PathVariable int id) {
        return service.getGreetingByID(id);
    }

    @PutMapping("/update")
    public Mono<Greeting> updateGreeting(@RequestBody Greeting greeting) {
        return service.save(greeting);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<ResponseEntity<Response>> deleteGreeting(@PathVariable int id) {
        return service.deleteGreeting(id)
                .then(Mono.just(new ResponseEntity<>(new Response(200, "Deleted"), HttpStatus.OK)))
                .defaultIfEmpty(new ResponseEntity<>(new Response(400, "Not Found"), HttpStatus.NOT_FOUND));
    }
}
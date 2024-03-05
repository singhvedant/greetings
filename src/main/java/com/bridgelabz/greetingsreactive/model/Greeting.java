package com.bridgelabz.greetingsreactive.model;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@Data
@Table(name = "greeting")
public class Greeting {
    @Id
    private Integer id;
    private String message;

    public Greeting(String message) {
        this.message = message;
    }
}
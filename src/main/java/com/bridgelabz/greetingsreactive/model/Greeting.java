package com.bridgelabz.greetingsreactive.model;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.aot.generate.GeneratedClass;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@Data
@Table(name = "greeting")
public class Greeting {
    @Id
    @Generated
    private Integer id;
    private String message;
}
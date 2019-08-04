package com.evy.controller;

import com.evy.model.Person;
import com.evy.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @GetMapping(path = "/{id}")
    public Mono<Person> getPerson(@PathVariable("id") Integer id) {
        return personService.getPerson(id);
    }
}

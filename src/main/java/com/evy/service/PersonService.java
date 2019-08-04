package com.evy.service;

import com.evy.model.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {

    private final static Map<Integer, Person> people = new HashMap<>();

    static {
        people.put(1, new Person(1, "Nick"));
        people.put(2, new Person(2, "Dimon"));
    }

    public Person getPerson(Integer id) {
        return people.get(id);
    }
}

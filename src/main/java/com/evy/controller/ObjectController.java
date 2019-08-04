package com.evy.controller;

import com.evy.model.MapObject;
import com.evy.service.ObjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/object")
public class ObjectController {

    private final ObjectService objectService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<MapObject> getObject(@PathVariable("id") Integer id) {
        return objectService.getObject(id);
    }
}

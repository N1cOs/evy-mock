package com.evy.controller;

import com.evy.model.Position;
import com.evy.service.PositionService;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping("/position")
public class PositionController {

    private final PositionService positionService;

    @GetMapping(path = "/person/{id}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ApiOperation(value = "Returns person's position", notes = "It doesn't work in swagger. " +
            "Test it in a terminal with CURL. Json model you can find in description")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Position.class)
    })
    public Flux<Position> getPersonPosition(@PathVariable("id") Integer id) {
        return positionService.getPersonPosition(id);
    }
}

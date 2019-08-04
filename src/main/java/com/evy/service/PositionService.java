package com.evy.service;

import com.evy.model.Point;
import com.evy.model.Position;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

@Service
public class PositionService {

    @Value("${app.position.interval}")
    private Integer interval;

    @Value("${app.position.fault}")
    private Double fault;

    public Flux<Position> getPersonPosition(Integer id) {
        return Flux.interval(Duration.ofMillis(interval))
                .map(tick -> new Position(getPoint(id), fault));
    }

    private Point getPoint(Integer id) {
        var rand = new Random();

        var x = rand.nextDouble() * 5.8 + id / 10;
        var y = rand.nextDouble() * 1.8 + id / 10;

        return new Point(x, y);
    }
}

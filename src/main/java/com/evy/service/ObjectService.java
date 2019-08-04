package com.evy.service;

import com.evy.model.MapObject;
import com.evy.model.NotificationType;
import com.evy.model.Point;
import com.evy.model.Position;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class ObjectService {

    private final static Map<Integer, MapObject> objects = new HashMap<>();

    static {
        var pos1 = new Position(new Point(1., 3.), null);
        var obj1 = new MapObject(1, "/image/object/1", pos1,
                "It's a table", NotificationType.PUSH);
        objects.put(1, obj1);
    }

    public Mono<MapObject> getObject(Integer id) {
        return Mono.justOrEmpty(objects.get(id));
    }
}

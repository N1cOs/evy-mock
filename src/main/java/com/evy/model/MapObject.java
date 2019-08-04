package com.evy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MapObject {

    private Integer id;

    private String imageUrl;

    private Position position;

    private String info;
}

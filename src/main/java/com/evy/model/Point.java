package com.evy.model;

import com.evy.support.DoubleSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Point {

    @JsonSerialize(using = DoubleSerializer.class)
    private Double x;

    @JsonSerialize(using = DoubleSerializer.class)
    private Double y;
}

package com.evy.support;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;

public class DoubleSerializer extends JsonSerializer<Double> {

    @Override
    public void serialize(Double value, JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException {
        var decimalFormat = new DecimalFormat("0.##");
        jsonGenerator.writeNumber(decimalFormat.format(value));
    }
}

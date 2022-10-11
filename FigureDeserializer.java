package pl.kurs;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import pl.kurs.Figure;

import java.io.IOException;

public class FigureDeserializer extends StdDeserializer<Figure> {
    public FigureDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Figure deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode jn = jsonParser.getCodec().readTree(jsonParser);
        String type = jn.get("Type").asText();
        double properties = jn.get("radius").asDouble();
        double properties1 = jn.get("width").asDouble();
        double properties2 = jn.get("height").asDouble();

        return

    }
}

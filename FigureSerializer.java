package pl.kurs;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import pl.kurs.model.Square;

import java.io.IOException;

public class FigureSerializer extends StdSerializer<Figure> {
    public FigureSerializer(Class<Figure> t) {
        super(t);
    }

    @Override
    public void serialize(Figure figure, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
       
    }
}

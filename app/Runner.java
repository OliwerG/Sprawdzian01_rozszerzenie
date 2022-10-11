package pl.kurs.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import pl.kurs.Figure;
import pl.kurs.ObjectMapperHolder;
import pl.kurs.ShapeFactory;
import pl.kurs.model.Square;
import pl.kurs.service.FiguresService;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        ShapeFactory shapeFactory = new ShapeFactory();
        ObjectMapper objectMapper = ObjectMapperHolder.INSTANCE.getObjectMapper();

        List<Figure> figures = new ArrayList<>();
        figures.add(new Square("Kwadrat", 10));

        Square sq1 = shapeFactory.createSquare(10);
        System.out.println(sq1);

        Square sq2 = shapeFactory.createSquare(10);
        System.out.println((sq1 == sq2));

        objectMapper.writeValue(new File("src/main/resources/figures.json"), figures);

        Figure f = objectMapper.readValue(new File("src/main/resources/figures.json"), Figure.class);
        System.out.printf(f.toString());


        FiguresService figuresService = new FiguresService();
        System.out.println("The biggest area is: " + figuresService.printBiggestArea(figures));
        System.out.println("The biggest perimeter is:  " + figuresService.printBiggestPerimeter(figures));

    }
}

package pl.kurs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.kurs.model.Square;
import pl.kurs.service.FiguresService;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactoryTest {
    ShapeFactory shapeFactory;
    FiguresService figuresService;

    List<Figure> figureList;

    @Before
    public void init() {
        shapeFactory = new ShapeFactory();
        figuresService = new FiguresService();
    }

    @Test
    public void shouldReturnOneObjectOfSquareIfTwoSquaresAreIdentical() {
        //given
        Square sq1 = shapeFactory.createSquare(10);
        //when
        Square answer = shapeFactory.createSquare(10);

        //then
        Assert.assertEquals(answer, sq1);
    }

}
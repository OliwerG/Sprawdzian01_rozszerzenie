package pl.kurs;

import pl.kurs.model.Circle;
import pl.kurs.model.Rectangle;
import pl.kurs.model.Square;

public class ShapeFactory {
    public ShapeFactory() {
    }

    public Square createSquare(int sideA) {
        if (sideA < 0)
            throw new IllegalArgumentException("Nie można ustawić wartości ujemnej!");
        return new Square("Kwadrat", sideA);
    }

    public Rectangle createRectangle(int sideA, int sideB) {
        if (sideA < 0 || sideB < 0)
            throw new IllegalArgumentException("Nie można ustawić wartości ujemnej!");
        return new Rectangle("Prostokąt", sideA, sideB);
    }

    public Circle createCircle(int radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Nie można ustawić wartości ujemnej!");
        return new Circle("Koło", radius);
    }
}

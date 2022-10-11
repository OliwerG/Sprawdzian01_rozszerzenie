package pl.kurs.model;

import pl.kurs.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String nameFigure, double radius) {
        super(nameFigure);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}

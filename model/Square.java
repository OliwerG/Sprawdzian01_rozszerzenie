package pl.kurs.model;

import pl.kurs.Figure;

public class Square extends Figure {
    private double sideA;

    public Square(String nameFigure, double sideA) {
        super(nameFigure);
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}

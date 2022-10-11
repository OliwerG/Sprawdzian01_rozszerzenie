package pl.kurs;

public abstract class Figure {
    private String nameFigure;


    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
    public abstract double getArea();

    public abstract double getPerimeter();
}

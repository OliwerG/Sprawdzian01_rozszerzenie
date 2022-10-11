package pl.kurs.service;

import pl.kurs.Figure;

import java.util.List;

public class FiguresService {

    public Figure printBiggestArea(List<Figure> figures) {
        Figure najwiekszePole = figures.get(0);
        for (Figure f : figures) {
            if (f.getArea() > najwiekszePole.getArea())
                najwiekszePole = f;
        }
        return najwiekszePole;
    }

    public Figure printBiggestPerimeter(List<Figure> figures) {
        Figure najwiekszyObwod = figures.get(0);
        for (Figure f : figures) {
            if (f.getPerimeter() > najwiekszyObwod.getPerimeter())
                najwiekszyObwod = f;
        }
        return najwiekszyObwod;
    }

}

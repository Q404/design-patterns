package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

public class DariaPicture extends Picture {
    private FigureFactory figureFactory;

    public DariaPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure rectangle = figureFactory.getFigure("Rectangle");
        rectangle.setParameters(90, 90, 90, 110);
        figures.add(rectangle);
        Figure triangle = figureFactory.getFigure("Triangle");
        triangle.setParameters(110, 62, 88, 70, 60, 120);
        figures.add(triangle);
    }

    @Override
    public String toString() {
        return "Daria picture";
    }
}

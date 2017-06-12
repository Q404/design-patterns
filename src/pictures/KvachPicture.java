package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

public class KvachPicture extends Picture {
    private FigureFactory figureFactory;

    public KvachPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure rectangle = figureFactory.getFigure("Rectangle");
        rectangle.setParameters(150, 150, 90, 90);
        figures.add(rectangle);
        Figure triangle = figureFactory.getFigure("Triangle");
        triangle.setParameters(120, 150, 195, 110, 270, 150);
        figures.add(triangle);
        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(240, 20, 30);
        figures.add(circle);
    }

    @Override
    public String toString() {
        return "Kvach picture";
    }
}

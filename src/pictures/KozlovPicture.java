package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

public class KozlovPicture extends Picture {
    private FigureFactory figureFactory;

    public KozlovPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure rectangle = figureFactory.getFigure("Rectangle");
        rectangle.setParameters(150, 150, 300, 90);
        figures.add(rectangle);
        Figure rectangle1 = figureFactory.getFigure("Rectangle");
        rectangle1.setParameters(250, 80, 140, 90);
        figures.add(rectangle1);
        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(180, 220, 30);
        figures.add(circle);
        Figure circle1 = figureFactory.getFigure("Circle");
        circle1.setParameters(370, 220, 30);
        figures.add(circle1);
    }

    @Override
    public String toString() {
        return "Kozlov picture";
    }
}

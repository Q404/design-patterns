package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;


public class SamsonPicture extends Picture{
    private FigureFactory figureFactory;

    public SamsonPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {

        Figure triangle = figureFactory.getFigure("Triangle");
        triangle.setParameters(120, 180, 195, 40, 270, 180);
        figures.add(triangle);

        Figure triangle2 = figureFactory.getFigure("Triangle");
        triangle2.setParameters(100, 280, 195, 100, 290, 280);
        figures.add(triangle2);

        Figure rectangle = figureFactory.getFigure("Rectangle");
        rectangle.setParameters(180, 250, 30, 70);
        figures.add(rectangle);

        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(260, 50, 50);
        figures.add(circle);
    }

    @Override
    public String toString() {
        return "Samson picture";
    }



}

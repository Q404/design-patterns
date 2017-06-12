package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

public class NastyaPicture extends Picture {
    private FigureFactory figureFactory;

    public NastyaPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {

        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(240, 50, 30);
        figures.add(circle);
        Figure circle1 = figureFactory.getFigure("Circle");
        circle1.setParameters(240, 80, 30);
        figures.add(circle1);
        Figure circle2 = figureFactory.getFigure("Circle");
        circle2.setParameters(210, 50, 30);
        figures.add(circle2);
        Figure circle3 = figureFactory.getFigure("Circle");
        circle3.setParameters(270, 50, 30);
        figures.add(circle3);
        Figure circle4 = figureFactory.getFigure("Circle");
        circle4.setParameters(220, 100, 50);
        figures.add(circle4);
        Figure circle5 = figureFactory.getFigure("Circle");
        circle5.setParameters(220, 170, 25);
        figures.add(circle5);
        Figure circle6 = figureFactory.getFigure("Circle");
        circle6.setParameters(270, 170, 25);
        figures.add(circle6);

    }

    @Override
    public String toString() {
        return "Nastya picture";
    }
}

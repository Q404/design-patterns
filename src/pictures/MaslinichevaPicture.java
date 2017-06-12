package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

public class MaslinichevaPicture extends Picture {
    private FigureFactory figureFactory;

    public MaslinichevaPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(200, 150, 80);
        figures.add(circle);
        Figure circle1 = figureFactory.getFigure("Circle");
        circle1.setParameters(230, 80, 50);
        figures.add(circle1);
        Figure circle2 = figureFactory.getFigure("Circle");
        circle2.setParameters(253, 45, 25);
        figures.add(circle2);
    }

    @Override
    public String toString() {
        return "Maslinicheva picture";
    }
}

package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;


public class EldarPicture extends Picture {
    private FigureFactory figureFactory;

    public EldarPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
	    Figure triangle = figureFactory.getFigure("Triangle");
        triangle.setParameters(70, 22, 158, 30, 20, 80);
        figures.add(triangle);
        Figure secondTriangle = figureFactory.getFigure("Triangle");
        secondTriangle.setParameters(90, 52, 78, 70, 21, 10);
        figures.add(secondTriangle);
    }

    @Override
    public String toString() {
        return "Eldar picture";
    }
}
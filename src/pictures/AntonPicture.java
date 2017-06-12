package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

/**
 * Created by mrq40 on 12/06/17.
 */
public class AntonPicture extends Picture {
    private FigureFactory figureFactory;

    public AntonPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure rectangle = figureFactory.getFigure("Rectangle");
        rectangle.setParameters(50, 20, 20, 10);
        figures.add(rectangle);
        Figure bottomCircle = figureFactory.getFigure("Circle");
        bottomCircle.setParameters(40, 80, 20);
        figures.add(bottomCircle);
        Figure middleCircle = figureFactory.getFigure("Circle");
        middleCircle.setParameters(50, 50, 10);
        figures.add(middleCircle);
        Figure topCircle = figureFactory.getFigure("Circle");
        topCircle.setParameters(55, 35, 5);
        figures.add(topCircle);

    }

    @Override
    public String toString() {
        return "Anton picture";
    }
}

package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

/**
 * Created by Al on 12.06.2017.
 */
public class AlenaPicture extends Picture {
    private FigureFactory figureFactory;

    public AlenaPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(180, 180, 20);
        figures.add(circle);

        Figure triangle = figureFactory.getFigure("Triangle");
        triangle.setParameters(200, 220, 220, 260, 180, 260);
        figures.add(triangle);
    }

    @Override
    public String toString() {
        return "Alena picture";
    }
}

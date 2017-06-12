package pictures;

import pictures.figures.Figure;
import pictures.figures.FigureFactory;

public class KarolinaPicture extends Picture {
    private FigureFactory figureFactory;

    public KarolinaPicture() {
        super();
        figureFactory = new FigureFactory();
        this.createFigures();
    }

    @Override
    public void createFigures() {
        Figure triangle1 = figureFactory.getFigure("Triangle");
        triangle1.setParameters(300, 150, 370, 250, 230, 250);
        figures.add(triangle1);
        Figure triangle2 = figureFactory.getFigure("Triangle");
        triangle2.setParameters(250, 110, 350, 110, 300, 170);
        figures.add(triangle2);
        Figure triangle3 = figureFactory.getFigure("Triangle");
        triangle3.setParameters(260, 110, 290, 110, 275, 80);
        figures.add(triangle3);
        Figure triangle4 = figureFactory.getFigure("Triangle");
        triangle4.setParameters(340, 110, 310, 110, 325, 80);
        figures.add(triangle4);
        Figure triangle5 = figureFactory.getFigure("Triangle");
        triangle5.setParameters(340, 230, 370, 150, 400, 180);
        figures.add(triangle5);

        Figure circle = figureFactory.getFigure("Circle");
        circle.setParameters(265, 235, 15);
        figures.add(circle);
        Figure circle1 = figureFactory.getFigure("Circle");
        circle1.setParameters(305, 235, 15);
        figures.add(circle1);
    }

    @Override
    public String toString() {
        return "Karolina picture";
    }
}

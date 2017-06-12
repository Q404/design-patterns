package pictures;

import pictures.figures.Figure;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by mrq40 on 08/06/17.
 */
public abstract class Picture {
    protected Collection<Figure> figures;

    public Picture() {
        figures = new ArrayList<>();
    }

    public void paint(Graphics g) {
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }

    public abstract void createFigures();
}

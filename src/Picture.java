import java.awt.*;
import java.util.Collection;

/**
 * Created by mrq40 on 08/06/17.
 */
public class Picture extends Canvas {
    private Collection<Figure> figures;

    public Picture(Collection<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }
}

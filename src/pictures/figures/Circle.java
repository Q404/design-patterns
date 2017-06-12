package pictures.figures;

import java.awt.*;

/**
 * Created by UserPc on 10.06.2017.
 */
public class Circle implements Figure {
    private int radius;
    private int x;
    private int y;

    @Override
    public void draw(Graphics g) {
        g.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public void setParameters(int... parameters) {
        x = parameters[0];
        y = parameters[1];
        radius = parameters[2];
    }
}

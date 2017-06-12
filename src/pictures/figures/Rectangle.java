package pictures.figures;

import java.awt.*;

/**
 * Created by UserPc on 10.06.2017.
 */
public class Rectangle implements Figure {
    private int x;
    private int y;
    private int width;
    private int height;

    @Override
    public void draw(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    @Override
    public void setParameters(int... parameters) {
        x = parameters[0];
        y = parameters[1];
        width = parameters[2];
        height = parameters[3];
    }
}

package pictures.figures;

import java.awt.*;

/**
 * Created by UserPc on 10.06.2017.
 */
public class Triangle implements Figure {
    private int xPoints[];
    private int yPoints[];

    @Override
    public void draw(Graphics g) {
        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void setParameters(int... parameters) {
        xPoints = new int[3];
        yPoints = new int[3];
        xPoints[0] = parameters[0];
        xPoints[1] = parameters[2];
        xPoints[2] = parameters[4];
        yPoints[0] = parameters[1];
        yPoints[1] = parameters[3];
        yPoints[2] = parameters[5];
    }
}

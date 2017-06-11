import java.awt.*;

/**
 * Created by UserPc on 10.06.2017.
 */
public abstract class PictureDecorator {
    private Figure figure;

    public PictureDecorator(Figure figure) {
        this.figure = figure;
    }

    public abstract void paint(Graphics g);
}

import java.awt.*;

/**
 * Created by UserPc on 11.06.2017.
 */
public class PictureModel extends Canvas {
    PictureDecorator decorator;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (decorator != null) {
            decorator.paint(g);
        }
    }

    public void update() {
        this.revalidate();
        this.repaint();
    }

    public void setDecorator(PictureDecorator decorator) {
        this.decorator = decorator;
    }
}

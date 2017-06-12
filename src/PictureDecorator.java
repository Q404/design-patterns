import pictures.Picture;

import java.awt.*;

/**
 * Created by UserPc on 10.06.2017.
 */
public abstract class PictureDecorator {
    private Picture picture;

    public PictureDecorator(Picture picture) {
        this.picture = picture;
    }

    public abstract void paint(Graphics g);
}

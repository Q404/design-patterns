import pictures.Picture;

import java.awt.*;

/**
 * Created by UserPc on 11.06.2017.
 */
public class DecoratorFactory {
    public PictureDecorator getDecorator(String decoratorType, Picture picture) {
        if (decoratorType == null) {
            return new PictureDecorator(picture) {
                @Override
                public void paint(Graphics g) {
                    g.setColor(Color.BLACK);
                    picture.paint(g);
                }
            };
        }
        if (decoratorType.equalsIgnoreCase("Red")) {
            return new PictureDecorator(picture) {
                @Override
                public void paint(Graphics g) {
                    g.setColor(Color.RED);
                    picture.paint(g);
                }
            };
        } else if (decoratorType.equalsIgnoreCase("Green")) {
            return new PictureDecorator(picture) {
                @Override
                public void paint(Graphics g) {
                    g.setColor(Color.GREEN);
                    picture.paint(g);
                }
            };
        } else if (decoratorType.equalsIgnoreCase("Blue")) {
            return new PictureDecorator(picture) {
                @Override
                public void paint(Graphics g) {
                    g.setColor(Color.BLUE);
                    picture.paint(g);
                }
            };
        }
        System.out.println("BLACK DECORATOR");
        return new PictureDecorator(picture) {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLACK);
                picture.paint(g);
            }
        };
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by UserPc on 10.06.2017.
 */
public class DrawPictureListener implements ActionListener {
    private JComboBox<Picture> pictureJComboBox;
    private JComboBox<PictureDecorator> pictureDecoratorJComboBox;

    public DrawPictureListener(JComboBox<Picture> pictureJComboBox, JComboBox<PictureDecorator> pictureDecoratorJComboBox) {
        this.pictureJComboBox = pictureJComboBox;
        this.pictureDecoratorJComboBox = pictureDecoratorJComboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

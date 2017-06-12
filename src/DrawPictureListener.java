import pictures.Picture;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by UserPc on 10.06.2017.
 */
public class DrawPictureListener implements ActionListener {
    private JComboBox<Picture> pictureJComboBox;
    private JComboBox<String> pictureDecoratorJComboBox;
    private PictureModel model;
    private DecoratorFactory decoratorFactory;

    public DrawPictureListener(JComboBox<Picture> pictureJComboBox, JComboBox<String> pictureDecoratorJComboBox, PictureModel model) {
        this.pictureJComboBox = pictureJComboBox;
        this.pictureDecoratorJComboBox = pictureDecoratorJComboBox;
        this.model = model;
        this.decoratorFactory = new DecoratorFactory();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setDecorator(decoratorFactory.getDecorator((String) pictureDecoratorJComboBox.getSelectedItem(), (Picture) pictureJComboBox.getSelectedItem()));
        pictureDecoratorJComboBox.getSelectedItem();
        model.update();
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * Created by mrq40 on 08/06/17.
 */
public class Runner {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {}

        /* Main window creating */

        JFrame window = new JFrame("33 on fire");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500, 400);

        /* Upper tab menu */

        JPanel tabBar = new JPanel(new BorderLayout());
        JComboBox<Picture> pictureJComboBox = new JComboBox<>();
        JComboBox<PictureColorDecorator> pictureColorDecoratorJComboBox = new JComboBox<>();
        tabBar.add(pictureJComboBox);
        tabBar.add(pictureColorDecoratorJComboBox);
    }
}

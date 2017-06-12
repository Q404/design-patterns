import pictures.*;

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

        /* Test picture */

        AntonPicture antonPicture = new AntonPicture();
        DariaPicture dariaPicture = new DariaPicture();
        KozlovPicture kozlovPicture = new KozlovPicture();
        KvachPicture kvachPicture = new KvachPicture();
        EldarPicture eldarPicture = new EldarPicture();
        NastyaPicture nastyaPicture = new NastyaPicture();
        MaslinichevaPicture maslinichevaPicture = new MaslinichevaPicture();
        KarolinaPicture karolinaPicture = new KarolinaPicture();

        /* Main window creating */

        JFrame window = new JFrame("33 on fire");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(600, 400);

        /* Field for canvas */

        PictureModel model = new PictureModel();

        /* Upper tab menu */

        JPanel tabBar = new JPanel(new BorderLayout());
        // ---
        JComboBox<Picture> pictureJComboBox = new JComboBox<>();
        pictureJComboBox.addItem(antonPicture);
        pictureJComboBox.addItem(dariaPicture);
        pictureJComboBox.addItem(kozlovPicture);
        pictureJComboBox.addItem(kvachPicture);
        pictureJComboBox.addItem(eldarPicture);
        pictureJComboBox.addItem(nastyaPicture);
        pictureJComboBox.addItem(maslinichevaPicture);
        pictureJComboBox.addItem(karolinaPicture);
        tabBar.add(pictureJComboBox, BorderLayout.LINE_START);
        // ---
        JComboBox<String> pictureColorDecoratorJComboBox = new JComboBox<>();
        pictureColorDecoratorJComboBox.addItem(null);
        pictureColorDecoratorJComboBox.addItem("Red");
        pictureColorDecoratorJComboBox.addItem("Green");
        pictureColorDecoratorJComboBox.addItem("Blue");
        tabBar.add(pictureColorDecoratorJComboBox, BorderLayout.CENTER);
        // ---
        JButton drawButton = new JButton("Draw");
        drawButton.addActionListener(new DrawPictureListener(pictureJComboBox, pictureColorDecoratorJComboBox, model));
        tabBar.add(drawButton, BorderLayout.EAST);

        /* Create window */

        window.add(tabBar, BorderLayout.NORTH);
        window.add(model, BorderLayout.CENTER);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}

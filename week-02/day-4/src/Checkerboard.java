import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {

        int BoxSize = 30;
        drawBlackBox(BoxSize, graphics);
        blackBoxTwo(BoxSize, graphics);



    }
    public static void drawBlackBox (int boxSize, Graphics graphics) {
        for (int i = 0; i <= 9; i += 2) {
            graphics.fillRect(boxSize * i,  0, boxSize, boxSize);
            for (int j = 2; j < 10; j += 2)
                graphics.fillRect(boxSize * i, boxSize * j, boxSize, boxSize);
        }
    }

    public static void blackBoxTwo (int boxSize, Graphics graphics) {
        for (int i = 1; i <= 9; i += 2) {
            graphics.fillRect(boxSize * i,boxSize,boxSize,boxSize);
            for (int j = 3; j < 8; j += 2)
                graphics.fillRect(boxSize * i,boxSize * j,boxSize,boxSize);
        }
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 323;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

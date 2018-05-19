import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        lines(graphics);



    }
    public static void lines (Graphics graphics) {
        for (int i = 0; i < WIDTH; i += 20) {
            graphics.setColor(new Color(166,102,234));
            graphics.drawLine(20 + i, 5, WIDTH, 20 + i);
            for (int j = 0; j < HEIGHT; j++)
                graphics.setColor(Color.GREEN);
                graphics.drawLine(5, 20 +i, 20 +i, HEIGHT);
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
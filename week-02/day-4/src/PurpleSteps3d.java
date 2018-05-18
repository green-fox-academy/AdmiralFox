import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
        int x = 20;
        int y = 20;
        purpleSteps3dDraw(x, y, graphics);


    }
    public static void purpleSteps3dDraw (int x, int y, Graphics graphics) {
        for (int i = 0; i <= 6; i++) {
            graphics.fill3DRect(x* i, y*i, x * i, y * i, true);
        }
    }

    // Don't touch the code below
    static int WIDTH = 620;
    static int HEIGHT = 643;

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
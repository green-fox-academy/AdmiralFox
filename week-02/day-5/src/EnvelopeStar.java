import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        linesHalf(graphics);

    }
    public static void linesHalf (Graphics graphics) {
        for (int i = 20; i < CANVASSIZE/2; i += 20) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0 + i, CANVASSIZE/2, CANVASSIZE/2, CANVASSIZE/2 + i);
            graphics.drawLine(CANVASSIZE/2, 0 + i,CANVASSIZE/2 - i, CANVASSIZE/2);
            for (int j = 0; j < CANVASSIZE / 2; j += 20) {
                graphics.setColor(Color.GREEN);
                graphics.drawLine(CANVASSIZE / 2, 0 + j, CANVASSIZE / 2 + j, CANVASSIZE / 2 );
                graphics.drawLine(CANVASSIZE / 2, CANVASSIZE - j, CANVASSIZE / 2 + j, CANVASSIZE / 2);
            }
        }
    }

    static int WIDTH= 600;
    static int HEIGHT = 623;
    static int CANVASSIZE = 600;

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
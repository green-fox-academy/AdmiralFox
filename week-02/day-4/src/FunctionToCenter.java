import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;
        toTheCenter(x,y, graphics);
        toTheCenter2(x,y, graphics);

    }

    public static void toTheCenter (int x,int y, Graphics graphics) {
        for (int i = 0; i <= WIDTH; i += 20) {
            graphics.drawLine(x + i, y,WIDTH/2,HEIGHT/2);
            for (int j = 0; j <= HEIGHT; j += 20)
                graphics.drawLine(x, y + j,WIDTH/2,HEIGHT/2);


        }
}
    public  static void toTheCenter2 (int x, int y, Graphics graphics) {
        for (int i = 0; i < WIDTH; i += 20) {
            graphics.drawLine(x + i, y + WIDTH,WIDTH/2,HEIGHT/2);
            for (int j = 0; j < HEIGHT; j += 20)
                graphics.drawLine(x + HEIGHT, y + j,WIDTH/2,HEIGHT/2);
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
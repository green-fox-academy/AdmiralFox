import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int sizeOfSquare = 10;
        centerSquare(sizeOfSquare, graphics);
    }
    public static void centerSquare ( int size, Graphics graphics) {
        for (int i = WIDTH; i > 0; i--) {
            int canvasSize = WIDTH / 2;
            Random random = new Random();
            graphics.setColor(new Color(random.nextInt(256),
                                        random.nextInt(256),
                                        random.nextInt(256)));
            graphics.fillRect(   canvasSize - (size * i / 2) ,
                                 canvasSize - (size * i / 2),
                                 size * i,
                                 size * i);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 623;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
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
        int sizex = 10;
        int sizey = 10;
        centerSquare(sizex, sizey, graphics);
       /*
        This lines help me to centralized the boxes:
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0,0,300,300);
        graphics.drawLine(0, 150, 300, 150);
        graphics.drawLine(150, 0, 150, 300);
        */
    }
    public static void centerSquare ( int sizex, int sizey, Graphics graphics) {
        for (int i = WIDTH; i > 0; i--) {
            Random random = new Random();
            graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            graphics.fillRect(150 - (sizex * i / 2) , 150 - (sizey * i / 2), sizex * i , sizey * i);
        }
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        int x = 100;
        int y = 100;
        fiftySquares(x, y, graphics);

    }
    public static void fiftySquares (int x, int y, Graphics graphics) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(WIDTH/3 , 0 , x, y);
            graphics.drawRect(0 , WIDTH/3 , x, y);
            graphics.drawRect(WIDTH/3 , y * 2 , x, y);
            graphics.drawRect(x * 2 , WIDTH/3 , x, y);
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
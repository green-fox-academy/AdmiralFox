import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {

    public static void mainDraw(Graphics graphics){
        int x = 100;
        int y = 100;
        fiftySquares(x, y, graphics);

    }
    public static void fiftySquares (int x, int y, Graphics graphics) {
            graphics.setColor(Color.BLACK);
            graphics.drawRect(WIDTH/3 , 0 , WIDTH/3, WIDTH);
            graphics.drawRect(0 , WIDTH/3 , WIDTH, WIDTH/3);

            graphics.drawRect( 133, 0 , 33, WIDTH/3);
            graphics.drawRect(0 , 133 , WIDTH/3, 33);
            graphics.drawRect( WIDTH/3, 33 , WIDTH/3, 33);
            graphics.drawRect(33 , WIDTH/3 , 33, WIDTH/3);

            graphics.drawRect( 144, 0 , 11, 33);
            graphics.drawRect(0 , 144 , 33, 11);
            graphics.drawRect( 133, 11 , 33, 11);
            graphics.drawRect(11 , 133 , 11, 33);
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
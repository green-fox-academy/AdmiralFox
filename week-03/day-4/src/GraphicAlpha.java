import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraphicAlpha {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(new Color(247, 197, 57));
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0,0,WIDTH,HEIGHT);

        drawFourSquares(0, 0, WIDTH, graphics);

    }
    public static void drawFourSquares(int zerosStartX, int zerosStartY, int size, Graphics graphics) {
        int sizePerThree = size / 3;
        graphics.setColor(Color.BLACK);
        graphics.drawRect(zerosStartX + sizePerThree,zerosStartY, sizePerThree, sizePerThree);
        graphics.drawRect(zerosStartX,zerosStartY + sizePerThree, sizePerThree, sizePerThree);
        graphics.drawRect(zerosStartX + sizePerThree,zerosStartY + sizePerThree * 2, sizePerThree, sizePerThree);
        graphics.drawRect(zerosStartX + sizePerThree * 2, zerosStartY + sizePerThree, sizePerThree, sizePerThree);
        if (size > 1) {
            drawFourSquares(zerosStartX + sizePerThree, zerosStartY, sizePerThree, graphics);
            drawFourSquares(zerosStartY, zerosStartX + sizePerThree, sizePerThree, graphics);
            drawFourSquares(zerosStartX + sizePerThree,     zerosStartY + sizePerThree * 2, sizePerThree, graphics);
            drawFourSquares(zerosStartX + sizePerThree * 2, zerosStartY + sizePerThree, sizePerThree, graphics);
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
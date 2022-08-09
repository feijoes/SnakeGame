package components;

import javax.swing.*;
import java.awt.*;


public class Snake {


    public static int y = 10;
    public static int x = 8;
    public static int lenSnake = 3;

    public static String direction = "Right";

    Snake(){
        boolean inlimitedY = (y+1 < 21 && y -1 > 1 );
        boolean inlimitedX = (x+1 <20 && x -1 > 1 );
        Timer timer = new Timer(500, e -> {
            if (direction.equals("Right") && inlimitedX) {
                Squares.squarestime[y][x + 1] = lenSnake;
            } else if (direction.equals("Left") && inlimitedX) {
                Squares.squarestime[y][x - 1] = lenSnake + 1;
            }
            if (direction.equals("Up") && inlimitedY) {
                Squares.squarestime[y - 1][x] = lenSnake + 1;
            } else if (direction.equals("Down") && inlimitedY) {
                Squares.squarestime[y + 1][x] = lenSnake;
            }
            for (int j = 0; j <= lenSnake; j++) {
                for (int i = 0; i <= lenSnake; i++) {
                    if ((y + j > 21 || y - j < 0) || (x + i > 20 || x - i < 0)) {
                        continue;
                    }
                    JLabel newsquare = new JLabel();
                    newsquare.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    newsquare.setBackground(Color.GREEN);
                    newsquare.setOpaque(true);
                    newsquare.setVisible(true);
                    boolean inlimitedY2 = (y + j < 21 && y - j > 0);
                    boolean inlimitedX2 = (x + i < 20 && x - i > 0);
                    if (Squares.squarestime[y + j][x + i] > 0 && inlimitedY2 && inlimitedX2) {
                        Squares.squares[y + j][x + i] = newsquare;
                    } else if (Squares.squarestime[y - j][x - i] > 0 && inlimitedX2 && inlimitedY2) {
                        Squares.squares[y - j][x - i] = newsquare;
                    }
                }

            }
            switch (direction) {
                case "Right" -> x++;
                case "Left" -> x--;
                case "Up" -> y--;
                case "Down" -> y++;
            }
        });
        timer.setInitialDelay(2600);
        timer.start();
    }

}

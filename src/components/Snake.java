package components;

import javax.swing.*;
import java.awt.*;


public class Snake {


    private int x = 10;
    private int y = 10;
    public static int lenSnake = 3;

    public static String direction = "Right";
    private Timer timer;
    Snake(){

        timer = new Timer(500, e -> {
            for (int j=x;j>=x-lenSnake;j--){
                JLabel newsquare = new JLabel();
                newsquare.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                newsquare.setBackground(Color.GREEN);
                newsquare.setOpaque(true);
                newsquare.setVisible(true);
                Squares.squarestime[j][x] = lenSnake;
                Squares.squares[j][x] = newsquare;
            }
            for (int i=y;i>=y-lenSnake;i--){

                JLabel newsquare = new JLabel();
                newsquare.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                newsquare.setBackground(Color.GREEN);
                newsquare.setOpaque(true);
                newsquare.setVisible(true);
                Squares.squarestime[y][i] = lenSnake;
                Squares.squares[y][i] = newsquare;
            }
            if (direction == "Right"){
                y++;
            } else if (direction == "Left") {
                y--;
            } else if (direction == "Up"){
                x--;
            } else {
                x++;
            }



        });
        timer.setInitialDelay(2600);
        timer.start();
    }

}

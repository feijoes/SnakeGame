package components;

import javax.swing.*;
import java.awt.*;

public class Snake {


    private int x = 10;
    private int y = 10;
    private Timer timer;
    Snake(){
        timer = new Timer(500, e -> {
            for (int i=x;i>=x-3;i--){
                JLabel newsquare = new JLabel();
                newsquare.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                newsquare.setBackground(Color.red);
                newsquare.setOpaque(true);
                newsquare.setVisible(true);
                Squares.squares[i][y] = newsquare;
            }


        });
        timer.setInitialDelay(2600);
        timer.start();
    }
}

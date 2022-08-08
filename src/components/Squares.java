package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Squares extends JPanel {

    static public JLabel[][]squares = new JLabel[21][20];
    static public int[][] squarestime = new int[21][20];
    Timer timer;
    public JLabel addSquare(int i, int j) {
        JLabel square = new JLabel();
        square.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        square.setOpaque(true);
        square.setVisible(true);
        if (i == 10 && (j >= 7 && j <=10)) {
            square.setBackground(Color.GREEN);
        }
        squares[i][j] = square ;
        return square;

    }
    public Squares(){


        new Snake();
        this.setBackground(Color.gray);
        this.setLayout(new GridLayout(22,22,0,0));
        for (int i=0; i<=20;i++){
            for (int j=0;j<=19;j++){
                this.add(addSquare(i,j));
            }
        }
        this.setVisible(true);

        timer = new Timer(500, e -> {

            actualize();
        });
        timer.setInitialDelay(2600);
        timer.start();
    }

    public void actualize(){
        this.removeAll();

        for (int i=0; i<=20;i++){
            for (int j=0;j<=19;j++){
                if (squarestime[i][j] > 0){
                    squarestime[i][j]-=Snake.lenSnake;
                    this.add(squares[i][j]);
                } else if (squarestime[i][j] <= 0) {
                    this.add(addSquare(i,j));
                }
                else {
                    this.add(addSquare(i,j));
                }


            }
        }
        this.revalidate();
        this.repaint();
    }

    public void setSquare(JLabel label, int i, int j){
        squares[i][j] = label;
    }

}

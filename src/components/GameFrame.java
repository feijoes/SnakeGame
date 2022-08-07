package components;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame(){
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.getContentPane().setLayout(new BorderLayout());
        this.setIconImage( new ImageIcon("logo.png").getImage());
        this.getContentPane().setBackground(Color.lightGray);
        this.setMinimumSize(new Dimension(400, 400));
        this.add(new CountDown());
        this.pack();

        this.setVisible(true);
    }
}

package components;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    Timer timer;
    public GameFrame(){
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.getContentPane().setLayout(new BorderLayout());
        this.setIconImage( new ImageIcon("logo.png").getImage());
        this.getContentPane().setBackground(Color.lightGray);
        this.setMinimumSize(new Dimension(400, 400));



        class a extends JPanel{
            a(Color a,int w, int h){
                this.setBackground(a);
                this.setPreferredSize(new Dimension(w,h));
            }
        }

        this.add(new Squares(),BorderLayout.CENTER);
        this.add(new a(Color.gray,70,70),BorderLayout.EAST);
        this.add(new a(Color.gray,70,70),BorderLayout.WEST);
        this.add(new a(Color.gray,70,70),BorderLayout.NORTH);
        this.add(new a(Color.gray,70,70),BorderLayout.SOUTH);
        this.setVisible(true);

    }
}

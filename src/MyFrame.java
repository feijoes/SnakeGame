import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    JButton button;
    JLabel label;
    public MyFrame(){
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        this.setIconImage( new ImageIcon("logo.png").getImage());;
        this.getContentPane().setBackground(Color.lightGray);

        button = new JButton();
        button.setFocusPainted(false);
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("Pressed"));
        button.setText("Start Game");
        button.setIcon(new ImageIcon(new ImageIcon("start.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        this.add(button);

        label = new JLabel();
        label.setText("Snake game");
        this.add(label);

        this.setVisible(true);
    }

}

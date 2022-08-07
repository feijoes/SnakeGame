package components;

import javax.swing.*;
import java.awt.*;


public class CountDown extends JPanel {
    JLabel label;
    Timer timer;
    int count = 5;
    public CountDown() {
        label = new JLabel("...");
        setLayout(new GridBagLayout());
        add(label);
        timer = new Timer(700, e -> {
            count--;
            if (count >= 0) {
                label.setText(Integer.toString(count));
            } else {
                this.removeAll();
                this.revalidate();
                this.repaint();
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
    }


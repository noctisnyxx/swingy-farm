package main.java;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        super("FARm", GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration());
    }
    public void run(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

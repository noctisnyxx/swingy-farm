package main.java;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Sprite sprite;

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
    }

    public void deploySprite(Sprite sprite){
        this.sprite = sprite;

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (sprite != null){
            g.drawImage(sprite.getImage(), sprite.getXpos(), sprite.getYpos(), null);
        }
    }
}

package main.java;

import javax.swing.*;
import java.awt.*;

public class Sprites {
    private int xPos = 0;

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    private int yPos = 0;
    private String path;
    private Image sprite;

    public Sprites(String path) {
        this.path = path;
        this.sprite = new ImageIcon(path).getImage();
    }


}

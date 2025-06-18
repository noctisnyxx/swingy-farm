package main.java;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sprite {
    private final BufferedImage image;
    private int xpos, ypos;
    public Sprite(String path, int xpos, int ypos){
        try{
            this.image = ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public BufferedImage getImage(){
        return this.image;
    }
}

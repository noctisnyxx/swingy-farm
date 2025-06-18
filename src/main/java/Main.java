package main.java;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.logging.Logger;
public class Main{
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Random rand = new Random();
        GameWindow gameWindow = new GameWindow();
        GamePanel gamePanel = new GamePanel();
        gameWindow.add(gamePanel);
        gameWindow.run();
        gameWindow.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    Sprite newSprite = new Sprite("./assets/images/mysprite.png",
                            rand.nextInt(0, gameWindow.getWidth()),
                            rand.nextInt(0, gameWindow.getHeight())
                    );
                    gamePanel.deploySprite(newSprite);
                }

            }

        });
    }

}
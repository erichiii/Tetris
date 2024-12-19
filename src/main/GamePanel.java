package main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    public static final int width = 1280;
    public static final int height = 720;
    final int fps = 60;
    Thread gameThread;
    PlayManager playManager;

    public GamePanel() {
        //panel settings
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.black);
        this.setLayout(null);
        this.addKeyListener(new KeyHandler());
        this.setFocusable(true);

        playManager = new PlayManager();
    }

    //for launching gane
    public void launch(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override

    //game loop
    public void run() {
        double drawInterval = 1000000000/fps;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null){
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1){
                update();
                repaint();
                delta--;
            }
        }
    }

    //updating object positions, scores
    private void update() {
        playManager.update();
    }

    //drawing objects
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        playManager.draw(g2);
    }
}
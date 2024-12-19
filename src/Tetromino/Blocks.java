package Tetromino;

import java.awt.*;

public class Blocks extends Rectangle{
    public int x, y;
    public static final int size = 30;
    public Color c;

    public Blocks(Color c){
        this.c = c;
    }

    public void draw (Graphics2D g2){
        g2.setColor(c);
        g2.fillRect(x, y, size, size);
    }
}

package main;

import java.awt.*;
import Tetromino.*;

public class PlayManager {
    final int width = 360; //30 x 12
    final int height = 600; //30 x 20
    public static int leftX;
    public static int rightX;
    public static int topY;
    public static int bottomY;

    //minoess
    SuperMino currMino;
    final int minoStartX;
    final int minoStartY;

    public static int dropInterval = 60; //drops 60 fps

    public PlayManager(){
        leftX = (GamePanel.width/2) - (width/2);
        rightX = leftX + width;
        topY = 50;
        bottomY = topY + height;

        minoStartX = leftX + (width/2) - Blocks.size;
        minoStartY = topY + Blocks.size;

        //set starting mino
        currMino = new L1();
        currMino.setXY(minoStartX, minoStartY);
    }

    public void update(){
        currMino.update();
    }

    public void draw(Graphics2D g2){
        //draw play area frame

        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(leftX-4, topY-4, width+8, height+8);

        int x = rightX + 100;
        int y = bottomY - 200;
        g2.drawRect (x, y, 200, 200); //draw next block frame
        g2.setFont(new Font ("Arial", Font.BOLD, 20));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("Next Block", x+50, y+30);

        //draw currMino
        if(currMino != null){
            currMino.draw(g2);
        }
    }
}

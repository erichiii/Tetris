package Tetromino;

import java.awt.*;
import main.PlayManager;
import main.KeyHandler;

public class SuperMino{
    public Blocks b[] = new Blocks[4];
    public Blocks temp[] = new Blocks[4];
    int autoDropCounter = 0;
    public int direction = 1; 

    public void create(Color c){
        b[0] = new Blocks(c);
        b[1] = new Blocks(c);   
        b[2] = new Blocks(c);
        b[3] = new Blocks(c);
        temp[0] = new Blocks(c);
        temp[1] = new Blocks(c);
        temp[2] = new Blocks(c);
        temp[3] = new Blocks(c);
    }

    public void setXY(int x, int y){}

    public void updateXY(int direction){
        this.direction = direction;
        b[0].x = temp[0].x;
        b[0].y = temp[0].y;
        b[1].x = temp[1].x;
        b[1].y = temp[1].y;
        b[2].x = temp[2].x;
        b[2].y = temp[2].y;
        b[3].x = temp[3].x;
        b[3].y = temp[3].y;
    }

    public void getDirection1(){}
    public void getDirection2(){}
    public void getDirection3(){}
    public void getDirection4(){}

    public void update(){

        //moving the blockzz

        if (KeyHandler.up){
            switch(direction){
                case 1: getDirection2(); break;
                case 2: getDirection3(); break;
                case 3: getDirection4(); break;
                case 4: getDirection1(); break;
            }
            KeyHandler.up = false;
        }

        if(KeyHandler.down){
            b[0].y += Blocks.size;
            b[1].y += Blocks.size;
            b[2].y += Blocks.size;
            b[3].y += Blocks.size;

            autoDropCounter = 0;
            KeyHandler.down = false;
        }

        if(KeyHandler.right){
            b[0].x += Blocks.size;
            b[1].x += Blocks.size;
            b[2].x += Blocks.size;
            b[3].x += Blocks.size;
            KeyHandler.right = false;
        }

        if(KeyHandler.left){
            b[0].x -= Blocks.size;
            b[1].x -= Blocks.size;
            b[2].x -= Blocks.size;
            b[3].x -= Blocks.size;
            KeyHandler.left = false;
        }

        if (KeyHandler.space){
            
        }

        autoDropCounter++;
        if(autoDropCounter == PlayManager.dropInterval){
            b[0].y += Blocks.size;
            b[1].y += Blocks.size;
            b[2].y += Blocks.size;
            b[3].y += Blocks.size;
            autoDropCounter = 0;
        }
    }
    public void draw(Graphics2D g2){
        int margin = 2;
        g2.setColor(b[0].c);
        g2.fillRect(b[0].x+margin, b[0].y+margin, Blocks.size-(margin*2), Blocks.size-(margin*2));
        g2.fillRect(b[1].x+margin, b[1].y+margin, Blocks.size-(margin*2), Blocks.size-(margin*2));
        g2.fillRect(b[2].x+margin, b[2].y+margin, Blocks.size-(margin*2), Blocks.size-(margin*2));
        g2.fillRect(b[3].x+margin, b[3].y+margin, Blocks.size-(margin*2), Blocks.size-(margin*2));
    }
}
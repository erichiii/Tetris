package Tetromino;

import java.awt.*;

public class L1 extends SuperMino {
    public L1() {
        create(Color.ORANGE);
    }

    public void setXY(int x, int y){
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x;
        b[1].y = b[0].y - Blocks.size;
        b[2].x = b[0].x;
        b[2].y = b[0].y + Blocks.size;
        b[3].x = b[0].x + Blocks.size;
        b[3].y = b[0].y + Blocks.size;
    }

    public void getDirection1(){
        //o
        //o 
        //o o
        temp[0].x = b[0].x;
        temp[0].y = b[0].y;
        temp[1].x = b[0].x;
        temp[1].y = b[0].y - Blocks.size;
        temp[2].x = b[0].x;
        temp[2].y = b[0].y + Blocks.size;
        temp[3].x = b[0].x + Blocks.size;
        temp[3].y = b[0].y + Blocks.size;

        updateXY(1);
    }

    public void getDirection2(){
        //o o o
        //o
        temp[0].x = b[0].x;
        temp[0].y = b[0].y;
        temp[1].x = b[0].x+Blocks.size;
        temp[1].y = b[0].y;
        temp[2].x = b[0].x-Blocks.size;
        temp[2].y = b[0].y;
        temp[3].x = b[0].x-Blocks.size;
        temp[3].y = b[0].y+Blocks.size;
        updateXY(2);
    }

    public void getDirection3(){
        //o o
        //  o
        //  o

        temp[0].x = b[0].x;
        temp[0].y = b[0].y;
        temp[1].x = b[0].x;
        temp[1].y = b[0].y+Blocks.size;
        temp[2].x = b[0].x;
        temp[2].y = b[0].y-Blocks.size;
        temp[3].x = b[0].x-Blocks.size;
        temp[3].y = b[0].y-Blocks.size;
        updateXY(3);
    }
    public void getDirection4(){
        //    o
        //o o o
        temp[0].x = b[0].x;
        temp[0].y = b[0].y;
        temp[1].x = b[0].x-Blocks.size;
        temp[1].y = b[0].y;
        temp[2].x = b[0].x+Blocks.size;
        temp[2].y = b[0].y;
        temp[3].x = b[0].x+Blocks.size;
        temp[3].y = b[0].y-Blocks.size;
        updateXY(4);
    }
}
package main;

import java.awt.event.*;

public class KeyHandler implements KeyListener {
    public static boolean up, down, left, right, space;
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) {
            up = true;
        }
        if (code == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (code == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (code == KeyEvent.VK_RIGHT) {
            right = true;
        }
        if (code == KeyEvent.VK_SPACE) {
            space = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

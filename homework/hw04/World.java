package hw4.Snake;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

interface World {
    void draw(Graphics g);

    void update();

    boolean hasEnded();

    void mousePressed(MouseEvent e);

    void keyPressed(KeyEvent e);

}

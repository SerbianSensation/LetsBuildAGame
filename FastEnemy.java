package com.tutorial.main;

import java.awt.*;

public class FastEnemy extends GameObject{

    private Handler handler;

    public FastEnemy(int x, int y, ID id, Handler handler){
        super(x, y, id);
        this.handler=handler;
        //sets speed of FastEnemy
        speedX = 10;
        speedY = 10;
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, 16, 16);
    }

    public void tick(){
        x+=speedX;
        y+=speedY;

        if(y <= 0 || y >= Game.HEIGHT - 32)
            speedY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 16)
            speedX *= -1;

        handler.addObject(new Trail(x, y, ID.Trail, Color.CYAN, 16, 16, 0.02f, handler));
    }

    public void render(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 16, 16);
    }
}


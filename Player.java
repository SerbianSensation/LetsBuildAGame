package com.tutorial.main;

//import java.awt.Graphics;
//import java.awt.Color;
//import java.awt.Rectangle;
import java.awt.*;

public class Player extends GameObject{

    Handler handler;

    public Player(int x, int y, ID id, Handler handler){
        super(x, y, id);
        this.handler = handler;
    }

    @Override
    public Rectangle getBounds(){
        return new Rectangle(x, y, 32, 32);
    }
    @Override
    public void tick(){
        //makes the player move
        x+=speedX;
        y+=speedY;
        //limits how far the player can go vertically and horizontally
        x = Game.clamp(x, 0, Game.WIDTH - 32);
        y = Game.clamp(y, 0, Game.HEIGHT - 60);

        collision();
    }

    private void collision(){
        for(int i=0; i<handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getID() == ID.BasicEnemy || tempObject.getID() == ID.FastEnemy){
                if(getBounds().intersects(tempObject.getBounds())){
                    //collision code
                    HUD.HEALTH -= 2;
                }
            }
        }
    }

    @Override
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);
    }
}

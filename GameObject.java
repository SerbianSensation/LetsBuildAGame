package com.tutorial.main;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

    protected int x,y;
    protected ID id;
    protected int speedX, speedY;

    public GameObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();

    //getters and setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setID(ID id){
        this.id = id;
    }
    public ID getID(){
        return id;
    }
    public void setSpeedX(int speedX){
        this.speedX=speedX;
    }
    public void setSpeedY(int speedY){
        this.speedY=speedY;
    }
    public int getSpeedX(){
        return speedX;
    }
    public int getSpeedY(){
        return speedY;
    }

}

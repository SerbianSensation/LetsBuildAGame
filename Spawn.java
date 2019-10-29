package com.tutorial.main;

import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private Random r = new Random();

    private int scoreKeep = 0;

    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }

    public void tick(){
        scoreKeep++;
        //if score reaches another 500 up the level
        //spawn another enemy depending on the level
        if(scoreKeep >= 500) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);
            //if low level add one basic enemy
            if(hud.getLevel() <= 3)
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 25), r.nextInt(Game.HEIGHT - 25), ID.BasicEnemy, handler));
            else//if higher level add fast enemy
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 25), r.nextInt(Game.HEIGHT - 25), ID.FastEnemy, handler));
        }
    }

}

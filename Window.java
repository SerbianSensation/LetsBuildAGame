package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

    private static final long serialVersionUID = -240840600533728354L;

    public Window(int width, int height, String title, Game game){
        //the frame of our window
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        //exits operation when red X is hit in top right corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        //starts window in middle of screen
        frame.setLocationRelativeTo(null);

        frame.add(game);
        //makes frame visible
        frame.setVisible(true);

        game.start();
    }
}

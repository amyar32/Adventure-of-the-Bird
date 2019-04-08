import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
    public static final GreenfootSound backgroundMusic = new GreenfootSound("Dead.mp3");
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(800, 600, 1); 
       GreenfootImage bgBirdWorld = new GreenfootImage("GameOver_Background.jpg");
       bgBirdWorld.scale(getWidth(), getHeight());
       setBackground(bgBirdWorld);
       backgroundMusic.playLoop();
    }
}

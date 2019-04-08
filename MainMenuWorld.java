import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuWorld extends World
{

    /**
     * Constructor for objects of class MainMenuWorld.
     * 
     */
    public MainMenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage bgBirdWorld = new GreenfootImage("MainMenu_Background.jpg");
        bgBirdWorld.scale(getWidth(), getHeight());
        setBackground(bgBirdWorld);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new BirdWorld());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

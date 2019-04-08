import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyThree extends Actor
{
    private static final int speed = -4;
    /**
     * Act - do whatever the EnemyOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(speed);
       if(Greenfoot.getRandomNumber(100) < 10)
       {
        turn(Greenfoot.getRandomNumber(90) - 45);
       }
       if(isAtEdge())
       {
        turn(180);
        }
       if (getOneIntersectingObject(Sprite.class) != null) 
       {
           move(-speed);
           turn(180);
       }
    }    
}

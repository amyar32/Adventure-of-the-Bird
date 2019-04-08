import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private static final int speed = 5;
    private static double lives = 3.0;
    private static int energy = 1000;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int counter = 0;
    private int main;
    private int score;

 
    public Player()
    {
        image1 = new GreenfootImage("BlueJay1.png");
        image2 = new GreenfootImage("BlueJay2.png");
        setImage(image1);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animation();
        movement();
        mainplay();
        enemyplay();
        scoreboard();
        dead();
    }    
    
    private void movement()
    {
        if(Greenfoot.isKeyDown("A")) turn(-speed);
        if(Greenfoot.isKeyDown("D")) turn(speed);
        if(Greenfoot.isKeyDown("W")) move(speed);
    }
    
    private void animation()
    {
        counter++;
        if(counter == 5)
        {
            if(getImage() == image1) 
            {
                setImage(image2);
            }
            else
            {
                setImage(image1);
            }
            counter = 0;
        }
    }
    
    private void mainplay()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            main += 1;
            score += 100;
        }
        energy--;
        if(isTouching(Door.class))
        {
            if(Greenfoot.isKeyDown("Y")) 
            {
                Greenfoot.setWorld(new EnergyWorld());
                BirdWorld.backgroundMusic.stop();
            }
            
        }
        if(isTouching(DoorTwo.class))
        {
            if(Greenfoot.isKeyDown("Y")) 
            {
                Greenfoot.setWorld(new BirdWorld());
                EnergyWorld.backgroundMusic.stop();
            
            }
        }
        if(isTouching(Fruit1.class))
        {
            removeTouching(Fruit1.class);
            energy += 100;
        }
        if(isTouching(Fruit2.class))
        {
            removeTouching(Fruit2.class);
            energy += 500;
        }
        if(isTouching(Fruit3.class))
        {
            removeTouching(Fruit3.class);
            energy += 1000;
        }
        if(main == 9)
        {
            Greenfoot.setWorld(new SuccessWorld());
        }
    }
    
    private void enemyplay()
    {
        if(lives !=0)
        {
            if(isTouching(EnemyOne.class))
            {
                lives -= 1.0;
            }
            if(isTouching(EnemyTwo.class))
            {
                removeTouching(EnemyTwo.class);
                lives -= 0.5;
            }
            if(isTouching(EnemyThree.class))
            {
                lives -= 1.0;
            }
        }
        

    }
    
    private void dead()
    {
        if(lives == 0)
        {
            BirdWorld.backgroundMusic.stop();
            EnergyWorld.backgroundMusic.stop();
            Greenfoot.setWorld(new GameOverWorld());
        }
        if(energy == 0)
        {
            BirdWorld.backgroundMusic.stop();
            EnergyWorld.backgroundMusic.stop();
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
    private void intersect()
    {
        if (getOneIntersectingObject(Sprite.class) != null) move(-speed);
    }
    
    private void scoreboard()
    {
        getWorld().showText("Score  : " + score, 50, 20);
        getWorld().showText("Health  : " + lives, 55, 40);
        getWorld().showText("Worm(Jamur Ungu)   : " + main + "/9", 122, 60);
        getWorld().showText("Energy : " + energy, 63, 80);
    }
}

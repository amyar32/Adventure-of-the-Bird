import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnergyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnergyWorld extends World
{
    public static final GreenfootSound backgroundMusic = new GreenfootSound("Asgore.mp3");
    
    //Variabel acak respawn cacing
    private int respawnWorm = 200, respawnWormReset = respawnWorm;
    private Worm worm = new Worm();
    /**
     * Constructor for objects of class EnergyWorld.
     * 
     */
    public EnergyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        GreenfootImage bgBirdWorld = new GreenfootImage("EnergyWorld_Background.png");
        bgBirdWorld.scale(getWidth(), getHeight());
        setBackground(bgBirdWorld);
        backgroundMusic.playLoop();
        prepare();
    }
    
    public void act()
    {
        //Method acak respawn cacing
        respawnWorm();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SpriteD2 spriteD2 = new SpriteD2();
        addObject(spriteD2,123,168);
        SpriteD2 spriteD22 = new SpriteD2();
        addObject(spriteD22,154,168);
        SpriteD2 spriteD23 = new SpriteD2();
        addObject(spriteD23,185,168);
        SpriteF1 spriteF1 = new SpriteF1();
        addObject(spriteF1,91,168);
        SpriteF3 spriteF3 = new SpriteF3();
        addObject(spriteF3,216,168);
        SpriteB1 spriteB1 = new SpriteB1();
        addObject(spriteB1,92,137);
        SpriteB2 spriteB2 = new SpriteB2();
        addObject(spriteB2,123,137);
        SpriteB2 spriteB22 = new SpriteB2();
        addObject(spriteB22,154,137);
        SpriteB2 spriteB23 = new SpriteB2();
        addObject(spriteB23,185,137);
        SpriteB3 spriteB3 = new SpriteB3();
        addObject(spriteB3,215,137);
        SpriteB1 spriteB12 = new SpriteB1();
        addObject(spriteB12,385,274);
        SpriteB2 spriteB24 = new SpriteB2();
        addObject(spriteB24,417,274);
        SpriteB2 spriteB25 = new SpriteB2();
        addObject(spriteB25,448,274);
        SpriteB2 spriteB26 = new SpriteB2();
        addObject(spriteB26,479,274);
        SpriteB3 spriteB32 = new SpriteB3();
        addObject(spriteB32,510,274);
        SpriteD4 spriteD4 = new SpriteD4();
        addObject(spriteD4,542,305);
        SpriteB3 spriteB33 = new SpriteB3();
        addObject(spriteB33,573,304);
        SpriteD3 spriteD3 = new SpriteD3();
        addObject(spriteD3,511,305);
        SpriteC2 spriteC2 = new SpriteC2();
        addObject(spriteC2,480,305);
        SpriteC2 spriteC22 = new SpriteC2();
        addObject(spriteC22,450,305);
        SpriteC2 spriteC23 = new SpriteC2();
        addObject(spriteC23,419,304);
        SpriteC1 spriteC1 = new SpriteC1();
        addObject(spriteC1,387,305);
        SpriteF1 spriteF12 = new SpriteF1();
        addObject(spriteF12,387,336);
        SpriteD2 spriteD24 = new SpriteD2();
        addObject(spriteD24,419,335);
        SpriteD2 spriteD25 = new SpriteD2();
        addObject(spriteD25,450,337);
        SpriteD2 spriteD26 = new SpriteD2();
        addObject(spriteD26,481,336);
        SpriteD2 spriteD27 = new SpriteD2();
        addObject(spriteD27,512,335);
        SpriteD2 spriteD28 = new SpriteD2();
        addObject(spriteD28,543,336);
        SpriteF3 spriteF32 = new SpriteF3();
        addObject(spriteF32,574,336);
        SpriteG1 spriteG1 = new SpriteG1();
        addObject(spriteG1,459,82);
        SpriteG2 spriteG2 = new SpriteG2();
        addObject(spriteG2,491,82);
        SpriteG3 spriteG3 = new SpriteG3();
        addObject(spriteG3,521,82);
        SpriteG1 spriteG12 = new SpriteG1();
        addObject(spriteG12,490,492);
        SpriteG3 spriteG32 = new SpriteG3();
        addObject(spriteG32,522,492);
        SpriteG1 spriteG13 = new SpriteG1();
        addObject(spriteG13,39,327);
        SpriteG3 spriteG33 = new SpriteG3();
        addObject(spriteG33,70,327);
        SpriteG1 spriteG14 = new SpriteG1();
        addObject(spriteG14,192,465);
        SpriteG3 spriteG34 = new SpriteG3();
        addObject(spriteG34,224,465);
        SpriteG3 spriteG35 = new SpriteG3();
        addObject(spriteG35,407,569);
        SpriteG1 spriteG15 = new SpriteG1();
        addObject(spriteG15,375,569);
        SpriteG3 spriteG36 = new SpriteG3();
        addObject(spriteG36,318,330);
        SpriteG1 spriteG16 = new SpriteG1();
        addObject(spriteG16,286,330);
        SpriteG1 spriteG17 = new SpriteG1();
        addObject(spriteG17,28,586);
        SpriteG3 spriteG37 = new SpriteG3();
        addObject(spriteG37,59,586);

        //Membuat pintu
        DoorTwo doorTwo = new DoorTwo();
        addObject(doorTwo,43,551);

        //Membuat musuh
        EnemyTwo enemyTwo = new EnemyTwo();
        addObject(enemyTwo,203,468);
        EnemyTwo enemyTwo2 = new EnemyTwo();
        addObject(enemyTwo2,302,333);
        EnemyTwo enemyTwo3 = new EnemyTwo();
        addObject(enemyTwo3,62,329);
        EnemyTwo enemyTwo4 = new EnemyTwo();
        addObject(enemyTwo4,558,327);
        EnemyTwo enemyTwo5 = new EnemyTwo();
        addObject(enemyTwo5,506,495);
        EnemyTwo enemyTwo6 = new EnemyTwo();
        addObject(enemyTwo6,494,291);
        EnemyTwo enemyTwo7 = new EnemyTwo();
        addObject(enemyTwo7,198,159);
        EnemyTwo enemyTwo8 = new EnemyTwo();
        addObject(enemyTwo8,135,152);
        EnemyThree enemyThree = new EnemyThree();
        addObject(enemyThree,484,186);
        EnemyThree enemyThree2 = new EnemyThree();
        addObject(enemyThree2,143,63);
        EnemyThree enemyThree3 = new EnemyThree();
        addObject(enemyThree3,509,411);
        EnemyThree enemyThree4 = new EnemyThree();
        addObject(enemyThree4,189,283);

        //Menambahkan buah
        Fruit1 fruit1 = new Fruit1();
        addObject(fruit1,206,432);
        Fruit1 fruit12 = new Fruit1();
        addObject(fruit12,389,536);
        Fruit1 fruit13 = new Fruit1();
        addObject(fruit13,51,293);
        Fruit2 fruit2 = new Fruit2();
        addObject(fruit2,505,460);
        Fruit2 fruit22 = new Fruit2();
        addObject(fruit22,299,297);
        Fruit2 fruit23 = new Fruit2();
        addObject(fruit23,152,96);
        Fruit1 fruit14 = new Fruit1();
        addObject(fruit14,127,97);
        Fruit1 fruit15 = new Fruit1();
        addObject(fruit15,175,96);
        Fruit2 fruit24 = new Fruit2();
        addObject(fruit24,551,264);
        Fruit2 fruit25 = new Fruit2();
        addObject(fruit25,571,263);
        Fruit1 fruit16 = new Fruit1();
        addObject(fruit16,407,233);
        Fruit2 fruit26 = new Fruit2();
        addObject(fruit26,425,232);
        Fruit1 fruit17 = new Fruit1();
        addObject(fruit17,442,233);
        Fruit3 fruit3 = new Fruit3();
        addObject(fruit3,487,34);
        Fruit2 fruit27 = new Fruit2();
        addObject(fruit27,465,47);
        Fruit2 fruit28 = new Fruit2();
        addObject(fruit28,506,45);
        Fruit1 fruit18 = new Fruit1();
        addObject(fruit18,486,52);

        //Membuat pemain utama
        Player player = new Player();
        addObject(player,57,528);
        player.setLocation(43,551);


    }
    
    //Method acak respawn cacing
    private void respawnWorm()
    {
        if(--respawnWorm==170)
        {
            addObject(worm, Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
        if(respawnWorm==0)
        {
            removeObject(worm);
            respawnWorm = respawnWormReset;
        }

    }
}

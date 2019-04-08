import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdWorld extends World
{
    public static final GreenfootSound backgroundMusic = new GreenfootSound("Bergentruckung.mp3");
    //Variabel acak respawn cacing
    private int respawnWorm = 200, respawnWormReset = respawnWorm;
    private Worm worm = new Worm();
    /**
     * Constructor for objects of class BirdWorld.
     * 
     */
    public BirdWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage bgBirdWorld = new GreenfootImage("BirdWorld_Background.png");
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
        //Membuat objek benda-benda mati
        SpriteG1 spriteG1 = new SpriteG1();
        addObject(spriteG1,67,95);
        SpriteG2 spriteG2 = new SpriteG2();
        addObject(spriteG2,99,96);
        SpriteG3 spriteG3 = new SpriteG3();
        addObject(spriteG3,129,96);
        spriteG1.setLocation(70,96);
        SpriteG1 spriteG12 = new SpriteG1();
        addObject(spriteG12,239,175);
        SpriteG2 spriteG22 = new SpriteG2();
        addObject(spriteG22,271,175);
        SpriteG2 spriteG23 = new SpriteG2();
        addObject(spriteG23,302,175);
        SpriteG2 spriteG24 = new SpriteG2();
        addObject(spriteG24,333,175);
        SpriteG3 spriteG32 = new SpriteG3();
        addObject(spriteG32,363,175);
        SpriteG1 spriteG13 = new SpriteG1();
        addObject(spriteG13,418,97);
        SpriteG2 spriteG25 = new SpriteG2();
        addObject(spriteG25,450,97);
        SpriteG3 spriteG33 = new SpriteG3();
        addObject(spriteG33,480,97);
        SpriteG1 spriteG14 = new SpriteG1();
        addObject(spriteG14,533,232);
        SpriteG2 spriteG26 = new SpriteG2();
        addObject(spriteG26,565,232);
        SpriteG2 spriteG27 = new SpriteG2();
        addObject(spriteG27,596,232);
        SpriteG2 spriteG28 = new SpriteG2();
        addObject(spriteG28,627,232);
        SpriteG2 spriteG29 = new SpriteG2();
        addObject(spriteG29,658,232);
        SpriteG2 spriteG210 = new SpriteG2();
        addObject(spriteG210,689,231);
        SpriteG3 spriteG34 = new SpriteG3();
        addObject(spriteG34,719,231);
        Sprite01 sprite01 = new Sprite01();
        addObject(sprite01,89,555);
        Water01 water01 = new Water01();
        addObject(water01,195,588);
        SpriteC1 spriteC1 = new SpriteC1();
        addObject(spriteC1,225,584);
        SpriteC1 spriteC12 = new SpriteC1();
        addObject(spriteC12,225,553);
        SpriteC1 spriteC13 = new SpriteC1();
        addObject(spriteC13,225,523);
        SpriteB1 spriteB1 = new SpriteB1();
        addObject(spriteB1,225,493);
        SpriteC2 spriteC2 = new SpriteC2();
        addObject(spriteC2,256,587);
        SpriteC2 spriteC22 = new SpriteC2();
        addObject(spriteC22,256,558);
        SpriteB2 spriteB2 = new SpriteB2();
        addObject(spriteB2,256,493);
        SpriteC2 spriteC23 = new SpriteC2();
        addObject(spriteC23,256,526);
        spriteC23.setLocation(256,522);
        SpriteC2 spriteC24 = new SpriteC2();
        addObject(spriteC24,256,522);
        spriteC23.setLocation(255,541);
        SpriteC2 spriteC25 = new SpriteC2();
        addObject(spriteC25,255,541);
        SpriteB2 spriteB22 = new SpriteB2();
        addObject(spriteB22,286,493);
        SpriteB2 spriteB23 = new SpriteB2();
        addObject(spriteB23,316,492);
        SpriteB2 spriteB24 = new SpriteB2();
        addObject(spriteB24,347,493);
        SpriteC2 spriteC26 = new SpriteC2();
        addObject(spriteC26,286,523);
        SpriteC2 spriteC27 = new SpriteC2();
        addObject(spriteC27,317,522);
        SpriteC2 spriteC28 = new SpriteC2();
        addObject(spriteC28,346,524);
        SpriteC2 spriteC29 = new SpriteC2();
        addObject(spriteC29,286,553);
        SpriteC2 spriteC210 = new SpriteC2();
        addObject(spriteC210,316,552);
        SpriteC2 spriteC211 = new SpriteC2();
        addObject(spriteC211,346,553);
        SpriteC2 spriteC212 = new SpriteC2();
        addObject(spriteC212,286,584);
        SpriteC2 spriteC213 = new SpriteC2();
        addObject(spriteC213,315,584);
        SpriteC2 spriteC214 = new SpriteC2();
        addObject(spriteC214,347,583);
        spriteC213.setLocation(318,573);
        SpriteC2 spriteC215 = new SpriteC2();
        addObject(spriteC215,318,573);
        spriteC214.setLocation(334,593);
        SpriteC2 spriteC216 = new SpriteC2();
        addObject(spriteC216,334,593);
        spriteC27.setLocation(309,522);
        SpriteC2 spriteC217 = new SpriteC2();
        addObject(spriteC217,309,522);
        spriteC28.setLocation(343,517);
        SpriteC2 spriteC218 = new SpriteC2();
        addObject(spriteC218,343,517);
        SpriteB3 spriteB3 = new SpriteB3();
        addObject(spriteB3,376,493);
        SpriteC3 spriteC3 = new SpriteC3();
        addObject(spriteC3,376,524);
        SpriteC3 spriteC32 = new SpriteC3();
        addObject(spriteC32,376,554);
        SpriteC3 spriteC33 = new SpriteC3();
        addObject(spriteC33,377,585);
        spriteC28.setLocation(329,527);
        SpriteC2 spriteC219 = new SpriteC2();
        addObject(spriteC219,329,527);
        spriteC214.setLocation(348,585);
        SpriteC2 spriteC220 = new SpriteC2();
        addObject(spriteC220,348,585);
        spriteC213.setLocation(305,585);
        SpriteC2 spriteC221 = new SpriteC2();
        addObject(spriteC221,305,585);
        spriteC28.setLocation(348,523);
        SpriteC2 spriteC222 = new SpriteC2();
        addObject(spriteC222,348,523);
        spriteC211.setLocation(347,568);
        SpriteC2 spriteC223 = new SpriteC2();
        addObject(spriteC223,347,568);
        spriteC27.setLocation(320,521);
        SpriteC2 spriteC224 = new SpriteC2();
        addObject(spriteC224,320,521);
        SpriteC2 spriteC225 = new SpriteC2();
        addObject(spriteC225,303,567);
        SpriteC2 spriteC226 = new SpriteC2();
        addObject(spriteC226,345,548);
        SpriteG1 spriteG15 = new SpriteG1();
        addObject(spriteG15,39,460);
        SpriteG2 spriteG211 = new SpriteG2();
        addObject(spriteG211,70,460);
        SpriteG2 spriteG212 = new SpriteG2();
        addObject(spriteG212,101,460);
        SpriteG2 spriteG213 = new SpriteG2();
        addObject(spriteG213,132,460);
        SpriteG3 spriteG35 = new SpriteG3();
        addObject(spriteG35,163,460);
        Box1 box1 = new Box1();
        addObject(box1,298,471);
        Box1 box12 = new Box1();
        addObject(box12,318,470);
        Box1 box13 = new Box1();
        addObject(box13,306,452);
        Tree2 tree2 = new Tree2();
        addObject(tree2,271,446);
        Tree2 tree22 = new Tree2();
        addObject(tree22,356,447);
        Tree1 tree1 = new Tree1();
        addObject(tree1,236,444);
        SpriteG1 spriteG16 = new SpriteG1();
        addObject(spriteG16,429,569);
        SpriteG3 spriteG36 = new SpriteG3();
        addObject(spriteG36,460,569);
        SpriteG1 spriteG17 = new SpriteG1();
        addObject(spriteG17,608,549);
        SpriteG3 spriteG37 = new SpriteG3();
        addObject(spriteG37,639,549);
        SpriteG1 spriteG18 = new SpriteG1();
        addObject(spriteG18,698,410);
        SpriteG3 spriteG38 = new SpriteG3();
        addObject(spriteG38,729,410);
        SpriteG1 spriteG19 = new SpriteG1();
        addObject(spriteG19,483,354);
        SpriteG3 spriteG39 = new SpriteG3();
        addObject(spriteG39,514,354);
        spriteC226.setLocation(355,542);
        SpriteC2 spriteC227 = new SpriteC2();
        addObject(spriteC227,355,542);
        spriteC210.setLocation(328,551);
        SpriteC2 spriteC228 = new SpriteC2();
        addObject(spriteC228,328,551);
        SpriteC2 spriteC229 = new SpriteC2();
        addObject(spriteC229,306,545);

        //Membuat musuh
        EnemyTwo enemyTwo = new EnemyTwo();
        addObject(enemyTwo,109,79);
        EnemyTwo enemyTwo2 = new EnemyTwo();
        addObject(enemyTwo2,346,160);
        EnemyTwo enemyTwo3 = new EnemyTwo();
        addObject(enemyTwo3,641,217);
        EnemyTwo enemyTwo4 = new EnemyTwo();
        addObject(enemyTwo4,476,338);
        EnemyTwo enemyTwo5 = new EnemyTwo();
        addObject(enemyTwo5,281,160);
        EnemyTwo enemyTwo6 = new EnemyTwo();
        addObject(enemyTwo6,443,555);
        EnemyTwo enemyTwo7 = new EnemyTwo();
        addObject(enemyTwo7,733,395);
        EnemyOne enemyOne = new EnemyOne();
        addObject(enemyOne,657,129);
        EnemyOne enemyOne2 = new EnemyOne();
        addObject(enemyOne2,710,324);
        EnemyOne enemyOne3 = new EnemyOne();
        addObject(enemyOne3,727,558);
        EnemyOne enemyOne4 = new EnemyOne();
        addObject(enemyOne4,441,246);
        EnemyOne enemyOne5 = new EnemyOne();
        addObject(enemyOne5,249,53);
        EnemyTwo enemyTwo8 = new EnemyTwo();
        addObject(enemyTwo8,119,79);
        EnemyTwo enemyTwo9 = new EnemyTwo();
        addObject(enemyTwo9,116,85);
        EnemyTwo enemyTwo10 = new EnemyTwo();
        addObject(enemyTwo10,289,159);
        EnemyTwo enemyTwo11 = new EnemyTwo();
        enemyTwo10.setLocation(288,162);
        addObject(enemyTwo11,288,162);
        EnemyTwo enemyTwo12 = new EnemyTwo();
        addObject(enemyTwo12,462,83);
        EnemyTwo enemyTwo13 = new EnemyTwo();
        addObject(enemyTwo13,470,82);
        enemyTwo12.setLocation(466,85);
        EnemyTwo enemyTwo14 = new EnemyTwo();
        addObject(enemyTwo14,466,85);

        //Membuat pintu ke energy world
        Door door = new Door();
        addObject(door,309,444);

        //Membuat pemain utama
        Player player = new Player();
        addObject(player,57,528);

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

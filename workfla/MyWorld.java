import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World{
    private static final String bgImageName = "images/bg.png";
    private static final double scrollSpeed = 2;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();

    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    int counter = 0;
    private boolean over;
    //private int score;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1200, 675,1,true);
        over = false;
        Score score = new Score();
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
        addObject(score,977,55);
        Score.score = 0;
    }

    public void act()
    {
        checkOver();
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
        if(!over){
            counter++;
            if(counter == 450){
                Tempu tempu = new Tempu();
                addObject(tempu, getWidth(),597);
                counter = Greenfoot.getRandomNumber(40);
            }
            counter++;
            if(counter == 1000){
                Bomb bomb = new Bomb();
                addObject(bomb, getWidth(),610);
                counter = Greenfoot.getRandomNumber(100);
            }
            counter++;
            if(counter == 700){
                Fish fish = new Fish();
                addObject(fish, getWidth(),610);
                counter = Greenfoot.getRandomNumber(95);
            }
            counter++;
            if(counter == 890){
                Sword sword = new Sword();
                addObject(sword, getWidth(),610);
                counter = Greenfoot.getRandomNumber(75);
            }
            counter++;
            if(counter == 570){
                Weed weed = new Weed();
                addObject(weed, getWidth(),610);
                counter = Greenfoot.getRandomNumber(80);
            }
        }
        else
        {
            
        }
    }
    
    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        flamingo flamingo = new flamingo();
        addObject(flamingo,213,537);
    }

    public void checkOver(){
        if(getObjects(flamingo.class).isEmpty()){
            over = true;
        }
    }
    
}
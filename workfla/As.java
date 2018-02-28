import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class As here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class As extends World
{
    private static final String bgImageName = "images/bgw.png";
    private static final double scrollSpeed = 2;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();

    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    /**
     * Constructor for objects of class As.
     * 
     */
    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
    public As()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1); 
        Bs bs = new Bs();
        addObject(bs,600,(675/2));
        addObject(new Start(),getWidth()/2,getHeight()/2+250);
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
        }
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
}
}
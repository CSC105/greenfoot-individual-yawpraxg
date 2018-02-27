import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weed extends Actor
{
    /**
     * Act - do whatever the Weed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void WeedTouch(){
        //Actor w = getOneObjectAtOffset(0,195,flamingo.class);
        if(isTouching(flamingo.class)){
            //Greenfoot.stop();
            getWorld().addObject(new Endweed(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().addObject(new Wasted(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            removeTouching(flamingo.class);
        }
    }
    public void act() 
    {
        // Add your action code here.
        WeedTouch();
        MoveWeed();
    }    
    public void MoveWeed(){
        setLocation(getX()-5,getY());
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tempu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tempu extends Actor
{
    /**
     * Act - do whatever the tempu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MoveTempu();
    }   
    public void MoveTempu(){
        setLocation(getX()-5,getY());
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}

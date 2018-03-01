import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endweed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endweed extends Actor
{
    /**
     * Act - do whatever the Endweed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
        }else{
        }
    }    
}

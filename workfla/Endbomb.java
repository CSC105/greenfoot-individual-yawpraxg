import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endbomb extends Actor
{ 
    GreenfootSound stsong = new GreenfootSound("sounds/bomb.mp3");
    public void checkSound()
    {
        if(!stsong.isPlaying())
        {
            stsong.play();  
        }
    }
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkSound();
        if(Greenfoot.isKeyDown("enter")){
            stsong.stop();
            Greenfoot.setWorld(new MyWorld());
        }else{
        
        }
    }    
}

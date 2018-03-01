import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound stsong = new GreenfootSound("sounds/start.mp3");
       //public void checkSound()
    //{
        //if(!stsong.isPlaying())
        //{
            //stsong.play();  
        //}
    //}
    public void act() 
    {
        // Add your action code here.
        //checkSound();
        
        setImage(new GreenfootImage("enter to start",24,Color.WHITE,new Color(0,0,0,0)));
        if(Greenfoot.isKeyDown("enter")){
            //stsong.stop();
            //Greenfoot.delay(5);
            Greenfoot.setWorld(new MyWorld());
        }else{
        }
    }    
    
   
}

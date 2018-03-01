import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endsword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endsword extends Actor
{
    //Score score = new Score();
    //public void ScoreOver(){
    //addObject(new Score(),450,500);
    //}
    /**
     * Act - do whatever the Endsword wants to do. This method is called whenever
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

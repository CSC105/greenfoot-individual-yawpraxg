import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sword extends Actor
{
    /**
     * Act - do whatever the sword wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void SwordTouch(){
        //Actor w = getOneObjectAtOffset(0,195,flamingo.class);
        if(isTouching(flamingo.class)){
            //Greenfoot.stop();
            getWorld().addObject(new Endsword(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().addObject(new Wasted(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().addObject(new Score(),getWorld().getWidth()/2,getWorld().getHeight()/2+100);
            getWorld().addObject(new Retry(),getWorld().getWidth()/2,getWorld().getHeight()/2+150);
            removeTouching(flamingo.class);
        }
    }
    public void act() 
    {
        // Add your action code here.
        SwordTouch();
        MoveSword();
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
        }else{
        }
    }    
    public void MoveSword(){
        setLocation(getX()-5,getY());
        if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}

import greenfoot.*;
import greenfoot.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public static int score = 0;
    //int groundLevel = 537;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score(){
    }
    public void act() 
    {
        // Add your action code here.

        setImage(new GreenfootImage("SCORE : " + score,30,Color.WHITE,new Color(0,0,0,0)));
    }    
}

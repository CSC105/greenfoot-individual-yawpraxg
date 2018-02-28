import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flamingo extends Actor
{
    /**
     * Act - do whatever the flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int ySpeed;
    private int speed;
    //private int Score;
    GreenfootImage[] images = new GreenfootImage[36];
        int imageNumber;
        
        //int score;
        public flamingo(){
            for(int i = 0; i<images.length; i++){
            images[i] = new GreenfootImage("images/Flamingo/Flamingo" +(i+1)+".png");
            images[i].scale(120,195);
            setImage(images[imageNumber]);
        }
       }
       public void Animation(){
        imageNumber = (imageNumber + 1)% images.length;
            setImage(images[imageNumber]);

        }
    

    public void act() 
    {
        Animation();
        Jump();
        Getscore();
        // Add flaminyour action code here.
    }   
    public void Jump(){
        int groundLevel = 537;
        boolean onGround = (getY() == groundLevel);
        if(!onGround){
            ySpeed++;
            setLocation(getX(), getY()+ySpeed);
            if(getY() >= groundLevel){
                setLocation(getX(), groundLevel);
                Greenfoot.getKey();
            }
        }else{
            if("space".equals(Greenfoot.getKey())){
            ySpeed = -27;
            setLocation(getX(), getY()+ySpeed);
            }
        }
        
        
    }
    
    public void Getscore(){
        if(isTouching(Fish.class) == true){
            removeTouching(Fish.class);
            Score.score += 2;
        }
        if(isTouching(Tempu.class) == true){
            removeTouching(Tempu.class);
            Score.score += 2;
        }
    }
    public void Retry(){
        if(Greenfoot.isKeyDown("space")){
          Score.score = 0;
          Greenfoot.setWorld(new MyWorld());
        }
    }
}
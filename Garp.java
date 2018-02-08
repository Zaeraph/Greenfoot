import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garp here.
 * Damien Out
 * 06/02/2018
 */
public class Garp extends Actor
{
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;

    public Garp()
    {
           imageLeft = new GreenfootImage("GarpLeft.png");
           imageRight = new GreenfootImage("GarpRight.png");
    }
    public void act(){
    movingAndTurning();
    collectingRupees();
    }
    
    
    protected void movingAndTurning() 
    {
       if(Greenfoot.isKeyDown("right")){
        if(getImage() == imageLeft){
            setImage(imageRight);
        }
        setRotation(0);
        move(5);
       }
       if(Greenfoot.isKeyDown("left")){
        if(getImage() != imageLeft){
            setImage(imageLeft);
       }
       setRotation(0);
       move(-5);
        }
       if(Greenfoot.isKeyDown("up")){
        if(getImage() == imageLeft) {
            setImage(imageRight);
        }   
        setRotation(-90);
        move(5);
        }
       if(Greenfoot.isKeyDown("down")){
        if(getImage() == imageLeft){
            setImage(imageRight);
        }
        setRotation(90);
        move(5);
       }
    }  
    
    protected void collectingRupees(){
        Actor rupee;
        World world;
        
        rupee = getOneObjectAtOffset(0, 0, Rupee.class);
        if(rupee != null) {
            world = getWorld();
            world.removeObject(rupee);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GarpsGame here.
 * 
 * @author (Damien Out)
 * @version (0.0.0.1)
 */
public class GarpsGame extends World
{
    private GreenfootSound sound;
    
    /**
     * Constructor for objects of class GarpsGame.
     * 100px extra.
     */
    public GarpsGame()
    {    
      super(700, 500, 1); 
      populateTheWorld();
      sound = new GreenfootSound("TranceMusic.mp3");
    }
    
    protected void populateTheWorld(){
        int teller;
        
        addObject(new Garp(), 350, 250);
        addObject(new Gnomus(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        for(teller = 0; teller < 10; teller++){
            addObject(new Rupee(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        }
        for(teller = 0; teller < 6; teller++){
            addObject(new Rock(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        }
        for(teller = 0; teller < 4; teller++){
            addObject(new Bomb(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(500));
        }
        setPaintOrder(Garp.class, Gnomus.class, Rupee.class, Bomb.class, Rock.class);
    }
    
    public void started(){
        sound.playLoop();
    }
    public void stopped(){
        sound.stop();
    }
}

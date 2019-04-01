import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Korb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Korb extends Actor
{
    /**
     * Act - do whatever the Korb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int groeße;
    
    public void act() 
    {
        // Add your action code here.
        
        bewegen();
    }  
    
    public Korb()
    {
    setRotation(270);
    }
    public void bewegen()
    {
        
       
        int y = getY();
        if(y >= 350)
        {
            turn(180);
             move(15);
           
        }
        if ( y > 50 && y < 350)
        {
             move(15);
            }
       if(y <= 50)
       {
           turn (180);
            move(15);
        }
    }
    
}

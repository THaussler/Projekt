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
             move(5);
           
        }
        if ( y > 50 && y < 350)
        {
             move(5);
            }
       if(y <= 50)
       {
           turn (180);
            move(5);
        }
    }
    
    public boolean getroffen(Ball b)
    {
        boolean t;
        if(intersects(b)==true)
        {
            t = true;
        }
        else
        {
            t = false;
        }
        return t;
    }
    
    public boolean berührt(Class Ball)
    {
        boolean v;
        if(isTouching(Ball)==true)
        {
            v = true;
        }
        else
        {
            v = false;
        }
        return v;
    }
    
}

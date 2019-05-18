import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Richtungsanzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Richtungsanzeige extends Actor
{
    /**
     * Act - do whatever the Richtungsanzeige wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int i = 0;
    
    public void act() 
    { 
        
        if(i == 0)
        {Richtungsauswahl();
        }
        if(Greenfoot.isKeyDown("space"))
        {
            i++;
            
        }
        gibRichtung();
        // Add your action code here.
    } 
    public Richtungsanzeige()
    {
    
    }
    public void Richtungsauswahl()
    {
        int g = getRotation();
  
        turn(2);
   
     
     
    }
    
    public int gibRichtung()
    {
        int g = getRotation() * -1;
        
        return g;

    }
}

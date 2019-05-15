import greenfoot.*; 

/**
 * Write a description of class Splatter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treffer extends Actor
{
    public Treffer()
    {
        Greenfoot.playSound("splatter.wav");
    }

    /**
     * The Rainbow Splatter disappears after being in the world for 10 act cycles.
     */
    public void act() 
    {
        disappear();
    }    
    
    /**
     * Splatters becomes Transparent.
     */
    public void disappear()
    {
        int alpha = getImage().getTransparency();
        if (alpha > 10)
        {
            getImage().setTransparency(alpha - 10);
        }
        else
        {
            getWorld().removeObject(this);
        }
    }
    
}

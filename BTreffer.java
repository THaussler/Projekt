import greenfoot.*; 


public class BTreffer extends Actor
{
    public BTreffer()
    {
        Greenfoot.playSound("splatter.wav");
    }

    /**
     * The stars disappear after being in the world for 10 act cycles.
     */
    public void act() 
    {
        disappear();
    }    
    
    /**
     * Stars become transparent.
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

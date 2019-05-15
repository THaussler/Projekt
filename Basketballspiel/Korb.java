import greenfoot.*;  
/**
 * Write a description of class LilFrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Korb extends Actor
{
    private GreenfootImage korb1 = new GreenfootImage("lilFrog1.png");
    private GreenfootImage korb2 = new GreenfootImage("lilFrog2.png");
    int steps = 0;
    int direction = 1;
    public Korb()
    {
        // default
    }
    
    public Korb(int locationX, int locationY)
    {
        //
    }

    /**
     * Change the image to show a scared frog, or a grumpy frog.
     * A scared frog sees Hairballs in the air, a grumpy frog sees no Hairballs.
     */
    public void changeImage()
    {
        Welt planet = (Welt) getWorld();
        if (planet.ballCounter == 0) 
        {
            setImage(korb1);
        }
        else {
            setImage(korb1);
        }
    }

    /**
     * Act - do whatever the LilFrog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      {
       if ((steps == 100 && direction == 1) || (steps == 0 && direction == -1))
       { // when set to move past either end
         direction = -direction; // change direction
       }
        setLocation(getX()+direction, getY()); // move
         steps = steps + direction;
      // adjust step count
      } 
      
    }    
}

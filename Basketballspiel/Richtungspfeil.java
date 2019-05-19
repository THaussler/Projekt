import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Richtungspfeil extends SmoothMover
{  public int angle = 0;
   public int position = 0;
          int steps = 0;
          int direction = 1;
    /**
     * Act - do whatever the Richtungspfeil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
       {
       if ((steps == 130 && direction == 1) || (steps == 0 && direction == -1))
       { // when set to move past either end
         direction = -direction; // change direction
       }
        setLocation(getX()+direction, getY()); // move
         steps = steps + direction;
      // adjust step count
      } 
    }    
}

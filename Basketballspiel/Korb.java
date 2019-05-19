import greenfoot.*;  

public class Korb extends SmoothMover
{
    
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





import greenfoot.*; 


public class BAbwurfpunkt extends BSmoothMover
{
    
    int position = 0;
    int steps = 0;
    int direction = 1;
    int count = 5;
    
    public BAbwurfpunkt()
    {
        // default constructor
    }

    
    public BAbwurfpunkt(int locationX, int locationY)
    {
        setLocation(locationX, locationY);
    }

    
    public void act()
    {   
      {
      if ((steps == 130 && direction == 1) || (steps == 0 && direction == -1))
      { // when set to move past either end
         direction = -direction; // change direction
      }
         setRotation((steps/(2))-(40)); // move
         steps = steps + direction;
      // adjust step count
      } 
      if(Greenfoot.isKeyDown("right")&& (position< (60))) {
            setLocation(getX()+1, getY());
            position++;
      }
      if(Greenfoot.isKeyDown("left")&& (position> (-30))) {
            setLocation(getX()-1, getY());
            position--;
      }
        
      if ("space".equals(Greenfoot.getKey()) && (count>0))
      {
            werfen();
            B planet = (B) getWorld();
            planet.addBall();
            count--;
            B.count ++;
             
      }


    }


    private void werfen()
    {
        Greenfoot.playSound("wurf.wav");
        int angle = getRotation() - 36;
        BBasketball ball = new BBasketball(new BVector(angle, 9));
        getWorld().addObject(ball, getX(), getY());
        ball.setRotation(angle);
        ball.move(25);
    }
}
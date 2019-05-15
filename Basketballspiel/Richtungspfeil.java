import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Richtungspfeil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Richtungspfeil extends Actor
{  public int angle = 0;
   public int position = 0;
  
    /**
     * Act - do whatever the Richtungspfeil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.isKeyDown("up") && (angle< 45)) {
            move(+2);
            angle ++;
        }
      if(Greenfoot.isKeyDown("down")&& (angle> (-20))) {
            move(-2);
            angle --;
        }       
    }    
}

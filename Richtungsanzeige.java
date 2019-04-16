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
        // Add your action code here.
    } 
    public Richtungsanzeige()
    {
    
    }
    public void Richtungsauswahl()
    {
        int g = getRotation();
  
    
   
        if(g == 270)
        {
            turn(5);
        }
        if(g == 275)
        {
            turn(5);
        }
        if(g == 280)
        {
            turn(5);
        }
        if(g == 285)
        {
            turn(5);
        }
        if(g == 290)
        {
            turn(5);
        }
        if(g == 295)
        {
            turn(5);
        }
        if(g == 300)
        {
            turn(5);
        }
        if(g == 305)
        {
            turn(5);
        }
        if(g == 310)
        {
            turn(5);
        }
        if(g == 315)
        {
            turn(5);
        }
        if(g == 320)
        {
            turn(5);
        }
        if(g == 325)
        {
            turn(5);
        }
        if(g == 330)
        {
            turn(5);
        }
        if(g == 335)
        {
            turn(5);
        }
        if(g == 340)
        {
            turn(5);
        }
        if(g == 345)
        {
            turn(5);
        }
        if(g == 350)
        {
            turn(5);
        }
        if(g == 355)
        {
            turn(5);
        }
        if(g == 0)
        {
            turn(5);
        }if(g == 5)
        {
            turn(5);
        }
        if(g == 10)
        {
            turn(5);
        }
        if(g == 15)
        {
            turn(5);
        }
        if(g == 20)
        {
            turn(5);
        }
        if(g == 25)
        {
            turn(5);
        }
        if(g == 30)
        {
            turn(5);
        }
        if(g == 35)
        {
            turn(5);
        }
        if(g == 40)
        {
            setRotation(270);
            turn(5);
        }
     
    }
}

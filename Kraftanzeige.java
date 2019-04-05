import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kraftanzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kraftanzeige extends Actor
{
    /**
     * Act - do whatever the Kraftanzeige wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Kraftauswahl();
    } 
    public Kraftanzeige()
    {

    }
    public void Kraftauswahl()
    {
      
       
      int x = getX();
       
       
       
       
       if(Greenfoot.isKeyDown("space")==false)
       {
             
        if(x == 520)
        {
            turn(180);
            move(5);
      
        }
        
        if(x == 525)
        {
            move(5);

        }
       
        if(x == 530)
        {
            move(5);
         
        }
       
        if(x == 535)
        {
            move(5);
         
        }
       
        if(x == 540)
        {
            move(5);
         
        }
        
        if(x == 545)
        {
            move(5);
           
        }
        if(x == 550)
        {
            move(5);
          
        }
        
        if(x == 555)
        {
            move(5);
           
        }
        
        if(x == 560)
        {
            move(5);
          
        }
        
        if(x == 565)
        {
            move(5);
       
        }
        
        if(x == 570)
        {
            move(5);
         
        }
        
        if(x == 575)
        {
            move(5);
            
        }
       
        if(x == 580)
        {
            turn(180);
            move(5);
            
        }
    }
    
 
    }
}

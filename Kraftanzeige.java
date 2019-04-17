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
    private int i = 0;
    public void act() 
    {
        // Add your action code here.
       if(i == 0)
        {Kraftauswahl();
        }
        if(Greenfoot.isKeyDown("b"))
        {
            i++;
            gibKraft();
        }
       
    } 
    public Kraftanzeige()
    {

    }
    public void Kraftauswahl()
    {
      
       
      int x = getX();
       
       
       
       

    
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
    
    public int gibKraft()
    {
        int x = getX();
        int r = 0;
       
       
       
       

    
        if(x == 520)
        {
            r=1;
      
        }
        
        if(x == 525)
        {
            r=2;

        }
       
        if(x == 530)
        {
            r=3;
         
        }
       
        if(x == 535)
        {
            r=4;
         
        }
       
        if(x == 540)
        {
            r=5;
         
        }
        
        if(x == 545)
        {
            r=6;
           
        }
        if(x == 550)
        {
            r=7;
          
        }
        
        if(x == 555)
        {
            r=8;
           
        }
        
        if(x == 560)
        {
            r=9;
          
        }
        
        if(x == 565)
        {
            r=10;
       
        }
        
        if(x == 570)
        {
            r=11;
         
        }
        
        if(x == 575)
        {
            r=12;
            
        }
       
        if(x == 580)
        {
            r=13;
            
        }
        
        return r;
    }
}

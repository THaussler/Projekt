import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brett here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ABrett extends Actor
{
    /**
     * Act - do whatever the Brett wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int i =0;
    AKorb k;
    
    public void act() 
    {
        if(k.korbBewegt()==true)
        {
            bewegen();
        }
    }
    
    public ABrett(AKorb k1)
    {
    k=k1;
    setRotation(270);
    if(k.welcheGröße() == 2)
    {
        setImage("zeiger - Kopie.png");
    }
     if(k.welcheGröße() == 3)
    {
        setImage("zeiger - Kopie (2).png");
    }
    }
    public void bewegen()
    {
        
       
        int y = getY();
        
        if(y == 240)
        {
        i++;
        }
        if(y == 90)
        {
        i++;
        }
      
        if ( y >= 90 && y <= 240)
        {
             
               if(i%2 == 0)
        {
            
             move(-1);
           
        }
        else
       {
           
            move(1);
        }
       }
    }
}

       import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Korb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AKorb extends Actor
{
    /**
     * Act - do whatever the Korb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int groeße;
    int z = Greenfoot.getRandomNumber(5);
    int u = Greenfoot.getRandomNumber(6);
    int i = 0;
    
    public void act() 
    {
        // Add your action code here.
        if(z==0)
        {
            bewegen();
        }
        
    }  
    
    public AKorb()
    {
    setRotation(270);
    if(u==3||u==4)
    {
        setImage("Korb 1.3 - Kopie.png");
    }
    if(u==5)
    {
        setImage("Korb 1.3 - Kopie (2).png");
    }
    }
    public void bewegen()
    {
        
       
        int y = getY();
        
        if(y == 300)
        {
        i++;
        }
        if(y == 150)
        {
        i++;
        }
      
        if ( y >= 150 && y <= 300)
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
    public boolean korbBewegt()
    {
        boolean k = false;
        if(z==0)
        {
            k = true;
        }
        return k;
    }
    public int welcheGröße()
    {
        int r= 1;
            if(u==3||u==4)
    {
        r=2;
    }
    if(u==5)
    {
        r=3;
    }
    return r;
    }

    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena extends World
{

    /**
     * Constructor for objects of class Arena.
     * 
     */
    public Arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 450, 1); 
        
        int z = Greenfoot.getRandomNumber(150)+150;
        Korb k1 = new Korb();
        addObject(k1, 555, z);
        
        Brett br = new Brett(k1);
        addObject(br, 600, z-60);
      
        int bx = Greenfoot.getRandomNumber(250);
        int by = Greenfoot.getRandomNumber(225)+100;
        
        
        Richtungsanzeige r = new Richtungsanzeige();
        addObject(r, bx, by);
    
        Anzeige a = new Anzeige();
        addObject(a, 500, 410);
                
        Kraftanzeige kr = new Kraftanzeige();
        addObject(kr, 500, 410);
        
        int z1 = Greenfoot.getRandomNumber(6);
        Ball b = new Ball(k1, r, kr, br, bx, by, z1);
        addObject(b, bx, by);
        
            if(z1==1)
    {
        setBackground("inf hintergrund - Kopie (3).png");
    }
      if(z1==2)
    {
       setBackground("inf hintergrund - Kopie (2).png");
    }
      if(z1==3)
    {
       setBackground("inf hintergrund - Kopie.png");
      
    }

    }
    public void loescheObjekte()
    {
        List objekte = getObjects(null);
        removeObjects(objekte);
        
        World a = new Arena();
        Greenfoot.delay(20);
        Greenfoot.setWorld(a);
        
        Greenfoot.start();
    }
    public void entferneBall(Ball b)
    {
        removeObject(b);
    }

}

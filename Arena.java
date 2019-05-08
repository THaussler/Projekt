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

        
        Korb k1 = new Korb();
        addObject(k1, 550, 100);
                
      
        
        Spieler s = new Spieler();
        addObject(s, 150, 320);
        
              
        Kraftanzeige kr = new Kraftanzeige();
        addObject(kr, 550, 350);
        
        Richtungsanzeige r = new Richtungsanzeige();
        addObject(r, 150, 300);
        
        Ball b = new Ball(k1);
        addObject(b, 155, 300);
     


    }
    public void loescheObjekte()
    {
        List objekte = getObjects(null);
        removeObjects(objekte);
        setBackground("Bild");
    }

}

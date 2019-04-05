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
        super(600, 400, 1); 
        
        Ball b= new Ball();
        addObject(b, 100, 150);
        
        Korb k= new Korb();
        addObject(k, 600, 300);
        
        Spieler s= new Spieler();
        addObject(s, 100, 100);
        
        Richtungsanzeige r= new Richtungsanzeige();
        addObject(r, 400, 25);
        
        Kraftanzeige kr= new Kraftanzeige();
        addObject(kr, 550, 25);
    }
    public void loescheObjekte()
    {
        List objekte = getObjects(null);
        removeObjects(objekte);
        setBackground("Bild");
    }
}


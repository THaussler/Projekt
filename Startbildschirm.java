 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startbildschirm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startbildschirm extends World
{
/**
     * Konstruktor für Objekte der Klasse Startscreen
     * 
     */
    public Startbildschirm()
    {    
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        World A = new A();
        World B = new B();
        if (Greenfoot.isKeyDown("a"))
        {
            Greenfoot.setWorld(A);
        }
        if(Greenfoot.isKeyDown("b"))
        {
            Greenfoot.setWorld(B);
        }
        if (Greenfoot.isKeyDown("esc"))
        {
            Greenfoot.stop();
        }
    }
}

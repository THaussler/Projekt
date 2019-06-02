import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BKoerper extends BSmoothMover
{
    int position = 0;
    /**
     * Act - do whatever the Body wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("right")&& (position< (60))) {
            setLocation(getX()+1, getY());
            position++;
        }
        if(Greenfoot.isKeyDown("left")&& (position> (-30))) {
            setLocation(getX()-1, getY());
            position--;
        }
    }    
}

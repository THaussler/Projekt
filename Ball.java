import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i = 0;
    double t =0;
    public void act() 
    {
        // Add your action code here.
       bewegen();
    
    }  
 
    public Ball()
    {
    
    }
    
    public void bewegen()
    {
       double x, y;
    int v0=50;     //Anfangsgeschwindigkeit

    double winkel = 70 * (6.283185307/360);
    
    int g=10;

    t=t+0.1;
    
    x= 155 + v0*Math.cos(winkel)*t;
    y= 300 - v0*Math.sin(winkel)*t+(g/2)*(t*t);
    
    int x0 = (int) Math.round(x);
    int y0 = (int) Math.round(y);
    setLocation(x0,y0);
    }
}

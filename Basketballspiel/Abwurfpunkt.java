



import greenfoot.*; 

/**
 * CatCannon is a purple cat that vomits Rainbow Hairballs 
 * when the space bar is pressed.
 * It can also move left and right, and diagonally up into the sky, 
 * which is weird.
 * 
 * @author Gina Giommi
 * @version Ver.1
 */
public class Abwurfpunkt extends Actor
{
    private GreenfootImage cat1 = new GreenfootImage("Player.png");
    private GreenfootImage cat2 = new GreenfootImage("Player.png");
    public int angle = 0;
    public int position = 0;
  
    /**
     * Default CatCannon for placing a cat in the preset location in the world.
     */
    public Abwurfpunkt()
    {
        // default constructor
    }

    /**
     * Create a CatCannon at a different location than the default 77, 352.
     * Place it anywhere in the world by passing integers to the locationX and
     * locationY parameters.
     * @param: Location of x coordinate.
     * @param: Location of Y coordinate.
     */
    public Abwurfpunkt(int locationX, int locationY)
    {
        setLocation(locationX, locationY);
    }

    /**
     * Act - do whatever the CatCannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        if(Greenfoot.isKeyDown("up") && (angle< 45)) {
            turn(-1);
            angle ++;
        }
        if(Greenfoot.isKeyDown("down")&& (angle> (-20))) {
            turn(+1);
            angle --;
        }      
        if(Greenfoot.isKeyDown("right")&& (position< (60))) {
            setLocation(getX()+1, getY());
            position++;
        }
        if(Greenfoot.isKeyDown("left")&& (position> (-30))) {
            setLocation(getX()-1, getY());
            position--;
        }
        if ("space".equals(Greenfoot.getKey()))
        {
            vomit();
            Welt planet = (Welt) getWorld();
            planet.addBall();
        } 
    }

    /**
     * Change the image to another leaf image. This toggles back and
     * forth between two images.
     */ 
    public void changeCatImage()
    {
        Welt planet = (Welt) getWorld();
        if (planet.ballCounter == 0) 
        {
            setImage(cat1);
        }
        else {
            setImage(cat2);
        }
    }

    private void vomit()
    {
        Greenfoot.playSound("wurf.wav");
        int angle = getRotation() - 36;
        Basketball ball = new Basketball(new Vector(angle, 9));
        getWorld().addObject(ball, getX(), getY());
        ball.setRotation(angle);
        ball.move(25);
    }
}
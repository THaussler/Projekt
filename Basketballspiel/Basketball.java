import greenfoot.*; 

/**
 * Write a description of class Cannonball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basketball extends SmoothMover
{
    public Basketball()
    {
        this(new Vector(-30, 5));
    }

    public Basketball(Vector velocity)
    {
        super(velocity);
    }

    @Override protected void addedToWorld(World world)
    {
        setLocation(getX(), getY());
    }
 
    private void checkHitTarget() 
    {
        Actor target = getOneIntersectingObject(Korb.class);
        if (target != null)
        {
            Welt world = (Welt) getWorld();
            world.subtractBall();
            world.addObject(new Treffer(), target.getX(), target.getY());
            world.removeObject(target);
            world.removeObject(this);
            return; // in case of multiple if statementsb 
        }

    }

    /**
     * Act - do whatever the Cannonball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addToVelocity(Welt.GRAVITY);
        checkHitTarget();
        move();
        if (isTouching(Boden.class) || isAtEdge())
        {
            Welt planet = (Welt) getWorld();
            planet.removeObject(this);
            planet.subtractBall();
        }
        else // only if the cannonball is still in the world
        {
            checkHitTarget();
        }
    }    
}

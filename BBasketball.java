import greenfoot.*; 


public class BBasketball extends BSmoothMover
{
    public BBasketball()
    {
        this(new BVector(-30, 5));
    }

    public BBasketball(BVector velocity)
    {
        super(velocity);
    }

    @Override protected void addedToWorld(World world)
    {
        setLocation(getX(), getY());
    }
 
    private void checkHitTarget() 
    {
        Actor target = getOneIntersectingObject(BKorb.class);
        if (target != null)
        {
            B world = (B) getWorld();
            world.subtractBall();
            world.addObject(new BTreffer(), target.getX(), target.getY());
            world.removeObject(target);
            world.removeObject(this);
            return; 
        }

    }

    public void act() 
    {
        addToVelocity(B.GRAVITY);
        checkHitTarget();
        move();
        if (isTouching(BBoden.class) || isAtEdge())
        {
            B planet = (B) getWorld();
            planet.removeObject(this);
            planet.subtractBall();
        }
        else 
        {
            checkHitTarget();
        }
    }    
}

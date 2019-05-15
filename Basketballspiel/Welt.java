import greenfoot.*;  
import java.util.List;

/**
 * Write a description of class ProjectilePlanet here.
 * 
 * @author Gina Giommi
 * @version Ver.1
 */
public class Welt extends World
{ 

    public static final int GROUND_HEIGHT = 360;
    public static final Vector GRAVITY = new Vector(0.0, 0.2);

    public static int ballCounter = 0;

    private GreenfootImage korb1 = new GreenfootImage("lilFrog1.png");
    private GreenfootImage korb2 = new GreenfootImage("lilFrog2.png");

    /**
     * Constructor for objects of class ProjectilePlanet.
     * 
     */
    public Welt()
    {    

        super(600, 400, 1); 
        setup();

        prepare();
    }

    public void addBall()
    {
        ballCounter++;
        informActors();
    }

    public void subtractBall()
    {
        ballCounter--;
        informActors();
    }

    public void informActors()
    {
        List<Korb> koerbe = getObjects(Korb.class);

        for (Korb korb : koerbe)
        {
            korb.changeImage();
        }
        List<Abwurfpunkt> punkte = getObjects(Abwurfpunkt.class);

        for (Abwurfpunkt punkt : punkte)
        {
            punkt.changeCatImage();
        }
    }

    /**
     * Set up
     */
    public void setup()
    {
        for (int i = 0; i < 19; i++)
        {
            int x = i * 40 + 20;
            int y = GROUND_HEIGHT + 20;
            addObject(new Boden(), x, y);
        }
        for (int i = 0; i < 1; i++)
        {
            int x = i * 40 + 60;
            int y = GROUND_HEIGHT - 20 ;
            addObject(new Koerper(), x, y);
        }
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abwurfpunkt punkt = new Abwurfpunkt();
        addObject(punkt,77,100);
        Korb korb1 = new Korb();
        addObject(korb1,350,202);
        punkt.setLocation(70,333);
        Richtungsanzeige richti = new Richtungsanzeige();
        addObject(richti,520,340);
        Richtungspfeil pfeili = new Richtungspfeil();
        addObject(pfeili,495,340);
    }
  
}

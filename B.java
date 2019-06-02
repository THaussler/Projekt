import greenfoot.*;  
import java.util.List;


public class B extends World
{ 
    private BCounter actCounter;
    public static final int GROUND_HEIGHT = 360;
    public static final BVector GRAVITY = new BVector(0.0, 0.2);

    public static int ballCounter = 0;
    public static int count = 5;
    

    /**
     * Constructor for objects of class ProjectilePlanet.
     * 
     */
    public B()
    {    

        super(600, 400, 1); 
        
        actCounter = new BCounter("verfuegbare Baelle: ");
        addObject(actCounter, 120, 40);
        setup();
        actCounter.setValue(5);

        prepare();
       
    }

    public void act()
     {
       if(count> 5){
         actCounter.setValue(actCounter.getValue() - 1);
         count --;
     }
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
        List<BKorb> koerbe = getObjects(BKorb.class);

        
        List<BAbwurfpunkt> punkte = getObjects(BAbwurfpunkt.class);

        
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
            addObject(new BBoden(), x, y);
        }
        for (int i = 0; i < 1; i++)
        {
            int x = i * 40 + 60;
            int y = GROUND_HEIGHT - 20 ;
            addObject(new BKoerper(), x, y);
        }
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BAbwurfpunkt punkt = new BAbwurfpunkt();
        addObject(punkt,77,100);
        
        BKorb korb1 = new BKorb();
        addObject(korb1,280,202);
        
        punkt.setLocation(70,333);
        BRichtungsanzeige richti = new BRichtungsanzeige();
        addObject(richti,520,340);
        
        BRichtungspfeil pfeili = new BRichtungspfeil();
        addObject(pfeili,455,340);
        
       
        
        
       
    }
  
 }


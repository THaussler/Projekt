import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kraftanzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AKraftanzeige extends Actor
{
    /**
     * Act - do whatever the Kraftanzeige wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int i = 0;
    public void act() 
    {
        // Add your action code here.
       if(i == 0)
        {Kraftauswahl();
        }
        if(Greenfoot.isKeyDown("b"))
        {
            i++;
            
        }
       gibKraft();
    } 
    public AKraftanzeige()
    {
        

    }
    public void Kraftauswahl()
    {
      
       
      int x = getX();
       
       
       
            if(x == 446)
        {
            turn(180);
            move(2);
             
       
        }

            if(x > 446 && x<554)
        {
            
            move(2);
             
       
        }
        
        
              if(x == 554)
        {
                turn(180);
               move(2);
             
       
        }
    
 
    }
    
    public int gibKraft()
    {
        int x = getX();
        int r = 0;
       
       
                   if(x >= 445 && x<450)
        {
            r = 58;
             
       
        }

            if(x >= 450 && x<455)
        {
            
            r = 60;
             
       
        }
        
        if(x >= 455 && x<460)
        {
            r = 62;
         
        }
        
        if(x >= 460 && x<465)
        {
         r = 64;
            
        }
       
        if(x >= 465 && x<470)
        {
           
            r = 66;
            
        }
        if(x >= 470 && x<475)
        {
            
            r = 68;
      
        }
        
        if(x >= 475 && x<480)
        {
            r = 70;

        }
       
        if(x >= 480 && x<485)
        {
            r = 72;
         
        }
       
        if(x >= 485 && x<490)
        {
            r = 74;
         
        }
       
        if(x >= 490 && x<495)
        {
            r = 76;
         
        }
        
        if(x >= 495 && x<500)
        {
            r = 78;
           
        }
        if(x >= 500 && x<505)
        {
            r = 80;
          
        }
        
        if(x >= 505 && x<510)
        {
            r = 82;
           
        }
        
        if(x >= 510 && x<515)
        {
            r = 84;
          
        }
        
        if(x >= 515 && x<520)
        {
            r = 86;
       
        }
        
        if(x >= 520 && x<525)
        {
            r = 88;
         
        }
        
        if(x >= 525 && x<530)
        {
            r = 90;
            
        }
       
        if(x >= 530 && x<535)
        {
            
            r = 92;
            
        }
                if(x >= 535 && x<540)
        {
            r = 94;
       
        }
        
        if(x >= 540 && x<545)
        {
            r = 96;
         
        }
        
        if(x >= 545 && x<550)
        {
            r = 98;
            
        }
       
        if(x >= 550 && x<555)
        {
            
            r = 100;
            
        }
              if(x >= 555 )
        {
           r= 102;
             
       
        }
    
       

    

        
        return r;
    }
}

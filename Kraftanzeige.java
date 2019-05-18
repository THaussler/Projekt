import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kraftanzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kraftanzeige extends Actor
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
    public Kraftanzeige()
    {
        

    }
    public void Kraftauswahl()
    {
      
       
      int x = getX();
       
       
       
            if(x == 445)
        {
            turn(180);
            move(5);
             
       
        }

            if(x == 450)
        {
            
            move(5);
             
       
        }
        
        if(x == 455)
        {
            move(5);
         
        }
        
        if(x == 460)
        {
            move(5);
            
        }
       
        if(x == 465)
        {
           
            move(5);
            
        }
        if(x == 470)
        {
            
            move(5);
      
        }
        
        if(x == 475)
        {
            move(5);

        }
       
        if(x == 480)
        {
            move(5);
         
        }
       
        if(x == 485)
        {
            move(5);
         
        }
       
        if(x == 490)
        {
            move(5);
         
        }
        
        if(x == 495)
        {
            move(5);
           
        }
        if(x == 500)
        {
            move(5);
          
        }
        
        if(x == 505)
        {
            move(5);
           
        }
        
        if(x == 510)
        {
            move(5);
          
        }
        
        if(x == 515)
        {
            move(5);
       
        }
        
        if(x == 520)
        {
            move(5);
         
        }
        
        if(x == 525)
        {
            move(5);
            
        }
       
        if(x == 530)
        {
            
            move(5);
            
        }
                if(x == 535)
        {
            move(5);
       
        }
        
        if(x == 540)
        {
            move(5);
         
        }
        
        if(x == 545)
        {
            move(5);
            
        }
       
        if(x == 550)
        {
            
            move(5);
            
        }
              if(x == 555)
        {
            turn(180);
            move(5);
             
       
        }
    
 
    }
    
    public int gibKraft()
    {
        int x = getX();
        int r = 0;
       
       
                   if(x == 445)
        {
            r = 58;
             
       
        }

            if(x == 450)
        {
            
            r = 60;
             
       
        }
        
        if(x == 455)
        {
            r = 62;
         
        }
        
        if(x == 460)
        {
         r = 64;
            
        }
       
        if(x == 465)
        {
           
            r = 66;
            
        }
        if(x == 470)
        {
            
            r = 68;
      
        }
        
        if(x == 475)
        {
            r = 70;

        }
       
        if(x == 480)
        {
            r = 72;
         
        }
       
        if(x == 485)
        {
            r = 74;
         
        }
       
        if(x == 490)
        {
            r = 76;
         
        }
        
        if(x == 495)
        {
            r = 78;
           
        }
        if(x == 500)
        {
            r = 80;
          
        }
        
        if(x == 505)
        {
            r = 82;
           
        }
        
        if(x == 510)
        {
            r = 84;
          
        }
        
        if(x == 515)
        {
            r = 86;
       
        }
        
        if(x == 520)
        {
            r = 88;
         
        }
        
        if(x == 525)
        {
            r = 90;
            
        }
       
        if(x == 530)
        {
            
            r = 92;
            
        }
                if(x == 535)
        {
            r = 94;
       
        }
        
        if(x == 540)
        {
            r = 96;
         
        }
        
        if(x == 545)
        {
            r = 98;
            
        }
       
        if(x == 550)
        {
            
            r = 100;
            
        }
              if(x == 555)
        {
           r= 102;
             
       
        }
    
       

    

        
        return r;
    }
}

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
   
    double t =0;
    double t1=0;
    Korb k;
    Kraftanzeige kr1;
    Richtungsanzeige r1;
    Brett br1;
    int i = 1;
    int d = 0;
    int e = 0;
    int u = 0;
    double s;
    public void act() 
    {
        // Add your action code here.
     
       if(d==1 && e==1)
       {
        bewegen();
    }
    
           if(Greenfoot.isKeyDown("b"))
        {
            d=1;
           
        }
            if(Greenfoot.isKeyDown("space"))
        {
            e=1;
           
        }
   
    
    }  
 
    public Ball(Korb k1, Richtungsanzeige r, Kraftanzeige kr, Brett br)
    {
        k = k1;
        kr1=kr;
        r1=r;
        br1= br;
    }
    
    public void bewegen()
    {
    double x, y ;
    int v0= kr1.gibKraft();     //Anfangsgeschwindigkeit

    double winkel = r1.gibRichtung() * (6.283185307/360);
    
    int g=10;
    if(treffer()==true)
    {
        u++;
    }
  if(u == 0)
  {
    if( berührtKorb() == true)
    {i=2;}
    
     if( berührtBrett() == true)
    {i=3;}
    
    if( i== 1)
    {
        
        turn (5);


    t=t+0.1;
    
    x= 155 + v0*Math.cos(winkel)*t;
    y= 300 - v0*Math.sin(winkel)*t+(g/2)*(t*t);
    
    int x0 = (int) Math.round(x);
    int y0 = (int) Math.round(y);
    setLocation(x0,y0);
    s=t; 
}
if(i == 2)
{
    turn(5);
    t=t+0.1;
    s=s-0.1;
    x= 300 + 0.5*v0*Math.cos(winkel)*s;
    y= 300 - v0*Math.sin(winkel)*t+(g/2)*(t*t);
    
    int x0 = (int) Math.round(x);
    int y0 = (int) Math.round(y);
    setLocation(x0,y0);

}
if(i == 3)
{
    turn(5);
    t=t+0.1;
    s=s-0.1;
    x= 150 + v0*Math.cos(winkel)*s;
    y= 300 - v0*Math.sin(winkel)*t+(g/2)*(t*t);
    
    int x0 = (int) Math.round(x);
    int y0 = (int) Math.round(y);
    setLocation(x0,y0);

}
}

else{
    t1= t1+ 0.1;
    x= 555;
    y = getY() + g/2*t1;
      int x0 = (int) Math.round(x);
    int y0 = (int) Math.round(y);
    setLocation(x0,y0);
    turn(5);
}
    }
    public boolean berührtKorb()
    {
       
        boolean c = intersects(k);
        return c;
    }
        public boolean berührtBrett()
    {
       
        boolean c = intersects(br1);
        return c;
    }
    public boolean treffer()
    {
        int x = getX();
        int y = getY();
        boolean f;
        if(540 < x && x < 570 && y < 150 && y > 60)
        {
            f = true;
        }
        else
        {
            f = false;
        }
        return f;
    }
}

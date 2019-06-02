import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;

/**

 * Write a description of class Ball here.

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

public class ABall extends Actor

{

    /**

     * Act - do whatever the Ball wants to do. This method is called whenever

     * the 'Act' or 'Run' button gets pressed in the environment.

     */

   

    double t =0;

    double t1=0;

    AKorb k;

    AKraftanzeige kr1;

    ARichtungsanzeige r1;

    ABrett br1;

    int j = Greenfoot.getRandomNumber(6);

    int i = 1;

    int d = 0;

    int e = 0;

    int u = 0;

    int z = 0;

    

    double s;

    double f;

    double h;

    int x1;

    int y1;

    double t2;

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

 

    public ABall(AKorb k1, ARichtungsanzeige r, AKraftanzeige kr, ABrett br, int bx, int by, int z1)

    {

        k = k1;

        kr1=kr;

        r1=r;

        br1= br;

        x1 = bx;

        y1 = by;

       

        z = z1;

    

  

    

         if(j==3||j==4)

    {

        setImage("Ball 1.3 - Kopie.png");

    }

    if(j==5)

    {

        setImage("Ball 1.3 - Kopie (2).png");

    }

    }

    

    public void bewegen()

    {

    double x, y ;

    int v0= kr1.gibKraft();     //Anfangsgeschwindigkeit



    double winkel = r1.gibRichtung() * (6.283185307/360);

    

    int g= 10;

    

    if(z==0)

    {

        g = 10;

    }

      if(z==1)

    {

        g = 14;

    }

      if(z==2)

    {

        g = 5;

    }

      if(z==3)

    {

        g = 7;

      

    }

      if(z==4)

    {

        g = 10;

    }

      if(z==5)

    {

        g = 10;

    }

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

    

    x= x1 + v0*Math.cos(winkel)*t;

    y= y1 - v0*Math.sin(winkel)*t+(g/2)*(t*t);

    

 

    if(y< -18)

    {

       setImage("inf ball.png");

          if(z==2)

    {

        setImage("inf ball - Kopie (2).png");

    }   if(z==3)

    {

        setImage("inf ball - Kopie.png");

    }

       if(z==1)

    {

        setImage("inf ball - Kopie (3).png");

    }

    }



    else{

     setImage("Ball 1.3.png");

            if(j==3||j==4)

    {

        setImage("Ball 1.3 - Kopie.png");

    }

    if(j==5)

    {

        setImage("Ball 1.3 - Kopie (2).png");

    }

    int x0 = (int) Math.round(x);

    int y0 = (int) Math.round(y);

    

    setLocation(x0,y0);

    if(berührtBoden()==true)

    {

     x0 = (int) Math.round(x);

     y0 = 325;

    

    setLocation(x0,y0);

    }



}

        if(x < -18 || x > 618)

    {

         setImage("inf ball.png");

          if(z==2)

    {

        setImage("inf ball - Kopie (2).png");

    }   if(z==3)

    {

        setImage("inf ball - Kopie.png");

    }

       if(z==1)

    {

        setImage("inf ball - Kopie (3).png");

    }

   

    Greenfoot.setWorld(new A());

    }

    s=t;

    

     f = x1 + (x - x1)/2;

     h = y1 - (y - y1)/2;

     t2 =t;

}

if(i == 2)

{

    turn(-5);

    t=t+0.1;

    s=s-0.1;

    x= f + 0.5*v0*Math.cos(winkel)*s;

    y= y1 - v0*Math.sin(winkel)*t+(g/2)*(t*t);

    

    int x0 = (int) Math.round(x);

    int y0 = (int) Math.round(y);

    setLocation(x0,y0);

      if(berührtBoden()==true)

    {

     x0 = (int) Math.round(x);

     y0 = 325;

    

    setLocation(x0,y0);

    }

      if(x < -18 || x > 618)

    {

         setImage("inf ball.png");

          if(z==2)

    {

        setImage("inf ball - Kopie (2).png");

    }   if(z==3)

    {

        setImage("inf ball - Kopie.png");

    }

       if(z==1)

    {

        setImage("inf ball - Kopie (3).png");

    }

    Greenfoot.setWorld(new A());

    }

t2 =s;

}

if(i == 3)

{

    turn(-5);

    t=t+0.1;

    s=s-0.1;

    x= f + 0.5*v0*Math.cos(winkel)*s;

    y= y1 - v0*Math.sin(winkel)*t+(g/2)*(t*t);

    

    int x0 = (int) Math.round(x);

    int y0 = (int) Math.round(y);

    setLocation(x0,y0);

      if(berührtBoden()==true)

    {

     x0 = (int) Math.round(x);

     y0 = 325;

    

    setLocation(x0,y0);

    }

      if(x < -18 || x > 618)

    {    setImage("inf ball.png");

          if(z==2)

    {

        setImage("inf ball - Kopie (2).png");

    }   if(z==3)

    {

        setImage("inf ball - Kopie.png");

    }

       if(z==1)

    {

        setImage("inf ball - Kopie (3).png");

    }

    Greenfoot.setWorld(new A());

    }

t2 =s;

}



}



else{

    t1= t1+ 0.1;

    x= 555;

    y = getY() + g/2*t1;

      int x0 = (int) Math.round(x);

    int y0 = (int) Math.round(y);

    setLocation(x0,y0);

   

     if(berührtBoden()==true)

    {

       

     x0 = (int) Math.round(x);

     y0 = 325;

    

    setLocation(x0,y0);

    Greenfoot.delay(100);

    Greenfoot.setWorld(new A());

  





    }

    else{

        turn(5);

    }

  

}



getWorld().removeObject(r1);

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

    public boolean berührtBoden()

    {

        int y = getY();

        boolean c=false;

        if(y>= 324)

        {

            c = true;

        }

        return c;

    }

    public boolean treffer()

    {

        int x = getX();

        int y = getY();

        boolean f;

        if(k.getX() - (getImage().getHeight()/3.5) < x && x < k.getX() + (getImage().getHeight()/3.5) && y < k.getY() && y > k.getY()-90)

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
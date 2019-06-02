
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;

/**

 * Write a description of class Arena here.

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

public class A extends World

{



    /**

     * Constructor for objects of class Arena.

     * 

     */

    public A()

    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 450, 1); 

        

        int z = Greenfoot.getRandomNumber(150)+150;

        AKorb k1 = new AKorb();

        addObject(k1, 555, z);

        

        ABrett br = new ABrett(k1);

        addObject(br, 600, z-60);

      

        int bx = Greenfoot.getRandomNumber(250);

        int by = Greenfoot.getRandomNumber(225)+100;

        

        

        ARichtungsanzeige r = new ARichtungsanzeige();

        addObject(r, bx, by);

    

        AAnzeige a = new AAnzeige();

        addObject(a, 500, 410);

                

        AKraftanzeige kr = new AKraftanzeige();

        addObject(kr, 500, 410);

        

        int z1 = Greenfoot.getRandomNumber(6);

        ABall b = new ABall(k1, r, kr, br, bx, by, z1);

        addObject(b, bx, by);

        

            if(z1==1)

    {

        setBackground("inf hintergrund - Kopie (3).png");

    }

      if(z1==2)

    {

       setBackground("inf hintergrund - Kopie (2).png");

    }

      if(z1==3)

    {

       setBackground("inf hintergrund - Kopie.png");

      

    }



    }

    public void loescheObjekte()

    {

        List objekte = getObjects(null);

        removeObjects(objekte);

        

        World a = new A();

        Greenfoot.delay(20);

        Greenfoot.setWorld(a);

        

        Greenfoot.start();

    }

    public void entferneBall(ABall b)

    {

        removeObject(b);

    }



}
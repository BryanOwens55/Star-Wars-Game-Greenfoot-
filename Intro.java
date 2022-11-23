import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    public static GreenfootSound sound = new GreenfootSound("Star_Wars_Intro_HD_1080.wav");
     /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1, false); 
        addObject(new Title(2),400,250);
        addObject(new Title(1),400,100);
        addObject(new ScrollingText(),400,900);
        sound.play();
    }

}


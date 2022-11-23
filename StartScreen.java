import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 

        addObject(new Title(2), 400, 250);
        addObject(new Title(1),400,100);
        addObject(new Title(3),400,400);
    }

    public void act(){
        if(Greenfoot.isKeyDown("Space")){
            Greenfoot.setWorld(new Intro());
        }

    }
}


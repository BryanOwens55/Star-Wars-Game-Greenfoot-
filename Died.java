import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Died here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Died extends World
{
    public int counter = 0;
    public Died()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 

        addObject(new Title(2), 400, 250);
        addObject(new Title(5),400,400);
    }

    public void act(){
        counter++;
        if(counter >= 250){
            Greenfoot.setWorld(new Levels());
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart2 extends Health
{
     GreenfootImage image = new GreenfootImage("heart.png");
    /**
     * Act - do whatever the HeroFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        image.scale(50,50);
        setImage(image);

    }         
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Actor
{
   GreenfootImage image = new GreenfootImage("geonosis background.jpg");
    /**
     * Act - do whatever the HeroFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        image.scale(1100,500);
        setImage(image);

    }    
}

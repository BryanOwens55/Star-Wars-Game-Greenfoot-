import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroFire1 extends Hero
{
    GreenfootImage image = new GreenfootImage("blueLaser.png");
    /**
     * Act - do whatever the HeroFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        image.scale(20,10);
        setImage(image);
        move(5);
        //walkerHealth();
        if(getX() == 1200){
            getWorld().removeObject(this);
        }
    }    
    
}

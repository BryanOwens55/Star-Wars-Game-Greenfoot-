import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planet extends Actor
{
    GreenfootImage image = new GreenfootImage("geonosis.png");
    private int counter = 0;
    /**
     * Act - do whatever the Planet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getY() != 600 && this.getWorld().getClass() == Intro.class)
        {
            setLocation(getX(), getY() - 1);
        }else if(this.getWorld().getClass() == Intro.class){
            counter ++;
        }
        if(counter == 50){
            Intro.sound.stop();
            Greenfoot.setWorld(new Levels());
        }
    }   

    public Planet(){
        setImage(image);
        image.scale(500,500); 
    }
}




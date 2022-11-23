import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fleet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fleet extends Actor
{
    GreenfootImage image = new GreenfootImage("acclamator.png");
    public int counter = 0;
    /**
     * Act - do whatever the Fleet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        counter ++;
        if(counter >= 500){
            move(100);           
        }
    }    
    public Fleet(){
        image.scale(100,50);
        setImage(image);
    }
}
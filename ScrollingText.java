import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollingText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingText extends Actor
{
    GreenfootImage image = new GreenfootImage("Text.png");
    public int height = 800;
    public int width = 1000;
    public int counter = 0;
    public boolean outOfScreen = false;
    /**
     * Act - do whatever the ScrollingText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        counter ++;
        if(counter == 4){
            setLocation(getX(), getY() - 1);
            counter = 0;
        }
        
        if(getY() == -200){
            outOfScreen = true;
            getWorld().addObject(new Planet(),400,900);
        }
    }    

    public ScrollingText(){
        setImage(image);
        image.scale(width,height); 
    }
}



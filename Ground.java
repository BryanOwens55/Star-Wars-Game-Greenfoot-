import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    GreenfootImage image = new GreenfootImage("ground_.png");
    GreenfootImage image2 = new GreenfootImage("ground_.png");
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Ground(int selection)
    {
        if(selection == 1)
        {
            setImage(image);
            image.scale(50,50);
        }
        else if (selection == 2){
            setImage(image2);
            image2.scale(100,20);
        }

    }

    private void steppingTileCollisionDetection()
    {
        // put your code here
        Actor CloneTrooper = getOneObjectAtOffset (0,-10,CloneTrooper.class);
        if(CloneTrooper != null)
        {
            CloneTrooper.setLocation (CloneTrooper.getX(),CloneTrooper.getY() - 10);
            return;
        }
    }
}


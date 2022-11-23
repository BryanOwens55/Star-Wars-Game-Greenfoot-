import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tittle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    //class that holds 4 different images 1 that is scaled two different ways. Has 
    //perameters in constructor class to alow switches between images.
    GreenfootImage image = new GreenfootImage("Starwars-logo.png");
    GreenfootImage image2 = new GreenfootImage("space.png");
    GreenfootImage image3 = new GreenfootImage("press to start.PNG");
    GreenfootImage image4 = new GreenfootImage("died.PNG");
    public Title(int selection)
    {
        if(selection == 1)
        {
            setImage(image);
            image.scale(300,100);
        }
        else if (selection == 2){
            setImage(image2);
            image2.scale(800,600);
        }
        else if (selection == 3){
            setImage(image3);
            image3.scale(400,100); 
        }
        else if (selection == 4){
            setImage(image2);
            image2.scale(1000,400); 
        }
        else if (selection == 5){
            setImage(image4);
            image2.scale(1000,400); 
        }

    }
}
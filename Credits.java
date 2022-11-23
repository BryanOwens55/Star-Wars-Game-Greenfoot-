import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Actor
{
    GreenfootImage image = new GreenfootImage("credits1.PNG");
    GreenfootImage image2 = new GreenfootImage("credits2.PNG");
    GreenfootImage image3 = new GreenfootImage("credits3.PNG");
    int currentImage = 1;
    int counter = 0;
    int counter2 = 0;
    public void act(){
        if(currentImage == 2)setImage(image2);
        if(currentImage == 3)setImage(image3);
        if(currentImage == 4)restart();
        counter++;
        if(counter == 1){
            setLocation(getX(), getY() - 1);
            changeImage();
            counter = 0;
        }
    }

    public void changeImage(){
        if(getY() == -100){
            currentImage ++;
            setLocation(getX(), 500);
        }
    }

    public Credits(){
        setImage(image);
    }

    public void restart(){
        counter2++;
            Greenfoot.setWorld(new StartScreen());
        
    }
}
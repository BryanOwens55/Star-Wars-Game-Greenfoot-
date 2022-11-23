import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleDroids here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleDroids extends Enemys
{
    GreenfootImage image = new GreenfootImage("Battle_Droid_2.png");
    private int counter = 0;
    public static GreenfootSound sound = new GreenfootSound("Laser Blasts.wav");
    /**
     * Act - do whatever the HeroFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // scaling of image and calling of methods done here
        image.scale(40,60);
        setImage(image);
        fire();
        destroyed();
    }    

    private void fire(){
        //makes enemy fire periodicly.
        counter++;
        if(counter >= 40){
            counter = 0;
            EnemyFire fire = new EnemyFire();
            getWorld().addObject(fire, getX() - 15, getY() - 8);
            sound.play();
            sound.setVolume(70); 
        }
    }

    public void destroyed()
    {
        //when colision with hero fire is detected battleDroid is deleted
        Actor a = getOneIntersectingObject(HeroFire1.class);    
        Actor b = getOneIntersectingObject(HeroFire2.class);    
        if(a != null)  
        {  
            getWorld().removeObject(a);   
            getWorld().removeObject(this);
        } 
        if(b != null)  
        {  
            getWorld().removeObject(a);   
            getWorld().removeObject(this);
        } 
    }
}
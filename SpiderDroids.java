import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpiderDroids here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpiderDroids extends Enemys
{
    
    private int counter = 0;
    private int health = 100;
    private int counter2 = 50;
    public static GreenfootSound sound = new GreenfootSound("Laser Blasts.wav");
    GreenfootImage image = new GreenfootImage("dwarf_spider_droid_2.png");
    /**
     * Act - do whatever the HeroFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        image.scale(100,100);
        setImage(image);
        fire();
        destroyed();

    }    

    private void fire(){
        counter++;
        if(counter >= 100){
            counter = 0;
            EnemyFire fire = new EnemyFire();
            getWorld().addObject(fire, getX() - 15, getY() - 8);
            sound.play();
            sound.setVolume(70);
        }
    }

    public void destroyed()
    {
        Actor a = getOneIntersectingObject(HeroFire1.class);    
        Actor b = getOneIntersectingObject(HeroFire2.class);    
        counter++;
        if(counter > 20){
            if(a != null && health == 0)  
            {  
                getWorld().removeObject(a);   
                getWorld().removeObject(this);
                counter = 0;
            } 
            else if(a != null && health > 0){
                health -= 50;
                counter = 0;
                getWorld().removeObject(a); 
            }
            if(b != null && health == 0)  
            {  
                getWorld().removeObject(b);   
                getWorld().removeObject(this);
                counter = 0;
            } 
            else if(b != null && health > 0){
                health -= 50;
                counter = 0;
            }
        }
    }    
}
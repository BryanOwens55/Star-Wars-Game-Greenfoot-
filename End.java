import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
     public static GreenfootSound sound = new GreenfootSound("endMusic.wav");
    /**
     * Constructor for objects of class End.
     * 
     * 
     */
    public End()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1, false); 

        
        setPaintOrder(CloneTrooper.class, Gunship.class, Fleet.class, Credits.class,Planet.class, Title.class,BattleDroids.class, EnemyFire.class, Ground.class, HeroFire1.class, HeroFire2.class, Background.class);
        sound.play();
        sound.setVolume(100);
        
        addObject(new Background(),500,200);
        addObject(new Ground(1),25,378);
        addObject(new Ground(1),75,378);
        addObject(new Ground(1),125,378);
        addObject(new Ground(1),175,378);
        addObject(new Ground(1),225,378);
        addObject(new Ground(1),275,378);
        addObject(new Ground(1),325,378);
        addObject(new Ground(1),375,378);
        addObject(new Ground(1),425,378);
        addObject(new Ground(1),475,378);
        addObject(new Ground(1),525,378);
        addObject(new Ground(1),575,378);
        addObject(new Ground(1),625,378);
        addObject(new Ground(1),675,378);
        addObject(new Ground(1),725,378);
        addObject(new Ground(1),775,378);
        addObject(new Ground(1),825,378);
        addObject(new Ground(1),875,378);
        addObject(new Ground(1),925,378);
        addObject(new Ground(1),975,378);
        addObject(new Ground(1),1025,378);
        addObject(new Ground(1),1075,378);
        addObject(new Ground(1),1125,378);
        addObject(new Gunship(),900,306);
        
            }
    
    int counter = 0;
    public void act(){
        counter++;
        if(counter == 2800){
            sound.stop();
        }
    }
}

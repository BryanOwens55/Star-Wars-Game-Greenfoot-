import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{
    public int level;     
    GreenfootSound backgroundMusic = new GreenfootSound("Star Wars - Cantina Band (DJ AG Remix).mp3");
    public Levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1, false); 
        //prepare();
        levelSetup(1);
        setPaintOrder(CloneTrooper.class, Gunship.class, Credits.class,Heart1.class, Heart2.class, Heart3.class, BattleDroids.class, SpiderDroids.class ,EnemyFire.class, Ground.class, HeroFire1.class, HeroFire2.class, Background.class);
        backgroundMusic.playLoop();
        started();
    }

    public void started()
    {
        backgroundMusic.setVolume(50); 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {

    }

    public void levelSetup(int lvl){
        removeObjects(getObjects(null));
        level = lvl;

        if(level == 1){            
            baseSetup(); 
        }
        else if (level == 2){
            baseSetup();
            addObject(new BattleDroids(),500,324);
            addObject(new SpiderDroids(),800,319);
            addObject(new Ground(2),800,150);
            addObject(new Ground(2),321,257);
        }
        else if (level == 3){
            baseSetup();
            addObject(new SpiderDroids(),800,319);
            addObject(new SpiderDroids(),500,319);
            addObject(new Ground(2),600,250);
            addObject(new Ground(2),500,250);
            addObject(new Ground(2),700,200);
            addObject(new Ground(2),799,200);
        }
        else if(level == 4)
        {            
            baseSetup();       
            addObject(new SpiderDroids(),800,319);
            addObject(new BattleDroids(),500,319);
            addObject(new Ground(2),200,250);
            addObject(new Ground(2),299,250);
            addObject(new Ground(2),400,180);
            addObject(new Ground(2),499,180);
        }else if (level == 5){
            baseSetup();
            addObject(new SpiderDroids(),800,319);
            addObject(new SpiderDroids(),500,319);
            addObject(new Ground(2),600,250);
            addObject(new Ground(2),500,250);
            addObject(new Ground(2),700,200);
            addObject(new Ground(2),799,200);
        }  
        else if (level == 6){
            baseSetup();
            addObject(new BattleDroids(),800,324);
            addObject(new BattleDroids(),600,324);
            addObject(new BattleDroids(),900,324);
            addObject(new Ground(2),800,150);
            addObject(new Ground(2),321,257);
        }
        else if (level == 7){
            baseSetup();
            addObject(new BattleDroids(),500,324);
            addObject(new BattleDroids(),800,324);
            addObject(new Ground(2),800,150);
            addObject(new Ground(2),321,257);
        }
        else if (level == 8){
            baseSetup();
            addObject(new BattleDroids(),500,324);
            addObject(new BattleDroids(),800,324);
            addObject(new SpiderDroids(),650,319);
            addObject(new Ground(2),800,150);
            addObject(new Ground(2),321,257);
        }
        else if(level == 9)
        {            
            baseSetup();       
            addObject(new Gunship(),927,306);
        }
        else if(level == 10)
        {            
            backgroundMusic.stop();
            Greenfoot.setWorld(new End());
        }
    }

    public void baseSetup(){
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
        addObject(new CloneTrooper(),30,326); 
        addObject(new Heart1(),50,50);
        addObject(new Heart2(),100,50);
        addObject(new Heart3(),150,50);
    }

    public void stopBackgroundMusic()
    {
        backgroundMusic.stop();
    }
}
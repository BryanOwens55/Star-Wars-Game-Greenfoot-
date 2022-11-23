
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloneTrooper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloneTrooper extends Hero
{
    public int counter = 0;
    public int counter2 = 0;
    GreenfootImage image1 = new GreenfootImage("run.png");
    GreenfootImage image2 = new GreenfootImage("run2.png");
    GreenfootImage image3 = new GreenfootImage("run3.png");
    GreenfootImage image4 = new GreenfootImage("run4.png");
    GreenfootImage image5 = new GreenfootImage("run5.png");
    GreenfootImage image6 = new GreenfootImage("run6.png");
    GreenfootImage image7 = new GreenfootImage("run7.png");
    GreenfootImage image8 = new GreenfootImage("still.png");
    GreenfootImage image9 = new GreenfootImage("run9.png");
    GreenfootImage image10 = new GreenfootImage("run10.png");
    GreenfootImage image11 = new GreenfootImage("run11.png");
    GreenfootImage image12 = new GreenfootImage("run12.png");
    GreenfootImage image13 = new GreenfootImage("run13.png");
    GreenfootImage image14 = new GreenfootImage("run14.png");
    GreenfootImage image15 = new GreenfootImage("run15.png");
    GreenfootImage image16 = new GreenfootImage("stillLeft.png");
    private int direction = 2;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 16;
    private boolean jumping;
    private int
    counter3 = 30;
    public int درآمدسبزس = 9;
    int level = 1;
    public static GreenfootSound sound = new GreenfootSound("Laser Blasts.wav");
    public int health = 3;
    public int counter4 = 0;
    
    /**
     * Act - do whatever the CloneTrooper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CloneTrooper(){
        setImage(image8);   
    }

    public void act() 
    {
        // 
        animateRight();
        animateLeft();
        checkFall();
        jump();
        fire();
        shot();
        Levels L = (Levels)getWorld();
        if(getX() == 10){
            setLocation(getX() + 2, getY());
        }
        if(getX() == 990){
            setLocation(30,getY());
            L.levelSetup(L.level + 1);
        }

    }

    public void animateRight(){
        if(Greenfoot.isKeyDown("d"))
        {
            counter++;
            facingRight = true;
            if (counter == 5)setImage(image2);
            if (counter == 10)setImage(image3);
            if (counter == 15)setImage(image4);
            if (counter == 20)setImage(image5);
            if (counter == 25)setImage(image6);
            if (counter == 30)setImage(image7);
            if (counter == 35)setImage(image1);
            if (counter == 40)counter = 0;
            setLocation(getX() + direction, getY());
        }  
        else {
            if(facingRight==true)setImage(image8);
        }
    }

    public void animateLeft(){
        if(Greenfoot.isKeyDown("a"))
        {
            counter++;
            facingRight = false;
            if (counter == 5)setImage(image9);
            if (counter == 10)setImage(image10);
            if (counter == 15)setImage(image11);
            if (counter == 20)setImage(image12);
            if (counter == 25)setImage(image13);
            if (counter == 30)setImage(image14);
            if (counter == 35)setImage(image15);
            if (counter == 40)counter = 0;
            setLocation(getX() - direction, getY());
        }  
        else {
            if(facingRight==false)setImage(image16);
        }
    }

    private void fire(){
        counter3++;
        if(Greenfoot.isKeyDown("space") && counter3 >= 20 && facingRight == true){
            counter3 = 0;
            HeroFire1 fire = new HeroFire1();
            getWorld().addObject(fire, getX() +15, getY() - 8);
            sound.play();
            sound.setVolume(70); 
        }
        else if(Greenfoot.isKeyDown("space") && counter3 >= 20 && facingRight == false){
            counter3 = 0;
            HeroFire2 fire = new HeroFire2();
            getWorld().addObject(fire, getX() - 15, getY() - 8);
            sound.play();
            sound.setVolume(70); 
        }
    }

    private void jump(){
        if(Greenfoot.isKeyDown("w") && jumping == false){
            vSpeed = -jumpStrength;
            fall();
            jumping = true;
        }
    }

    private void checkFall(){
        if(onGround()){
            vSpeed = 0;
            jumping = false;
        }else{
            fall();
        }
    }

    public void shot(){
        Actor a = getOneIntersectingObject(EnemyFire.class);    
        counter4++;
        if(counter4 > 20){
            if(a != null && health <= 0)  
            {  
                Levels l = (Levels)getWorld();
                l.stopBackgroundMusic();
                Greenfoot.setWorld(new Died());
            } 
            else if(a != null && health > 0){
                health -= 1;
                counter = 0;
                getWorld().removeObject(a); 
            }
        }
        if(health == 2){
            getWorld().removeObjects(getWorld().getObjects(Heart3.class));
        }
        if(health == 1){
            getWorld().removeObjects(getWorld().getObjects(Heart2.class));
        }
    }

    public void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }

    public boolean onGround(){
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2 + 10, Ground.class);
        return ground != null;
    }

}
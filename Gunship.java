import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gunship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gunship extends Actor
{
    GreenfootImage image = new GreenfootImage("Gunship.png");
    GreenfootImage image2 = new GreenfootImage("acclamator.png");
    public int counter = 0;
    public int counter2 = 0;
    public int counter3 = 0;
    public int counter4 = 0;
    public boolean stop = false;
    public int currentImage = 1;
    public boolean stop2 = false;
    /**
     * Act - do whatever the HeroFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    public Gunship(){
        image.scale(250,100);
        setImage(image);
    }

    public void act() 
    {
        // Add your action code here.
        move();
        newScene();
    }     

    public void move(){
        counter++;
        counter2++;
        if (this.getWorld().getClass() == End.class && counter >= 40 && stop == false) {
            setLocation(getX(), getY() - 2);
        }

        if(currentImage == 2){
            if(counter2 < 500){
                move(2);
            }
            else{
                counter3++;
            }
            if(counter3 >= 200){
                move(100);
                counter4++;
                if(counter4 >= 50 && stop2 == false)
                {
                    getWorld().addObject(new Credits(), 500, 800);
                    stop2 = true;
                }
            }
        }
    }

        public void newScene(){
        if(getY()==0)
        {
            getWorld().addObject(new Title(4),500,200);
            getWorld().addObject(new Planet(),100,400);
            getWorld().addObject(new Fleet(),700,100);
            getWorld().addObject(new Fleet(),900,250);
            getWorld().addObject(new Fleet(),500,250);
            getWorld().addObject(new Fleet(),900,50);
            setLocation(100, 300);
            stop = true;
            image2.scale(250,100);

            setImage(image2);
            currentImage = 2;
        }

    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile3 extends Skills
{
    /**
     * Act - do whatever the Projectile3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveObj();
        removeProjectileObj();
    }
    
    public void moveObj()
    {
        setLocation(getX(),getY()+2);
    }

}

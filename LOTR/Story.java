import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends Actor
{
    public void act() 
    {
        removeOnClick();
    }
        public void removeOnClick()
        {
         if (Greenfoot.mouseClicked(this)) {
             Greenfoot.playSound("clickoff.wav");
                World world;
                world = getWorld();
                world.removeObject(this);
                return;
            }    
    }    
}

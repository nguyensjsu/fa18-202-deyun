import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation (getRotation() - 5);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation (getRotation() + 5);
        }
        
        if ("space".equals(Greenfoot.getKey()))
        { 
             if (Greenfoot.isKeyDown("shift"))
        { 
            fireSpecial();
        }else{
            fire();
        }
    }
    }  
    
      private void fire()
    {
        NormalSpell ns = new NormalSpell();
        getWorld().addObject(ns, getX(), getY());
        ns.setRotation(getRotation()-50);
        ns.move(40);
    }
    
       private void fireSpecial()
    {
        SpecialPower ns = new SpecialPower();
        getWorld().addObject(ns, getX(), getY());
        ns.setRotation(getRotation()-50);
        ns.move(40);
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option1_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button2 extends Actor
{
    /**
     * Act - do whatever the Option1_Button wants to do.
     */
    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Option2_Button_Highlighted.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Option2_Button.png");
        }

        if (Greenfoot.mouseClicked(this))
        {

         

        }
    }   
}


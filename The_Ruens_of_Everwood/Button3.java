import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option3_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button3 extends Actor
{
    /**
     * Act - do whatever the Option3_Button wants to do.
     */
    public void act()
    {
        // Add your action code here.
        
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Option3_Button_Highlighted.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Option3_Button.png");
        }

        if (Greenfoot.mouseClicked(this))
        {

            Display display = new Display();
            getWorld().addObject(display , 280, 500);
            display.setImage(new GreenfootImage("You have selected Option 3 ", 50, Color.WHITE, Color.BLACK, Color.YELLOW));

        }
    }   
}


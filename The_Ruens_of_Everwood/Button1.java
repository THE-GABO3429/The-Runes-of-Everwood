// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Option1_Button here.
 * @author (your name) @version (a version number or a date)
 */
public class Button1 extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Option1_Button wants to do.
     */
    public void act()
    {
        /* Add your action code here.*/
        if (Greenfoot.mouseMoved(this)) {
            setImage("Option1_Button_Highlighted.png");
        }
        if (Greenfoot.mouseMoved(getWorld())) {
            setImage("Option1_Button.png");
        }
        if (Greenfoot.mouseClicked(this)) {
            World Test_movement_Input =  new  Test_movement_Input();
            Greenfoot.setWorld(Test_movement_Input);
        }
    }
}

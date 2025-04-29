// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Test_Background here.
 * @author (your name) @version (a version number or a date)
 */
public class Test_Background extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class Test_Background.
     */
    public Test_Background()
    {
        super(600, 600, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Button1 button1 =  new  Button1();
        addObject(button1, getWidth() / 2, getHeight() / 6);
        Button2 button2 =  new  Button2();
        addObject(button2, getWidth() / 2, getHeight() / 6 * 3);
        Button3 button3 =  new  Button3();
        addObject(button3, getWidth() / 2, getHeight() / 6 * 5);
    }
}

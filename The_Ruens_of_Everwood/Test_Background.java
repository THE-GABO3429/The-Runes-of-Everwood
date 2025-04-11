import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import lang.stride.*;
/**
 * Write a description of class Test_Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test_Background extends World
{

    /**
     * Constructor for objects of class Test_Background.
     * 
     */
    public Test_Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080,1080, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Button1 button1 = new Button1();
        addObject(button1,485,618);
        Button2 button2 = new Button2();
        addObject(button2,485,704);
        Button3 button3 = new Button3();
        addObject(button3,482,799);
    }
}

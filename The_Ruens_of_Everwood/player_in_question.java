// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class player_in_question extends Actor
{

    /**
     * Act - do whatever the player_in_question wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        ifAtEdge();
        getPosition();
    }

    /**
     * 
     */
    public void getPosition()
    {
        getX();
        getY();
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            /* set orientstion then move*/
            setRotation(270);
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(3);
        }
    }

    /**
     * 
     */
    public boolean ifAtEdge()
    {
        if (isAtEdge() == true) {
            World Test_Transition =  new  Test_Transition();
            Greenfoot.setWorld(Test_Transition);
        }
        return false;
    }
}

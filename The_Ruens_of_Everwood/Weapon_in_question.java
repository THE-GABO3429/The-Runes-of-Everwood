// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Weapon_in_question extends Actor
{
    private int lifeTime = 10;

    /**
     * 
     */
    public Weapon_in_question(int rotation)
    {
    }

    /**
     * Act - do whatever the Weapon_in_question wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        lifeTime = lifeTime - 1;
        setLocation(getX() + 3, getY());
        if (lifeTime <= 0) {
            getWorld().removeObject(this);
        }
    }

    /* public void positionIt(){ player_in_question.getX();  }*/
}

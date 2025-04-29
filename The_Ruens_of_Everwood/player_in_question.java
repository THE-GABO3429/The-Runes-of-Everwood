import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class player_in_question extends Actor
{
    private int weaponCooldown;
    private int weaponSecondCooldown;

    /**
     * 
     */
    public player_in_question()
    {
        /* increase the first Cooldown to swing slower and lower it to swing faster*/
        weaponCooldown = 25;
        weaponSecondCooldown = 0;
    }

    /**
     * Act - do whatever the player_in_question wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        getPosition();
        wallCollision();
        attack();
        weaponSecondCooldown = weaponSecondCooldown + 1;
    }

    /**
     * 
     */
    public void setOveralswingCooldown(int swingTime)
    {
        weaponCooldown = swingTime;
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
    public void wallCollision()
    {
        Actor wall = getOneIntersectingObject(wall.class);
        if (wall != null) {
            if (Greenfoot.isKeyDown("down")) {
                setRotation(90);
                move(-3);
            }
            if (Greenfoot.isKeyDown("left")) {
                setRotation(180);
                move(-3);
            }
            if (Greenfoot.isKeyDown("right")) {
                setRotation(0);
                move(-3);
            }
            if (Greenfoot.isKeyDown("up")) {
                setRotation(270);
                move(-3);
            }
        }
    }

    /**
     * 
     */
    public void attack()
    {
        if (Greenfoot.isKeyDown("E")) {
            if (weaponSecondCooldown >= weaponCooldown) {
                Weapon_in_question w =  new  Weapon_in_question(getRotation());
                getWorld().addObject(w, getX() + 3, getY());
                weaponSecondCooldown = 0;
            }
        }
    }
}

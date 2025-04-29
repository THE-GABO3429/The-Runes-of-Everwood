// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Test_movement_Input extends World
{
    private player_in_question player;

    /**
     * Constructor for objects of class Test_movement_Input.
     */
    public Test_movement_Input()
    {
        super(600, 600, 1);
        setPaintOrder(player_in_question.class, Weapon_in_question.class);
        player =  new  player_in_question();
        addObject(player, 200, 200);
        ifAtEdge();
    }

    /**
     * 
     */
    public void ifAtEdge()
    {
        if (player.getX() >= getWidth() - 10) {
            int savedY = player.getY();
            World Tests_transition =  new  Test_Transition(player, 10, savedY);
            Greenfoot.setWorld(Tests_transition);
        }
    }
}

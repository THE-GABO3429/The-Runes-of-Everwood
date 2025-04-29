// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class VissualLayers extends Actor
{

    /**
     * Act - do whatever the VissualLayers wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VissualLayers()
    {
        GreenfootImage base =  new GreenfootImage("bread.png");
        GreenfootImage overlay =  new GreenfootImage("wombat.png");
        overlay.setTransparency(180);
        base.drawImage(overlay, 0, 0);
        setImage(base);
    }
}

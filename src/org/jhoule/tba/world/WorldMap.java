/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.world;

import java.util.Map;

/**
 * A representaiton of a world map
 * Much like in Minecraft... use their coordinate system.
 * @author jhoule
 */
public interface WorldMap
{
    public abstract Location getLocation(Map<Axis, Integer> aCoords);
}

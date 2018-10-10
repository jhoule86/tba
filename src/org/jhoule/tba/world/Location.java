/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.world;

import java.util.Map;

/**
 *
 * @author jhoule
 */
public interface Location
{
//    public static int RELATIVE_UP = 1;
//    public static int RELATIVE_AHEAD = 1 << 1;
//    public static int RELATIVE_DOWN = 1 << 2;
//    public static int RELATIVE_LEFT = 1 << 3;
//    public static int RELATIVE_RIGHT = 1 << 4;
//    public static int RELATIVEBEHIND = 1 << 5;
    
    /**
     * Get the coordinatess for this location in the environment
     * @return a map of axis-integer info
     */
    public abstract Map<Axis, Integer> getCoordinates();
    
    /**
     * Get the next location, if any, in the direction 
     * @param direction
     * @return 
     */
    public abstract Location getNextLocation(int direction);
    
    /**
     * Get an impression of what lies in a certian direction 
     * @param direction
     * @return 
     */
    public abstract String look(int direction);
    
    /**
     * Get an impression of what the current location looks like
     * When viewed from another location.
     * 
     * Need to take things into account like:
     * Water/Haze/Smoke limiting visibility
     * SOMETHING ELSE IN THE WAY (wall, large entity)
     * 
     * @param aOtherLocation
     * @return 
     */
    public abstract String getAppearenceFrom(Location aOtherLocation); 
}

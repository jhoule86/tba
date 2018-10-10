/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.world;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jhoule
 */
public class TBALocation implements Location
{   
    private Map<Axis, Integer > coordinates = null;
    private Map<Axis, Location> neighbors = null;
    
    public TBALocation(Map<Axis, Integer> aCoordinates)
    {
        this(aCoordinates, new HashMap<Axis, Location>());
    }
    
    public TBALocation(Map<Axis, Integer> aCoordinates, Map<Axis, Location> aNeighbors)
    {
        coordinates = aCoordinates;
        neighbors = aNeighbors;
    }

    @Override
    public Map<Axis, Integer> getCoordinates()
    {
        return coordinates;
    }

    @Override
    public Location getNextLocation(int direction)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String look(int direction)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAppearenceFrom(Location aOtherLocation)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

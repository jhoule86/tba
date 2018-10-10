/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.world;

/**
 *
 * @author jhoule
 */
public abstract class CharacterAxis implements Axis
{
    // minecraft axes
    public static char AXIS_LONGITUDE = 'x';
    public static char AXIS_ELEVATION = 'y';
    public static char AXIS_LATITUDE = 'z';
    
    Character identifer = '\0';
    
    public CharacterAxis(char aId)
    {
        identifer = aId;
    }
    
    public CharacterAxis(Character aId)
    {
        identifer = aId;
    }
    
    @Override
    public Character getIdentifier()
    {
        return identifer;
    }
}

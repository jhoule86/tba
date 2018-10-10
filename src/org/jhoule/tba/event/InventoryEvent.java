/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.event;

/**
 *
 * @author jhoule
 */
public abstract class InventoryEvent implements Event
{
    @Override
    public String getName()
    {
        return "Generic Inventory Event";
    }

    @Override
    public String getDescription()
    {
        return "";
    }

    @Override
    public boolean isFinal()
    {
        return false;
    }
    
}

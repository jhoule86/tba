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
public interface Event
{
    public abstract String getName();
    
    public abstract String getDescription();
    
    public abstract boolean isFinal();
}

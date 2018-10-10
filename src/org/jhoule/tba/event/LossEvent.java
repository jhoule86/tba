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
public class LossEvent implements Event
{

    @Override
    public String getName()
    {
        return "Generic Loss Event";
    }

    @Override
    public String getDescription()
    {
        return "Somehow, you ended up losing. "
                + "Good try. "
                + "Adequate Try. "
                + "Actually, I'm not sure you tried."
                + "Did you try? "
                + "It seems like you died awfully quickly, is all I'm saying.";
    }

    @Override
    public boolean isFinal()
    {
        return true;
    }
    
}

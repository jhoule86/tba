/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.event;

import java.util.LinkedHashMap;
import java.util.Map;
import tba.world.TBALocation;

/**
 *
 * @author jhoule
 */
public class TBADecision implements Decision
{
    private Event mEventHappening = null;
    private Map<String, TBALocation> mChoices = null;
    
    public TBADecision()
    {
        // for now, the default event is a loss.
        this(new LossEvent());
    }
    
    public TBADecision(Event aEvent)
    {
        mEventHappening = aEvent;
        mChoices = new LinkedHashMap<>();
    }
    
    @Override
    public Map<String, TBALocation> getChoices()
    {
        // always return null if the user can't do anything after this
        if (mEventHappening.isFinal())
            return null;
        
        return mChoices;
    }
}

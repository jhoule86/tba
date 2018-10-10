/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tba.event;

import java.util.Map;
import tba.world.TBALocation;

/**
 *
 * @author jhoule
 */
public interface Decision
{
    // making a decision can/will put player in a different location.
    // this should support warps, tunnels etc.
    public abstract Map<String, TBALocation> getChoices();
}

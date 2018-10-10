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
public class DeathEvent extends LossEvent
{

    @Override
    public String getName()
    {
        return "Generic Death Event";
    }

    @Override
    public String getDescription()
    {
        return "Somehow, you ended up losing... your life. You are dead. "
                + "You cease to be. "
                + "I am talking to a corpse!";
    }
}

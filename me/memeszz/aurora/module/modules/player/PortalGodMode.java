//Decomped By XeonLyfe
package me.memeszz.aurora.module.modules.player;

import me.memeszz.aurora.module.*;
import me.memeszz.aurora.event.events.*;
import net.minecraft.network.play.client.*;
import team.stiff.pomelo.impl.annotated.handler.annotation.*;

public class PortalGodMode extends Module
{
    public PortalGodMode() {
        super("PortalGodmode", Module.Category.PLAYER, "Godmode when you go through a portal");
    }
    
    @Listener
    public void onUpdate(final PacketEvent.Send event) {
        if (event.getPacket() instanceof CPacketConfirmTeleport) {
            event.setCanceled(true);
        }
    }
}

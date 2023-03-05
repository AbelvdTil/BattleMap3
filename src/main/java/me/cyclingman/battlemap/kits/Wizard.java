package me.cyclingman.battlemap.kits;

import org.bukkit.entity.Player;

public class Wizard implements Kit {
    public final String KIT_NAME = "wizard";

    @Override
    public void setKit(Player p) {
        p.sendMessage(KIT_NAME + " kit loaded.");
    }

    @Override
    public String getKitName() {
        return KIT_NAME;
    }
}

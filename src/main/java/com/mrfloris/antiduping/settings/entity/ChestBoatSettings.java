package com.mrfloris.antiduping.settings.entity;

import com.mrfloris.antiduping.util.ColorUtil;
import net.kyori.adventure.text.TextComponent;

public class ChestBoatSettings {
    public boolean enabled = true;
    public boolean blockOpenInventory = true;
    public TextComponent message = ColorUtil.color("&cYou can't use chest storage in chest boats on this server.");

    public ChestBoatSettings copy() {
        ChestBoatSettings s = new ChestBoatSettings();
        s.enabled = enabled;
        s.blockOpenInventory = blockOpenInventory;
        s.message = message;
        return s;
    }
}

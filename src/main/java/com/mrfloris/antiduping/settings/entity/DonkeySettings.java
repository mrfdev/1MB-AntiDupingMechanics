package com.mrfloris.antiduping.settings.entity;

import com.mrfloris.antiduping.util.ColorUtil;
import net.kyori.adventure.text.TextComponent;

public class DonkeySettings {
    public boolean enabled = true;
    public boolean blockOpenInventory = true;
    public boolean blockAttachChest = true;
    public TextComponent message = ColorUtil.color("&cYou can't use chest storage on pack animals on this server.");

    public DonkeySettings copy() {
        DonkeySettings s = new DonkeySettings();
        s.enabled = enabled;
        s.blockOpenInventory = blockOpenInventory;
        s.blockAttachChest = blockAttachChest;
        s.message = message;
        return s;
    }
}

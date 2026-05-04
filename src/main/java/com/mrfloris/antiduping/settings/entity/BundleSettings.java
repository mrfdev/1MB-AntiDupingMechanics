package com.mrfloris.antiduping.settings.entity;

import com.mrfloris.antiduping.util.ColorUtil;
import net.kyori.adventure.text.TextComponent;

public class BundleSettings {
    public boolean enabled = true;
    public boolean blockInsertItems = true;
    public TextComponent message = ColorUtil.color("&cYou can't put items into bundles on this server.");

    public BundleSettings copy() {
        BundleSettings s = new BundleSettings();
        s.enabled = enabled;
        s.blockInsertItems = blockInsertItems;
        s.message = message;
        return s;
    }
}

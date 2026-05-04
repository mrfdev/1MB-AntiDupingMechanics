package com.mrfloris.antiduping.settings.world;

import com.mrfloris.antiduping.util.ColorUtil;
import com.mrfloris.antiduping.settings.entity.BundleSettings;
import com.mrfloris.antiduping.settings.entity.ChestBoatSettings;
import com.mrfloris.antiduping.settings.entity.DonkeySettings;
import org.bukkit.configuration.ConfigurationSection;
import org.jspecify.annotations.NonNull;

public class WorldSettings {
    public ChestBoatSettings chestBoats = new ChestBoatSettings();
    public DonkeySettings donkeys = new DonkeySettings();
    public BundleSettings bundles = new BundleSettings();

    public static WorldSettings fromConfig(ConfigurationSection sec, WorldSettings fallback) {
        WorldSettings ws = (fallback == null ? new WorldSettings() : fallback.copy());
        if (sec == null) return ws;
        ws.applyOverrides(sec);
        return ws;
    }

    public void applyOverrides(@NonNull ConfigurationSection sec) {
        // chest_boats
        ConfigurationSection cb = sec.getConfigurationSection("chest_boats");
        if (cb != null) {
            if (cb.contains("enabled")) chestBoats.enabled = cb.getBoolean("enabled");
            if (cb.contains("block_open_inventory")) chestBoats.blockOpenInventory = cb.getBoolean("block_open_inventory");
            if (cb.contains("message")) chestBoats.message = ColorUtil.color(cb.getString("message"));
        }
        // donkeys
        ConfigurationSection dk = sec.getConfigurationSection("donkeys");
        if (dk != null) {
            if (dk.contains("enabled")) donkeys.enabled = dk.getBoolean("enabled");
            if (dk.contains("block_open_inventory")) donkeys.blockOpenInventory = dk.getBoolean("block_open_inventory");
            if (dk.contains("block_attach_chest")) donkeys.blockAttachChest = dk.getBoolean("block_attach_chest");
            if (dk.contains("message")) donkeys.message = ColorUtil.color(dk.getString("message"));
        }
        // bundles
        ConfigurationSection bd = sec.getConfigurationSection("bundles");
        if (bd != null) {
            if (bd.contains("enabled")) bundles.enabled = bd.getBoolean("enabled");
            if (bd.contains("block_insert_items")) bundles.blockInsertItems = bd.getBoolean("block_insert_items");
            if (bd.contains("message")) bundles.message = ColorUtil.color(bd.getString("message"));
        }
    }

    public WorldSettings copy() {
        WorldSettings ws = new WorldSettings();
        ws.chestBoats = chestBoats.copy();
        ws.donkeys = donkeys.copy();
        ws.bundles = bundles.copy();
        return ws;
    }
}

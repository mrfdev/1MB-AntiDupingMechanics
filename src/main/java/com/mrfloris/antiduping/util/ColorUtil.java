package com.mrfloris.antiduping.util;

import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.jspecify.annotations.NonNull;

public class ColorUtil {

    public static @NonNull TextComponent color(String s) {
        return LegacyComponentSerializer.legacyAmpersand().deserialize(s);
    }
}

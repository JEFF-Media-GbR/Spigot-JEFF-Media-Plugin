package de.jeff_media;

import org.bukkit.plugin.Plugin;

public interface SpigotJeffMediaPlugin extends Plugin {

    String getUID();
    String getNONCE();
    String getRESOURCE();

    SpigotJeffMediaPlugin getInstance();

}

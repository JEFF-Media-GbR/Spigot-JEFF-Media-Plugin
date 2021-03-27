package de.jeff_media;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public interface SpigotJeffMediaPlugin {

    String getUID();
    String getNONCE();
    String getRESOURCE();

    static Plugin getInstance() {
        return null;
    }

}

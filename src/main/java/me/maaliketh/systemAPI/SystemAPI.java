package me.maaliketh.systemAPI;

import org.bukkit.plugin.java.JavaPlugin;

public final class SystemAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(".");
        getLogger().info("SystemAPI is now Active!");
        getLogger().info(".");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

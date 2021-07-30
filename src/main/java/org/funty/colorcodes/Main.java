package org.funty.colorcodes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.funty.colorcodes.listeners.ChatListener;
import org.funty.colorcodes.listeners.SignListener;

public final class Main extends JavaPlugin {
    private static Main plugin;
    @Override
    public void onEnable() {
        System.out.println(ChatColor.GREEN + "[ColorCodes] Enabled");
        plugin = this;
        loadConfig();

        //listener
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new ChatListener(), this);
        pm.registerEvents(new SignListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "[ColorCodes] Disabled");
    }
    public void loadConfig(){
        saveDefaultConfig();
    }
    public static Main getPlugin(){
        return plugin;
    }
}

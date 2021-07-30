package org.funty.colorcodes.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.funty.colorcodes.Main;


public class SignListener implements Listener {
    @EventHandler
    public void onSignChange(SignChangeEvent e) {
        Player p = e.getPlayer();
        if(Main.getPlugin().getConfig().getString("Settings.InChat.PermissionsSign") == null || p.hasPermission(Main.getPlugin().getConfig().getString("Settings.InChat.PermissionsSign"))){
            String[] lines = e.getLines();
            for(int i = 0; i < 4; i++) {
                String line = lines[ i ];
                e.setLine(i, line.replace(Main.getPlugin().getConfig().getString("Settings.ColorCodeCharacter"), "§"));
            }
        }
    }
}

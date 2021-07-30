package org.funty.colorcodes.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.funty.colorcodes.Main;

public class ChatListener implements Listener {
    @EventHandler
    public void OnChat(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        if(Main.getPlugin().getConfig().getString("Settings.InChat").equals("true")){
            if(Main.getPlugin().getConfig().getString("Settings.InChat.PermissionsChat") == null || p.hasPermission(Main.getPlugin().getConfig().getString("Settings.InChat.Permissions"))){
                e.setMessage(e.getMessage().replace(Main.getPlugin().getConfig().getString("Settings.ColorCodeCharacter"), "§"));
            }else {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Messages.NoPerms")));
            }
        }
    }
}

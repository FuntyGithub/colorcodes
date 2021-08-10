package org.funty.colorcodes.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.funty.colorcodes.Main;

public class CCCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0){
            sender.sendMessage(ChatColor.GOLD + "=====§n§6ColorCodes§r§6=====");
            sender.sendMessage("&0 = " + ChatColor.BLACK + "Black" + "                 " + ChatColor.WHITE + "&1 = " + ChatColor.DARK_BLUE + "Dark Blue");
            sender.sendMessage("&2 = " + ChatColor.DARK_GREEN + "Dark Green" + "      " + ChatColor.WHITE + "&3 = " + ChatColor.DARK_AQUA + "Dark Aqua");
            sender.sendMessage("&4 = " + ChatColor.DARK_RED + "Dark Red" + "          " + ChatColor.WHITE + "&5 = " + ChatColor.DARK_PURPLE + "Dark Purple");
            sender.sendMessage("&6 = " + ChatColor.GOLD + "Gold" + "                  " + ChatColor.WHITE + "&7 = " + ChatColor.GRAY + "Gray");
            sender.sendMessage("&8 = " + ChatColor.DARK_GRAY + "Dark Gray" + "        " + ChatColor.WHITE + "&9 = " + ChatColor.BLUE + "Blue");
            sender.sendMessage("&a = " + ChatColor.GREEN + "Green" + "               " + ChatColor.WHITE + "&b = " + ChatColor.AQUA + "Aqua");
            sender.sendMessage("&c = " + ChatColor.RED + "Red" + "                   " + ChatColor.WHITE + "&d = " + ChatColor.LIGHT_PURPLE + "Light Purple");
            sender.sendMessage("&e = " + ChatColor.YELLOW + "Yellow" + "               " + ChatColor.WHITE + "&f = " + ChatColor.WHITE + "White");
            sender.sendMessage(ChatColor.GOLD + "==============================");
            sender.sendMessage("&k = " + ChatColor.MAGIC + "Magic" + ChatColor.WHITE + "                 " + "&l = " + ChatColor.BOLD + "Bold");
            sender.sendMessage("&m = " + ChatColor.STRIKETHROUGH + "Strikethrough" + ChatColor.WHITE + " " + "&n = " + ChatColor.UNDERLINE + "Underline");
            sender.sendMessage("&o = " + ChatColor.ITALIC + "Italic" + ChatColor.WHITE + "                 " + "&r = " + ChatColor.RESET + "Reset");
            sender.sendMessage(ChatColor.GOLD + "=====§n§6ColorCodes§r§6=====");
        }else {
            String arg = args[0];
            if (arg.equals("reload")) {
                if(Main.getPlugin().getConfig().getString("Settings.PermissionsReload") == null || sender.hasPermission(Main.getPlugin().getConfig().getString("Settings.PermissionsReload"))){
                    Main.getPlugin().reloadConfig();
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Messages.Reloaded")));
                } else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Messages.NoPerms")));
                }
            }
            if (arg.equals("version")) {
                sender.sendMessage(ChatColor.GOLD + "----------[ColorCodes]----------");
                sender.sendMessage(ChatColor.GOLD + "Name: " + Main.getPlugin().getDescription().getFullName());
                sender.sendMessage(ChatColor.GOLD + "Version: " + Main.getPlugin().getDescription().getVersion());
                sender.sendMessage(ChatColor.GOLD + "Author: " + Main.getPlugin().getDescription().getAuthors().toString());
                sender.sendMessage(ChatColor.GOLD + "----------[ColorCodes]----------");
            }
        }
        return false;
    }
}

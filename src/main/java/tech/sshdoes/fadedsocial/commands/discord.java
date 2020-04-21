package tech.sshdoes.fadedsocial.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tech.sshdoes.fadedsocial.Main;

public class discord implements CommandExecutor {
    public Main plugin;
    public discord(Main plugin) {this.plugin = plugin;}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "This command needs to be sent by a player!");
        }else if (sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "===============================" + "\n");
            p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "\n");
            p.sendMessage(ChatColor.RED + "https://discord.fadedmc.com/");
            p.sendMessage(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "\n");
            p.sendMessage(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "===============================" + "\n");
            // Plugin made by SSH#4388
        }
        return true;
    }
}

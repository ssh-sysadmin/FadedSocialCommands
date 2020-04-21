package tech.sshdoes.fadedsocial;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import tech.sshdoes.fadedsocial.commands.discord;
import tech.sshdoes.fadedsocial.commands.store;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "FadedSocial has started - Made by SSH#4388");
        getCommand("discord").setExecutor(new discord(this));
        getCommand("store").setExecutor(new store(this));
        // Plugin startup logic - Plugin made by SSH#4388
    }
}

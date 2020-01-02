
// This is the main class for my plugin


package me.bentonjohnson.Config;


import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Config extends JavaPlugin{
	private Commands Comand = new Commands();
	@Override
	public void onEnable() {
		getCommand("cfg").setExecutor(Comand);
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "SUPER COOL CONFIG PLUGIN ENABLED");
		saveConfig();
	}
	public void onDisable() {
		
	}
}

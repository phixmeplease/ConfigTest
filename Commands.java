// This is the file where I call the config.

package me.bentonjohnson.Config;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Commands implements Listener, CommandExecutor{
	private Config plugin = JavaPlugin.getPlugin(Config.class);
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("config")) {
			plugin.getConfig().getString("yes");
		}
		return false;
	}


}

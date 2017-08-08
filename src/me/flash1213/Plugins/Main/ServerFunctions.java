package me.flash1213.Plugins.Main;

	

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.flash1213.Plugins.Listener.JoinListener;

	public class ServerFunctions extends JavaPlugin {
	
		@Override
	public void onEnable() {
			new JoinListener(this);
			
	}
	
		@Override
	public void onDisable() {

		}
		
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if (cmd.getName().equalsIgnoreCase("totalexp") && sender instanceof Player) {
				
					Player player = (Player) sender;
					
					player.sendMessage(§4 + "Total EXP " + player.getTotalExperience());
					
				
					return true;
					
					else if (cmd.getName().equalsIgnoreCase("exp") && sender instanceof Player) {
						
						Player player = (Player) sender;
						
						player.sendMessage(§4 + "EXP to next level" + player.getExpToLevel());
						
					
					
			}
			
			return false;
			
	}
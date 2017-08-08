package me.flash1213.Plugins.Listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import me.flash1213.Plugins.Main.ServerFunctions;

public class JoinListener implements Listener {
	
	public JoinListener(ServerFunctions plugin) {
		Bukkit.getConsoleSender().sendMessage("§a[§4get meme'd§a]");
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {

		// rename player to p 
		// we do not have to check if instanceof Player since it is a player only event
		Player p = e.getPlayer();

		e.setJoinMessage("§3Welcome, §b" + p.getName() + "§3, to the server!");

		// If new player (putting ! infront of a boolean value is shorthand for == false)
		if (!p.hasPlayedBefore() /*== false*/) {
			p.sendMessage("§2As you are a new player, have a free apple!");
			// Adds 1 apple to the player's inventory
			p.getInventory().addItem(new ItemStack(Material.APPLE, 1));
		}
	}
}

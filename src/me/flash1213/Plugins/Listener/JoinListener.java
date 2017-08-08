package me.flash1213.Plugins.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinListener implements Listener {
	
		public JoinListener(ServerFunctions plugin) {
			plugin.getServer().getPluginManager().registerEvents(this, plugin);
		}

		@EventHandler
		public void onPlayerJoin(PlayerJoinEvent e) {
			
			Player player = e.getPlayer();
			
			e.setJoinMessage(§3"Welcome, " + player.getName() + ", to the server!");
			
			//If new player
			if (player.hasPlayedBefore() == false) {
				player.sendMessage(§2"As you are a new player, have a free apple!");
				
				//Adds 1 apple to the player's inventory
				player.getInventory().addItem(new ItemStack(Material.APPLE, 1));
			
			
			}
		}
}

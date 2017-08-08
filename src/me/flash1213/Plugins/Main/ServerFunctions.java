package me.flash1213.Plugins.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.flash1213.Plugins.Listener.JoinListener;

public class ServerFunctions extends JavaPlugin {

	@Override
	public void onEnable() {
		new JoinListener(this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		// replace player with p, much faster to type and still clear what its value is
		Player p = null;
		
		// if not sent from a player 
		// (because if it was sent from console, or 
		// command block, sender would not be a player (it would be null))
		if (!(sender instanceof Player))
		{
			return true;
		}
		// cast sender to Player since now we are sure it will not fail
		p = (Player) sender;
		
		//we can now use p to reference the sender as a player for the rest of the method
		if (cmd.getName().equalsIgnoreCase("totalexp")/* && sender instanceof Player - remove this since we already checked that*/) {
			p.sendMessage("§4Total EXP " + p.getTotalExperience());
			return true;
		} else if (cmd.getName().equalsIgnoreCase("exp")) { // remove it here too
			p.sendMessage("§4EXP to next level" + p.getExpToLevel());
			return true;
		}
		
		return false;
	}
}
package com.mulescraft.dragoneggrespawn;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DragonEggRespawn extends JavaPlugin implements Listener{
	Server server = this.getServer();
	ConsoleCommandSender console = server.getConsoleSender();
	
	//locations for dragon egg.
	public int x;
	public int y;
	public int z;
	
	
	@Override
	public void onEnable(){
		Documentation doc = new Documentation();
		getConfig().options().header(doc.getDocumentation());
		setupConfig();
		console.sendMessage(ChatColor.BLUE+"[DragonEggRespawn] Config Loaded!");
		server.getPluginManager().registerEvents(this, this);
	}//end onEnable()
	
	
	@Override
	public void onDisable(){
		console.sendMessage(ChatColor.BLUE+"[DragonEggRespawn] Disabled Successfully! *High Five*");
	}//end onDisable()
	
	
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {
	     LivingEntity entity = event.getEntity();

	    // getType() is inherited from Entity
	    if(entity.getType() == EntityType.ENDER_DRAGON){
	        // LivingEntity has a getKiller() method
	         entity.getKiller().sendMessage("You killed the dragon you bastard!");
	         // getKiller() returns a Player, so you don't have to check if it's a player.
	    }//end if it was a dragon
	}//end onEntityDeath()
	
	private void setupConfig(){
		//vars used for configuration
		getConfig().addDefault("Location.X", -1);
		getConfig().addDefault("Location.Y", -1);
		getConfig().addDefault("Location.Z",-1);
		getConfig().addDefault("World", "world_the_end");
	}//end setupConfig()
	
}//end class DragonEggRespawn

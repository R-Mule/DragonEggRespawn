package com.mulescraft.dragoneggrespawn;

public class Documentation {

	public Documentation(){
		
	}//end Documentation Ctor
	
	
	public String getDocumentation(){
		String message="DragonEggRespawn Version 1.0 Welcome to Dragon Egg Respawn!!\n";
		message = message.concat("The section below, goes over example config setup, and what each container is used for.\n");
		message = message.concat("\n");
		message = message.concat("Locations:   These are the coordinates for where you want the Ender Dragon Egg to spawn when the dragon dies.\n");
		message = message.concat("  X: -1      They are all -1 by default. It will not spawn on death, until you set x,y,z to some other values.\n");
		message = message.concat("  Y: -1\n");
		message = message.concat("  Z: -1\n");
		message = message.concat("\n");
		message = message.concat("World: world_the_end    This is the name of the world you want the egg to spawn within.\n");
		return message;
	}//end getDocumentation()
}//end class Documentation

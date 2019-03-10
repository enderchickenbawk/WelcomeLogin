package com.no32ks.nobackdoors;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.ItemStack;

public class No32ks implements Listener {
	
	public No32ks(Main plugin) {
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evant) {
		
		Player player =(Player) evant.getPlayer();
        player.sendMessage("§6[WelcomeLogin] Welcome To " + (Bukkit.getServerName())); 
        player.sendMessage("§6You Are On Xp Level " + (player.getLevel())); 


		
        	
		
	
}}





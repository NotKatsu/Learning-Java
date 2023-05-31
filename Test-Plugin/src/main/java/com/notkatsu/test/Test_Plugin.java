package com.notkatsu.test;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test_Plugin extends JavaPlugin implements Listener {

    public FreezeCommand freezeCommand = new FreezeCommand();

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("freeze").setExecutor(freezeCommand);
    }

    @EventHandler
    public void player_move_event(PlayerMoveEvent event) {
        System.out.println(freezeCommand.frozenPlayers);

        if (freezeCommand.frozenPlayers.contains(event.getPlayer().getUniqueId())) {
            event.setCancelled(true);
        }
    }

}

package com.notkatsu.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FreezeCommand implements CommandExecutor {

    public List<UUID> frozenPlayers = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (strings.length == 1) {
                Player player = Bukkit.getPlayer(strings[0]);

                if (player == null) {
                    commandSender.sendMessage(ChatColor.RED + "[ERROR]" + ChatColor.WHITE + " That player does not exist..");
                } else {
                    frozenPlayers.add(player.getUniqueId());

                    player.sendMessage(ChatColor.RED + player.getDisplayName() + ChatColor.WHITE + " You have been frozen and can't move..");
                    commandSender.sendMessage(ChatColor.GREEN + player.getDisplayName() + ChatColor.WHITE + " Has been frozen successfully");
                }
            } else {
                commandSender.sendMessage(ChatColor.RED + "[ERROR]" + ChatColor.WHITE + " You are missing an arguement to run this command.");
            }
        }

        return false;
    }
}

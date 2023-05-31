package com.notkatsu.test;

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
            if (commandSender.isOp()) {
                Player player = (Player) commandSender;
                frozenPlayers.add(player.getUniqueId());

                commandSender.sendMessage(player.getDisplayName() + " You have been frozen.. You can't move.");
            }
        }

        return false;
    }
}

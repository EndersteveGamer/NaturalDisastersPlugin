package fr.enderstevegamer.naturaldisastersplugin.commands;

import fr.enderstevegamer.naturaldisastersplugin.Events.*;
import fr.enderstevegamer.naturaldisastersplugin.Loop;
import fr.enderstevegamer.naturaldisastersplugin.Main;
import fr.enderstevegamer.naturaldisastersplugin.RandomEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (command.getName().equalsIgnoreCase("triggerEvent")) {
                RandomEvent event = new RandomEvent();
                event.RandomEvent(true);
                player.sendMessage("Event triggered!");
            }
        }
        return false;
    }
}

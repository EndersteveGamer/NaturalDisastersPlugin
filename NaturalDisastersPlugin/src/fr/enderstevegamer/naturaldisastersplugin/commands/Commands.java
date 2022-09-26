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
                if (strings.length == 0) {
                    RandomEvent event = new RandomEvent();
                    event.RandomEvent(true);
                    player.sendMessage("Random event triggered!");
                }
                else {
                    if (strings[0].equals("Tntrain")) {
                        Tntrain.tntrain();
                        player.sendMessage("Tntrain event triggered!");
                    }
                    else if (strings[0].equals("Darkness")) {
                        Darkness.darkness();
                        player.sendMessage("Darkness event triggered!");
                    }
                    else if (strings[0].equals("Lava")) {
                        Lava.lava();
                        player.sendMessage("Lava event triggered!");
                    }
                    else if (strings[0].equals("ZombieInvasion")) {
                        ZombieInvasion.zombieInvasion();
                        player.sendMessage("ZombieInvasion event triggered!");
                    }
                    else if (strings[0].equals("Flood")) {
                        Flood.flood();
                        player.sendMessage("Flood event triggered!");
                    }
                    else if (strings[0].equals("Floatingisland")) {
                        Floatingisland.floatingisland();
                        player.sendMessage("Floatingisland event triggered!");
                    }
                    else {
                        player.sendMessage("Invalid event name!");
                    }
                }
            }
        }
        return false;
    }
}

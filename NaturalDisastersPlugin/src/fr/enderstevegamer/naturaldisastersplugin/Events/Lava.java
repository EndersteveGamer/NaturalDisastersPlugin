package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Lava {
    public static void lava() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cIt's getting hot outta here!");
            for (int i = 0 ; i < 20 ; i++) {
                int x = (int) (Math.random() * (20 - (-20) + 1)) + (-20);
                int z = (int) (Math.random() * (20 - (-20) + 1)) + (-20);
                Location pos = player.getLocation();
                int y = pos.getWorld().getHighestBlockYAt(pos.getBlockX() + x, pos.getBlockZ() + z);
                player.getWorld().getBlockAt(pos.getBlockX() + x, y + 1, pos.getBlockZ() + z).setType(Material.LAVA);
            }
            for (int i = 0 ; i < 40 ; i++) {
                int x = (int) (Math.random() * (20 - (-20) + 1)) + (-20);
                int z = (int) (Math.random() * (20 - (-20) + 1)) + (-20);
                Location pos = player.getLocation();
                int y = pos.getWorld().getHighestBlockYAt(pos.getBlockX() + x, pos.getBlockZ() + z);
                player.getWorld().getBlockAt(pos.getBlockX() + x, y + 1, pos.getBlockZ() + z).setType(Material.FIRE);
            }
        }
    }
}

package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Flood {
    public static void flood() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cA giant wave floods the area!");
            for (int x = -20 ; x < 20 ; x++) {
                for (int z = -20 ; z < 20 ; z++) {
                    int highestY = player.getWorld().getHighestBlockYAt(player.getLocation().add(x, 0, z));
                    for (int y = 0 ; y < 20 ; y++) {
                        player.getWorld().getBlockAt(
                                player.getLocation().add(x, -player.getLocation().getY() + highestY + 1 + y, z)
                                                        ).setType(Material.WATER);
                    }
                }
            }
            player.getWorld().setThundering(true);
        }
    }
}

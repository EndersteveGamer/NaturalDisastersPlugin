package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class Floatingisland {
    public static void floatingisland() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cA floating island appears!");
            for (int x = -10 ; x <= 10 ; x++) {
                for (int z = -10 ; z <= 10 ; z++) {
                    int highestY = player.getWorld().getHighestBlockYAt(player.getLocation().add(x, 0, z));
                    for (int y = -10 ; y <= 10 ; y++) {
                        Block block = player.getWorld().getBlockAt(player.getLocation().add(x, y, z));
                        BlockData blockData = player.getWorld().getBlockAt(player.getLocation().add(x, y, z)).getBlockData();
                        player.getWorld().getBlockAt(player.getLocation().add(x, y, z)).setType(Material.AIR);
                        player.getWorld().getBlockAt(player.getLocation().add(x, highestY + y + 30, z)).setType(block.getType());
                        player.getWorld().getBlockAt(player.getLocation().add(x, highestY + y + 30, z)).setBlockData(blockData);
                    }
                }
            }
            player.getLocation().setY(player.getWorld().getHighestBlockYAt(player.getLocation()) + 30);
        }
    }
}

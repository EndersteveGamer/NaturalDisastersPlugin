package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Floatingisland {
    public static void floatingisland() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cThe ground suddenly goes up!");
            int highestY = player.getWorld().getHighestBlockYAt(player.getLocation());
            for (int x = -15 ; x <= 15 ; x++) {
                for (int z = -15 ; z <= 15 ; z++) {
                    for (int y = -10 ; y <= 10 ; y++) {
                        Block block = player.getWorld().getBlockAt(player.getLocation().add(x, y, z));
                        BlockData blockData = player.getWorld().getBlockAt(player.getLocation().add(x, y, z)).getBlockData();
                        player.getWorld().getBlockAt(player.getLocation().add(x, y, z)).setType(Material.AIR);
                        player.getWorld().getBlockAt(player.getLocation().add(x, -player.getLocation().getY() + highestY + y + 30, z)).setType(block.getType());
                        player.getWorld().getBlockAt(player.getLocation().add(x, -player.getLocation().getY() + highestY + y + 30, z)).setBlockData(blockData);
                    }
                }
            }
            player.teleport(player.getLocation().add(0, -player.getLocation().getY() + highestY + 30.5, 0));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20, 1));
        }
    }
}

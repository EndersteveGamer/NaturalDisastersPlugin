package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;

import java.util.List;

public class Tntrain {
    public static void tntrain() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cTNT starts to rain!");
            for (int x = -20 ; x < 20 ; x++) {
                for (int z = -20 ; z < 20 ; z++) {
                    if (x%4 == 0 && z%4 == 0) {
                        Entity tnt = player.getWorld().spawnEntity(player.getLocation().add(x, 30 + ((Math.abs(x / 2) + Math.abs(z / 2)) / 2) * 10, z), EntityType.PRIMED_TNT);
                        TNTPrimed Tnt = (org.bukkit.entity.TNTPrimed) tnt;
                        Tnt.setFuseTicks(40 + 10 * (Math.abs(x / 2) + Math.abs(z / 2)));
                    }
                }
            }
        }
    }
}

package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class Darkness {
    public static void darkness() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cDarkness falls upon the world!");
            player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 3000, 1));
            Objects.requireNonNull(Bukkit.getWorld("world")).setTime(14000);
        }
    }
}


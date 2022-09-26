package fr.enderstevegamer.naturaldisastersplugin;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Loop extends BukkitRunnable {

    int TimeLeft = 180;
    RandomEvent event = new RandomEvent();

    @Override
    public void run() {
        if (TimeLeft == 0) {
            TimeLeft = 180;
            event.RandomEvent(true);
        } else {
            if (Bukkit.getOnlinePlayers().size() > 0) {
                TimeLeft--;
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.GOLD + "Next event in " + ChatColor.RED + TimeLeft / 60 + ChatColor.GOLD + " minutes and " + ChatColor.RED + TimeLeft % 60 + ChatColor.GOLD + " seconds"));
                }
            }
        }
    }
}

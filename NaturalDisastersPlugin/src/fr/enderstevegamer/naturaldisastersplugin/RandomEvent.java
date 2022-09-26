package fr.enderstevegamer.naturaldisastersplugin;

import fr.enderstevegamer.naturaldisastersplugin.Events.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class RandomEvent {
    public static <bool> void RandomEvent(boolean canDouble) {
        if (canDouble) {
            double random = Math.random();
            if (random <=0.125) {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.sendTitle("§cDouble event!", "2 event at the same time!", 0, 20, 0);
                }
                int event1 = (int) (Math.random() * (6 - 1 + 1)) + 1;
                switch (event1) {
                    case 1 -> Darkness.darkness();
                    case 2 -> Lava.lava();
                    case 3 -> Tntrain.tntrain();
                    case 4 -> ZombieInvasion.zombieInvasion();
                    case 5 -> Flood.flood();
                    case 6 -> Floatingisland.floatingisland();
                }
                int event2 = event1;
                while (event2 == event1) {
                    event2 = (int) (Math.random() * (6 - 1 + 1)) + 1;
                }
                switch (event2) {
                    case 1 -> Darkness.darkness();
                    case 2 -> Lava.lava();
                    case 3 -> Tntrain.tntrain();
                    case 4 -> ZombieInvasion.zombieInvasion();
                    case 5 -> Flood.flood();
                    case 6 -> Floatingisland.floatingisland();
                }
            }
        else {
                int eventNumber = (int) (Math.random() * (6 - 1 + 1)) + 1;
                switch (eventNumber) {
                    case 1 -> Tntrain.tntrain();
                    case 2 -> Darkness.darkness();
                    case 3 -> Lava.lava();
                    case 4 -> ZombieInvasion.zombieInvasion();
                    case 5 -> Flood.flood();
                    case 6 -> Floatingisland.floatingisland();
                }
            }
        }
    }
}

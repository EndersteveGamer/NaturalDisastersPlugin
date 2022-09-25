package fr.enderstevegamer.naturaldisastersplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class ZombieInvasion {
    public static void zombieInvasion() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("§cThe dead are rising!");
            for (int i = 0 ; i < 20 ; i++) {
                int x = (int) (Math.random() * (20 - (-20) + 1)) + (-20);
                int z = (int) (Math.random() * (20 - (-20) + 1)) + (-20);
                Location pos = player.getLocation();
                int y = pos.getWorld().getHighestBlockYAt(pos.getBlockX() + x, pos.getBlockZ() + z);
                y++;
                Entity zombie = player.getWorld().spawnEntity(player.getLocation().add(x, - player.getLocation().getY() + y, z), EntityType.ZOMBIE);
                Zombie zombie2 = (Zombie) zombie;
                ItemStack sword = new ItemStack(org.bukkit.Material.DIAMOND_SWORD);
                zombie2.getEquipment().setItemInMainHand(sword);
                ItemStack helmet = new ItemStack(org.bukkit.Material.DIAMOND_HELMET);
                helmet.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
                zombie2.getEquipment().setHelmet(helmet);
                zombie2.setAdult();
            }
        }
    }
}

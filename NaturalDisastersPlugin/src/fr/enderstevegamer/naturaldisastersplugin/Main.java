package fr.enderstevegamer.naturaldisastersplugin;

import fr.enderstevegamer.naturaldisastersplugin.commands.Commands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("NaturalDisastersPlugin has been enabled!");
        Loop loop = new Loop();
        loop.runTaskTimer(this, 0, 20);
        getCommand("triggerEvent").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        getLogger().info("NaturalDisastersPlugin has been disabled!");
    }
}

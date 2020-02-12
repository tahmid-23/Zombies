package net.dip;

import net.dip.listeners.EPlayerClick;
import net.dip.objects.guns.Pistol;
import net.dip.objects.guns.SuperGun;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Map;

/**
 * Main class that handles all startup features
 */
public class Main extends JavaPlugin {
    private static Main plugin;
    private static List<SuperGun> guns;

    @Override
    public void onEnable() {
        plugin = this;
        registerCommands();
        registerEvents();
        registerGuns();
    }

    @Override
    public void onDisable(){

    }

    /**
     * Registers all listeners by deferring to appropriate helper method
     */
    private void registerEvents(){
        registerEvents(this, new EPlayerClick());
    }

    /**
     * Registers all commands
     */
    private void registerCommands(){

    }

    /**
     * Initialize all guns
     */
    private void registerGuns(){
        guns.add(new Pistol());
    }

    /**
     * Registers all listener classes, code courtesy of Meecles
     *
     * @param plugin this
     * @param listeners list of listener classes
     */
    private static void registerEvents(Plugin plugin, Listener... listeners){
        for(Listener listener : listeners){
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }

    public static Plugin getPlugin(){
        return plugin;
    }

    public static List<SuperGun> getGuns(){
        return guns;
    }
}

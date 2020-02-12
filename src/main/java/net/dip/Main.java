package net.dip;

import net.dip.listeners.EPlayerClick;
import net.dip.managers.GameManager;
import net.dip.managers.UserManager;
import net.dip.objects.guns.Gun;
import net.dip.objects.guns.Pistol;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

/**
 * Main class that handles all startup features
 */
public class Main extends JavaPlugin {
    private static Main plugin;
    private static GameManager gameManager;
    private static UserManager userManager;
    private static List<Gun> guns;

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

    public static GameManager getGameManager(){
        if(gameManager == null)
            gameManager = new GameManager();
        return gameManager;
    }

    public static UserManager getUserManager(){
        if(userManager == null)
            userManager = new UserManager();
        return userManager;
    }


    public static List<Gun> getGuns(){
        return guns;
    }
}

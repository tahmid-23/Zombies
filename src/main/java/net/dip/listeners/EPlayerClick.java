package net.dip.listeners;

import net.dip.Main;
import net.dip.objects.guns.SuperGun;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EPlayerClick implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent e){

        Material item = e.getItem().getType();

        if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            for(SuperGun gun : Main.getGuns()){
                if(gun.getItem().equals(item)){
                    gun.shoot();
                    break;
                }
            }
        }

        else if(e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.LEFT_CLICK_BLOCK)){
            for(SuperGun gun : Main.getGuns()){
                if(gun.getItem().equals(item)){
                    gun.reload();
                    break;
                }
            }
        }

    }
}

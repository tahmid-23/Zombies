package net.dip.listeners;

import net.dip.Main;
import net.dip.enums.GameState;
import net.dip.enums.UserStatus;
import net.dip.objects.User;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static net.dip.managers.GameManager.getGameState;

public class EPlayerClick implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent e){

        Material item = e.getItem().getType();
        User u = Main.getUserManager().getUser(e.getPlayer());

        if(u.getStatus().equals(UserStatus.ALIVE)) {

            //placeholder TODO
            boolean nearLocation = true;
            if (nearLocation && getGameState().equals(GameState.INGAME)) {
                //something like shop.purchase(u)
            }

            else if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                Main.getGuns().forEach(gun -> {
                    if (gun.getItem().equals(item))
                        gun.shoot(u);
                });
            }

            else if (e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
                Main.getGuns().forEach(gun -> {
                    if (gun.getItem().equals(item))
                        gun.reload(u);
                });
            }
        }
    }
}

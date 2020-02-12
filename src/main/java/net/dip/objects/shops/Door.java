package net.dip.objects.shops;

import net.dip.objects.User;
import org.bukkit.Location;

public class Door implements IShop {

    private String name;
    private int gold;
    private Location location;

    public Door(String name, int gold, Location location){
        this.name = name;
        this.gold = gold;
        this.location = location;
    }

    public int getGold(){
        return gold;
    }

    public Location getLocation(){
        return location;
    }

    public void purchase(User u){
        //TODO

        /*
        pseudocode
        - check gold
        - open if enough gold and broadcast
        - send message if not enough gold
         */

        if(u.getGold() >= this.getGold()){
            u.setGold(u.getGold() - this.getGold());
            //open door
            //broadcast message
        } else {
            u.getPlayer().sendMessage("Not enough gold!");
        }

    }
}
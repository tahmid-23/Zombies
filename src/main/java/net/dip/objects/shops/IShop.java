package net.dip.objects.shops;

import net.dip.objects.User;
import org.bukkit.Location;

public interface IShop {

    int getGold();
    Location getLocation();
    void purchase(User u);
}
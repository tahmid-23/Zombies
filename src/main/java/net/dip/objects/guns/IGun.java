package net.dip.objects.guns;

import net.dip.objects.User;

public interface IGun {

    /**
     * Shoot gun.
     */
    void shoot(User u);

    /**
     * Reload gun.
     */
    void reload(User u);
}
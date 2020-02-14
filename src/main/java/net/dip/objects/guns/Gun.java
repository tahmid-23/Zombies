package net.dip.objects.guns;

import net.dip.objects.User;
import org.bukkit.Material;
import org.bukkit.Particle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Superclass object to represent all guns
 */
public abstract class Gun implements IGun {
    private String name;
    private Material item;

    private double damage;
    private int ammo;
    private int clipAmmo;
    private double fireRate;
    private double reloadRate;
    private String[] description;
    private Particle beam;

    Gun(String name, Material item, double damage, int ammo, int clipAmmo, double fireRate, double reloadRate){
        this(name, item, damage, ammo, clipAmmo, fireRate, reloadRate, null); //TODO
    }

    Gun(String name, Material item, double damage, int ammo, int clipAmmo, double fireRate, double reloadRate, Particle beam){
        this.name = name;
        this.item = item;

        this.damage = damage;
        this.ammo = ammo;
        this.clipAmmo = clipAmmo;
        this.fireRate = fireRate;
        this.reloadRate = reloadRate;
        this.beam = beam;
    }

    /**
     * Sets the description of the Gun.
     *
     * @param description String list to represent Gun description
     */
    protected void setDescription(String... description){
        this.description = description;
    }

    /**
     * Gets the lore of the Gun.
     *
     * @return a List of Strings containing the lore of the Gun
     */
    public List<String> getLore() {
        List<String> lore = new ArrayList<>();

        //TODO color
        Collections.addAll(lore, description);
        lore.add("");
        lore.add("Damage: " + getDamage() + " HP");
        lore.add("Ammo: " + getAmmo());
        lore.add("Clip Ammo: " + getClipAmmo());
        lore.add("Fire Rate: " + getFireRate() + "s");
        lore.add("Reload: " + getReloadRate() + "s");
        lore.add("");
        lore.add("LEFT-CLICK to reload.");
        lore.add("RIGHT-CLICK to shoot.");

        return lore;
    }

    public void shoot(User u){
        //TODO
    }

    public void reload(User u){
        //TODO
    }

    /* Appropriate accessor methods below */

    public String getName() {
        return name;
    }

    public Material getItem() {
        return item;
    }

    public double getDamage() {
        return damage;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getClipAmmo() {
        return clipAmmo;
    }

    public double getFireRate() {
        return fireRate;
    }

    public double getReloadRate() {
        return reloadRate;
    }
}

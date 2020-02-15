package net.dip.objects.guns;

import org.bukkit.Material;
import org.bukkit.Particle;

public class Pistol extends LinearGun {

    private static final String GUN_NAME = "Pistol";
    private static final Material GUN_OBJECT = Material.WOODEN_HOE;
    private static final Particle GUN_PARTICLE = Particle.CRIT;

    private static final int MAX_HIT_ENTITIES = 1;
    private static final int GUN_RANGE = 50;
    private static final double DAMAGE = 6.0;
    private static final int AMMO = 300;
    private static final int MAX_AMMO = 450; // TODO: Verify
    private static final int CLIP_AMMO = 10;
    private static final int MAX_CLIP_AMMO = 14;
    private static final double FIRE_RATE = 0.5;
    private static final double RELOAD_RATE = 1.5;

    public Pistol(){
        super(GUN_NAME, GUN_OBJECT, GUN_PARTICLE, GUN_RANGE, DAMAGE, AMMO, MAX_AMMO, CLIP_AMMO, MAX_CLIP_AMMO, FIRE_RATE, RELOAD_RATE, MAX_HIT_ENTITIES);

        setDescription("This is your starter gun. You're",
                "gonna want to upgrade this at",
                "some point.");
    }

}

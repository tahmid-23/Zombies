package net.dip.objects.guns;

import org.bukkit.Material;
import org.bukkit.Particle;

public class Rifle extends LinearGun {

    private static final String GUN_NAME = "Rifle";
    private static final Material GUN_OBJECT = Material.STONE_HOE;
    private static final Particle GUN_PARTICLE = null; // TODO: Find the particle

    private static final int MAX_HIT_ENTITIES = 1;
    private static final int GUN_RANGE = 5;
    private static final double DAMAGE = 6.0;
    private static final int AMMO = 256;
    private static final int MAX_AMMO = 300; // TODO: Verify
    private static final int CLIP_AMMO = 32;
    private static final int MAX_CLIP_AMMO = 32;
    private static final double FIRE_RATE = 0.5;
    private static final double RELOAD_RATE = 1.5;

    //TODO get specs
    public Rifle(){
        super(GUN_NAME, GUN_OBJECT, GUN_PARTICLE, MAX_HIT_ENTITIES, GUN_RANGE, DAMAGE, AMMO, MAX_AMMO, CLIP_AMMO, MAX_CLIP_AMMO, FIRE_RATE, RELOAD_RATE);
        setDescription("This is your starter gun. You're",
                "gonna want to upgrade this at",
                "some point.");
    }
}
package net.dip.objects.guns;

import net.dip.objects.guns.gunbeams.LinearBeam;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;

import java.util.HashSet;
import java.util.Set;

public class LinearGun extends Gun {

    protected final int maxHitEntities;

    /**
     * Creates a gun like the Gun superclass
     *
     * @param maxHitEntities The maximum number of entities the gun can pass through
     */
    LinearGun(String name, Material item, Particle particle, int gunRange, double damage, int ammo, int maxAmmo, int clipAmmo, int maxClipAmmo, double fireRate, double reloadRate, int maxHitEntities) {
        super(name, item, particle, gunRange, damage, ammo, maxAmmo, clipAmmo, maxClipAmmo, fireRate, reloadRate);
        this.maxHitEntities = maxHitEntities;
    }

    public void shoot(Player player){
        World world = player.getWorld();
        Vector eyeLocation = player.getEyeLocation().toVector().clone();
        Vector eyeDirection = player.getEyeLocation().getDirection().clone();
        Vector targetBlockVector = getTargetBlockVector(player, eyeLocation, eyeDirection);

        sendShot(world, eyeLocation, eyeDirection, targetBlockVector);
    }

    public void reload() {
        // TODO: Reload

    }

    private void sendShot(World world, Vector particleLocation, Vector particleDirection, Vector targetBlockVector) {
        LinearBeam beam = new LinearBeam(world, particle, particleLocation, particleDirection, targetBlockVector, maxHitEntities);
        beam.send();
    }

    private Vector getTargetBlockVector(Player player, Vector eyeLocation, Vector eyeDirection) {
        Set<Material> materials = new HashSet<>();

        materials.add(Material.AIR);
        materials.add(Material.CAVE_AIR);

        // TODO: Add slab blocks

        BoundingBox targetedBlockBoundingBox = player.getTargetBlock(materials, gunRange).getBoundingBox();
        return targetedBlockBoundingBox.rayTrace(eyeLocation, eyeDirection, gunRange).getHitPosition();
    }
}

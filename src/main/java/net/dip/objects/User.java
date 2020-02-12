package net.dip.objects;

import net.dip.enums.PerkType;
import net.dip.enums.UserStatus;
import org.bukkit.entity.Player;

import static net.dip.utils.Constants.MAX_PERK_COUNT;

/**
 * Represents the player that is in game
 */
public class User {
    private Player player;
    private int gold;
    private UserStatus status;
    private PerkType[] perks;

    /**
     * Constructor to initialize player defaults
     *
     * @param player the Player to represent the User object
     */
    public User(Player player){
        setPlayer(player);
        setGold(0);
        perks = new PerkType[MAX_PERK_COUNT];
    }

    /**
     * Get the Player representing the User object
     *
     * @return the Player associated with the User object
     */
    public Player getPlayer(){
        return player;
    }

    /**
     * Set the Player to the User object
     *
     * @param player the Player to represent the User object
     */
    private void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Get the gold of the User
     *
     * @return int representing User's gold
     */
    public int getGold() {
        return gold;
    }

    /**
     * Sets the gold of the User
     *
     * @param gold the int to set the User's gold to
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Gets the status of the User, i.e, alive, knocked, or dead.
     *
     * @return UserStatus of the User
     */
    public UserStatus getStatus(){
        return status;
    }

    /**
     * Sets the status of the User.
     *
     * @param userStatus the UserStatus to set
     */
    public void setStatus(UserStatus userStatus){
        this.status = userStatus;
    }

    /**
     * Get the perks of the User. Each index corresponds to the perk slot.
     *
     * @return an array of perks that the player has
     */
    public PerkType[] getPerks() {
        return perks;
    }

    public void setPerks(){
        //TODO
    }
}

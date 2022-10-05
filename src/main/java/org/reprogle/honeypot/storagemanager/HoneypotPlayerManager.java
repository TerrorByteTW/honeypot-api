package org.reprogle.honeypot.storagemanager;

import org.bukkit.entity.Player;

/**
 * A class for managing Honeypot players.
 * Adds functions for creating, setting counts, getting counts, and even
 * clearing out the DB.
 * 
 * @see HoneypotPlayerObject
 * @see HoneypotBlockManager
 * @see HoneypotBlockObject
 */
public class HoneypotPlayerManager {

    private static HoneypotPlayerManager instance = null;

    private HoneypotPlayerManager() {
    }

    /**
     * Returns the singleton instance of this class
     * 
     * @return The {@link HoneypotPlayerManager} instance
     */
    public static HoneypotPlayerManager getInstance() {
        if (instance == null)
            instance = new HoneypotPlayerManager();

        return instance;
    }

    /**
     * Create a honeypot block by calling the SQLite DB. In the future this will be
     * a switch case statement to handle
     * multiple DB types
     * 
     * @param player       The Player object
     * @param blocksBroken The amount of Blocks broken
     */
    public void addPlayer(Player player, int blocksBroken) {
        /*
         * Function intentionally left blank as it's just a placeholder to develop
         * against Honeypot
         */
    }

    /**
     * Set the number of blocks broken by the player by calling the SQLite
     * setPlayerCount function. In the future this
     * will be a switch case statement to handle multiple DB types without changing
     * code
     * 
     * @param playerName   The Player object
     * @param blocksBroken The amount of blocks broken by the player
     */
    public void setPlayerCount(Player playerName, int blocksBroken) {
        /*
         * Function intentionally left blank as it's just a placeholder to develop
         * against Honeypot
         */
    }

    /**
     * Return the amount of blocks the player has broken. If it returns -1, then the
     * player doesn't exist in the DB yet (They haven't broken any Honeypots)
     * 
     * @param playerName the Player name
     * @return The amount of Honeypot blocks the player has broken
     */
    public int getCount(Player playerName) {
        return getCount(playerName);
    }

    /**
     * Delete's all players in the DB
     */
    public void deleteAllHoneypotPlayers() {
        /*
         * Function intentionally left blank as it's just a placeholder to develop
         * against Honeypot
         */
    }

}

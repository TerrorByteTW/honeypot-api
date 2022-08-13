package org.reprogle.honeypot.storagemanager;

import java.util.List;

import org.bukkit.entity.Player;

/**
 * A class for managing Honeypot history entries.
 * Adds functions for creating, removing, querying, and purging the history database. 
 * @see HoneypotPlayerHistoryObject
 */
public class HoneypotPlayerHistoryManager {

    /**
     * Add an entry to the player history table
     * @param p The player to add
     * @param b The honeypot block they triggered
     */
    public void addPlayerHistory(Player p, HoneypotBlockObject b) {
        // Intentionally left blank
    }

    /**
     * Get the history for a player
     * @param p The player to grab history for
     * @return A list of all HoneypotPlayerHistory objects
     */
    public List<HoneypotPlayerHistoryObject> getPlayerHistory(Player p) {
        return getPlayerHistory(p);
    }

    /**
     * Delete all history for a particular player. An optional n parameter for specifying the number of most recent rows to delete
     * @param p The player to delete
     * @param n Optional, the number of most recent rows
     */
    public void deletePlayerHistory (Player p, int... n) {
        // Intentionally left blank
    }

    /**
     * A function to purge the entire history table
     */
    public void deleteAllHistory() {
        // Intentionally left blank
    }

}

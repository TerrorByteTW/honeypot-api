package org.reprogle.honeypot.storagemanager;

import org.bukkit.block.Block;

import java.util.List;

/**
 * A class for managing Honeypot blocks.
 * Adds functions for creating, removing, verifying, getting the action, listing
 * all blocks, and even clearing out the DB.
 * 
 * @see HoneypotPlayerObject
 * @see HoneypotPlayerManager
 * @see HoneypotBlockObject
 */
public class HoneypotBlockManager {

    private static HoneypotBlockManager instance = null;

    /**
     * Creates an version of the HoneypotBlockManager
     * @deprecated
     * This function is now deprecated as this class is intended to be used as a singleton. Please use {@link #getInstance()} instead
     * The immediate next version of Honeypot will make this function private.
     */
    @Deprecated
    public HoneypotBlockManager() {
      // There is really no need for this to be public, but we're deprecating it so that it still supports legacy plugins
    }

    /**
     * Returns the singleton instance of this class
     * 
     * @return The {@link HoneypotBlockManager} instance
     */
    // Warnings are suppressed due to the deprecation of the public HoneypotBlockManager constructor
    @SuppressWarnings("java:S1874")
    public static HoneypotBlockManager getInstance() {
        if (instance == null)
            instance = new HoneypotBlockManager();

        return instance;
    }

    /**
     * Create a honeypot {@link Block} by creating a HoneypotBlock object and
     * storing it to DB.
     * 
     * @param block  The Honeypot Block we're creating
     * @param action The action of the Honeypot
     */
    @SuppressWarnings("java:S1604")
    public void createBlock(Block block, String action) {
        /*
         * Function intentionally left blank as it's just a placeholder to develop
         * against Honeypot
         */
    }

    /**
     * Compare the coordinates of the received {@link Block} to the DB. If it
     * exists, delete it and break to avoid a
     * Java error
     * 
     * @param block The Honeypot {@link Block} we're deleting
     */
    public void deleteBlock(Block block) {
        /*
         * Function intentionally left blank as it's just a placeholder to develop
         * against Honeypot
         */
    }

    /**
     * Check if the coordinates of the Honeypot already exist within the list
     * 
     * @param block The {@link Block} we're checking
     * @return true or false
     */
    public boolean isHoneypotBlock(Block block) {
        return isHoneypotBlock(block);
    }

    /**
     * Convert a block to its {@link HoneypotBlockObject}, if it exists in the
     * database
     * 
     * @param block The block to convert to a HoneypotBlockObject
     * @return HoneypotBlockObject if it exists, null if it doesn't
     * @see HoneypotBlockObject
     */
    public HoneypotBlockObject getHoneypotBlock(Block block) {
        return getHoneypotBlock(block);
    }

    /**
     * Return the action for the honeypot {@link Block} (Meant for ban, kick, etc.)
     * If a string is returned that is not a default action, it's custom.
     * 
     * @param block The Block we're checking
     * @return The Honeypot's action as a string
     */
    public String getAction(Block block) {
        return getAction(block);
    }

    /**
     * Delete all Honeypots in the entire DB. Do not use unless you know what you're
     * doing
     */
    public void deleteAllHoneypotBlocks() {
        /*
         * Function intentionally left blank as it's just a placeholder to develop
         * against Honeypot
         */
    }

    /**
     * Get all {@link HoneypotBlockObject} in the DB
     * 
     * @return An array list of all HoneypotBlockObjects
     */
    public List<HoneypotBlockObject> getAllHoneypots() {
        return getAllHoneypots();
    }
}

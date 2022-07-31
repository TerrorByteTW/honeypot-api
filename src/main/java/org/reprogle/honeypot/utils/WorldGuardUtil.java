package org.reprogle.honeypot.utils;

import org.bukkit.entity.Player;

import com.sk89q.worldguard.protection.flags.StateFlag;

/**
 * A small utility class for helping connect with WorldGuard. This allows direct interaction with the
 * Honeypot WorldGuard flag, and also allows developers to check if actions are allowed within a region, all
 * without directly integrating WorldGuard in your project
 */
public abstract class WorldGuardUtil {

	/**
     * Sets up the hook for WorldGuard
	 * 
	 * @return The StateFlag that was setup, if necessary.
     */
    @SuppressWarnings("java:S2696")
    public abstract StateFlag setupWorldGuard();

	/**
	 * Returns the WorldGuard flag
	 * @return {@link StateFlag}
	 */
	public abstract StateFlag getWorldGuardFlag();

	/**
	 * Check if the allow-honeypots flag is on
	 * 
	 * @param player The player initiating the action
	 * @return True if the action is allowed, false if the action isn't allowed OR if WorldGuard support isn't enabled.
	 * @see #isEnabled() {@link #isEnabled()}
	 */
	public abstract boolean isAllowed(Player player);
}

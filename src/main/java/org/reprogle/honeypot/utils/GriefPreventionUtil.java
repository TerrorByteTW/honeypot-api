package org.reprogle.honeypot.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * A small utility class for helping connect with GriefPrevention. This allows developers to check 
 * if Honeypots are allowed within a region, all without directly integrating WorldGuard in your project
 */
public abstract class GriefPreventionUtil {

	/**
	 * Check if the player has permission
	 * @param player The player placing the block
	 * @param location The location of the block being placed (It may be different than the players location)
	 * @return True if allowed, false if not
	 */
	public abstract boolean isAllowed(Player player, Location location);
}

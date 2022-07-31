package org.reprogle.honeypot.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public abstract class GriefPreventionUtil {

	/**
	 * Check if the player has permission
	 * @param player The player placing the block
	 * @param location The location of the block being placed (It may be different than the players location)
	 * @return
	 */
	public abstract boolean isAllowed(Player player, Location location);
}

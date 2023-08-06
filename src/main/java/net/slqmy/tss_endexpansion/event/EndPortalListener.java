package net.slqmy.tss_endexpansion.event;

import net.slqmy.tss_endexpansion.TSSEndExpansionPlugin;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

public class EndPortalListener implements Listener {

	private final TSSEndExpansionPlugin plugin;

	public EndPortalListener(TSSEndExpansionPlugin plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onPortalEnter(@NotNull PlayerPortalEvent event) {
		World destinationWorld = event.getTo().getWorld();

		if (!destinationWorld.getName().endsWith("_the_end")) {
			return;
		}

		for (Entity entity : destinationWorld.getEntities()) {
			if (entity instanceof EnderDragon) {
				new BukkitRunnable() {

					@Override
					public void run() {
						entity.setVelocity(entity.getLocation().getDirection().rotateAroundY(Math.PI / 2D).multiply(1.8F));
					}
				}.runTaskTimer(plugin, 0, 1);

				break;
			}
		}
	}
}

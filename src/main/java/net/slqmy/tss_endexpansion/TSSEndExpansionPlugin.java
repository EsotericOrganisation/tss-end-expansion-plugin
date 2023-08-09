package net.slqmy.tss_endexpansion;

import net.slqmy.tss_endexpansion.event.EndPortalListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TSSEndExpansionPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new EndPortalListener(this), this);
	}
}

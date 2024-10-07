package org.esoteric_organisation.tss_end_expansion_plugin;

import org.esoteric_organisation.tss_end_expansion_plugin.event.EndPortalListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TSSEndExpansionPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
	Bukkit.getPluginManager().registerEvents(new EndPortalListener(this), this);
  }
}

package org.esoteric.tss.minecraft.plugins.end.expansion;

import org.esoteric.tss.minecraft.plugins.end.expansion.events.EndPortalListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TSSEndExpansionPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
	Bukkit.getPluginManager().registerEvents(new EndPortalListener(this), this);
  }
}

package net.edryu.longsword;

import net.fabricmc.api.ModInitializer;

public class LongswordMain implements ModInitializer {

	@Override
	public void onInitialize() {
		LongswordRegistry.init();
		LongswordLoot.init();
	}
}
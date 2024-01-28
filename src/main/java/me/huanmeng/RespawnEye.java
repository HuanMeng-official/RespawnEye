package me.huanmeng;

import me.huanmeng.world.blocks.ReBlocks;
import me.huanmeng.world.groups.BlockGroups;
import me.huanmeng.world.groups.ItemGroups;
import me.huanmeng.world.items.ReItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespawnEye implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Respawneye");
	public static final String MODID = "respawneye";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ReItems.registryItems();
		ReBlocks.registryBlocks();
		ItemGroups.registryGroup();
		BlockGroups.registryGroup();
	}
}
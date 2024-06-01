package me.huanmeng;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.group.BlockGroups;
import me.huanmeng.group.FoodGroups;
import me.huanmeng.group.ItemGroups;
import me.huanmeng.group.ToolGroups;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import me.huanmeng.world.gen.ReWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespawnEye implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Respawneye");
	public static final String MODID = "respawneye";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric World!");
		ReItems.registryItems();
		ReBlocks.registryBlocks();
		ReTools.registryTools();
		ItemGroups.registryGroup();
		BlockGroups.registryGroup();
		FoodGroups.registryGroup();
		ToolGroups.registryGroup();
		ReWorldGeneration.generateModWorldGen();
	}
}
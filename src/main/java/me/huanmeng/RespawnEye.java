package me.huanmeng;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.group.*;
import me.huanmeng.item.ReArmors;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import me.huanmeng.world.gen.ReWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespawnEye implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("RespawnEye");
	public static final String MODID = "respawneye";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric World!");
		ReItems.registryItems();
		ReBlocks.registryBlocks();
		ReTools.registryTools();
		ReArmors.registryArmors();
		ItemsGroup.registryGroup();
		BlocksGroup.registryGroup();
		FoodsGroup.registryGroup();
		ToolsGroup.registryGroup();
		ArmorsGroup.registryGroup();
		ReWorldGeneration.generateModWorldGen();
	}
}
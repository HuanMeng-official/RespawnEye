package me.huanmeng;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.group.BlocksGroup;
import me.huanmeng.group.ItemsGroup;
import me.huanmeng.group.ToolsGroup;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespawnEye implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("respawneye");
	public static final String MODID = "respawneye";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ReItems.registryItems();
		ReBlocks.registryBlocks();
		ReTools.registryTools();
		ItemsGroup.registryGroup();
		BlocksGroup.registryGroup();
		ToolsGroup.registryGroup();
	}
}
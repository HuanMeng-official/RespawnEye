package me.huanmeng;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.enchantment.ReEnchantments;
import me.huanmeng.entity.ReEntity;
import me.huanmeng.entity.custom.AntEntity;
import me.huanmeng.group.*;
import me.huanmeng.item.ReArmor;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import me.huanmeng.world.gen.ReWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
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
		ReArmor.registryArmors();
		ItemGroups.registryGroup();
		BlockGroups.registryGroup();
		FoodGroups.registryGroup();
		ToolGroups.registryGroup();
		ArmorGroups.registryGroup();
		ReWorldGeneration.generateModWorldGen();
		ReEnchantments.registerEnchantments();
		FabricDefaultAttributeRegistry.register(ReEntity.ANT, AntEntity.setAttributes());
	}
}
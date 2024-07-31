package me.huanmeng.util;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.enchantment.ReEnchantments;
import me.huanmeng.entity.ReEntity;
import me.huanmeng.entity.custom.AntEntity;
import me.huanmeng.group.*;
import me.huanmeng.item.ReArmors;
import me.huanmeng.item.ReEggs;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import me.huanmeng.world.gen.ReWorldGeneration;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class RegistryEntity {
    public static void registryEntities() {
        ReItems.registryItems();
        ReBlocks.registryBlocks();
        ReTools.registryTools();
        ReArmors.registryArmors();
        ReEggs.registryEggss();
        ItemsGroup.registryGroup();
        BlocksGroup.registryGroup();
        FoodsGroup.registryGroup();
        ToolsGroup.registryGroup();
        ArmorsGroup.registryGroup();
        EggsGroup.registryGroup();
        ReWorldGeneration.generateModWorldGen();
        ReEnchantments.registerEnchantments();
        FabricDefaultAttributeRegistry.register(ReEntity.ANT, AntEntity.setAttributes());
    }
}

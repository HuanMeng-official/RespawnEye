package me.huanmeng.util;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.group.ArmorsGroup;
import me.huanmeng.group.BlocksGroup;
import me.huanmeng.group.ItemsGroup;
import me.huanmeng.group.ToolsGroup;
import me.huanmeng.item.ReArmors;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;

public class RegistryEntity {
    public static void registryEntities() {
        ReItems.registryItems();
        ReBlocks.registryBlocks();
        ReTools.registryTools();
        ReArmors.registryArmors();
        ItemsGroup.registryGroup();
        BlocksGroup.registryGroup();
        ToolsGroup.registryGroup();
        ArmorsGroup.registryGroup();
    }
}

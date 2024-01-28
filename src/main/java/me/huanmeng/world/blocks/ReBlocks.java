package me.huanmeng.world.blocks;

import me.huanmeng.RespawnEye;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReBlocks {

    public static Block registerBlocks(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RespawnEye.MODID, name), block);
    }

    public static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registryBlocks() {
        RespawnEye.LOGGER.info("Registering Blocks for " + RespawnEye.MODID);
    }
}

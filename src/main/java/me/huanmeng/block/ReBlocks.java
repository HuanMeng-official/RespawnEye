package me.huanmeng.block;

import me.huanmeng.RespawnEye;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReBlocks {

    public static final Block RUBY_ORE = registerBlocks("ruby_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlocks("deepslate_ruby_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block RUBY_BLOCK = registerBlocks("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block TITANIUM_ORE = registerBlocks("titanium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block TITANIUM_BLOCK = registerBlocks("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block URANIUM_ORE = registerBlocks("uranium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlocks("deepslate_uranium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block URANIUM_BLOCK = registerBlocks("uranium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SALT_ORE = registerBlocks("salt_ore", new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block DEEPSLATE_SALT_ORE = registerBlocks("deepslate_salt_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COAL_ORE)));
    
    public static Block registerBlocks(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RespawnEye.MODID, name), block);
    }

    public static void registerBlockItems(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registryBlocks() {
        RespawnEye.LOGGER.info("Registering Blocks for " + RespawnEye.MODID);
    }
}

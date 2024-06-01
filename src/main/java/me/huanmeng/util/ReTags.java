package me.huanmeng.util;

import me.huanmeng.RespawnEye;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ReTags {

    public static class Blocks {
        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(RespawnEye.MODID, name));
        }
        public static final TagKey<Block> RUBY = createTag("ruby");
    }

    public static class Items {
        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(RespawnEye.MODID, name));
        }
        public static final TagKey<Item> RUBY = createTag("ruby");
    }
}

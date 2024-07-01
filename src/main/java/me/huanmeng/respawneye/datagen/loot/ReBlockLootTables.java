package me.huanmeng.respawneye.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class ReBlockLootTables extends BlockLootSubProvider {
    protected ReBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
    }

//    @Override
//    protected Iterable<Block> getKnownBlocks() {
//        return
//    }
}

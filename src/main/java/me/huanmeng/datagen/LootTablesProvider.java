package me.huanmeng.datagen;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.item.ReItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTablesProvider extends FabricBlockLootTableProvider {

    public LootTablesProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ReBlocks.RUBY_BLOCK);
        addDrop(ReBlocks.TITANIUM_BLOCK);
        addDrop(ReBlocks.URANIUM_BLOCK);
        addDrop(ReBlocks.TIGERS_EYE_BLOCK);
        addDrop(ReBlocks.SALT_ORE, saltDrop(ReBlocks.SALT_ORE, ReItems.SALT));
        addDrop(ReBlocks.DEEPSLATE_SALT_ORE, saltDrop(ReBlocks.DEEPSLATE_SALT_ORE, ReItems.SALT));
        addDrop(ReBlocks.RUBY_ORE, oreDrops(ReBlocks.RUBY_ORE, ReItems.RUBY));
        addDrop(ReBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ReBlocks.DEEPSLATE_RUBY_ORE, ReItems.RUBY));
        addDrop(ReBlocks.TITANIUM_ORE, oreDrops(ReBlocks.TITANIUM_ORE, ReItems.RAW_TITANIUM));
        addDrop(ReBlocks.DEEPSLATE_TITANIUM_ORE, oreDrops(ReBlocks.DEEPSLATE_TITANIUM_ORE, ReItems.RAW_TITANIUM));
        addDrop(ReBlocks.URANIUM_ORE, oreDrops(ReBlocks.URANIUM_ORE, ReItems.RAW_URANIUM));
        addDrop(ReBlocks.DEEPSLATE_URANIUM_ORE, oreDrops(ReBlocks.DEEPSLATE_URANIUM_ORE, ReItems.RAW_URANIUM));
        addDrop(ReBlocks.TIGERS_EYE_ORE, oreDrops(ReBlocks.TIGERS_EYE_ORE, ReItems.RAW_TIGERS_EYE));
        addDrop(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE, oreDrops(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE, ReItems.RAW_TIGERS_EYE));
    }

    public LootTable.Builder saltDrop(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}

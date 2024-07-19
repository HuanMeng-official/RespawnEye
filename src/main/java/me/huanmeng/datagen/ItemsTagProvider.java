package me.huanmeng.datagen;

import me.huanmeng.item.ReArmors;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemsTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemsTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ReArmors.RUBY_HELMET, ReArmors.RUBY_CHESTPLATE, ReArmors.RUBY_LEGGINGS, ReArmors.RUBY_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ReArmors.AMETHYST_HELMET, ReArmors.AMETHYST_CHESTPLATE, ReArmors.AMETHYST_LEGGINGS, ReArmors.AMETHYST_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ReArmors.EMERALD_HELMET, ReArmors.EMERALD_CHESTPLATE, ReArmors.EMERALD_LEGGINGS, ReArmors.EMERALD_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ReArmors.ULTIMATE_HELMET, ReArmors.ULTIMATE_CHESTPLATE, ReArmors.ULTIMATE_LEGGINGS, ReArmors.ULTIMATE_BOOTS);
    }
}

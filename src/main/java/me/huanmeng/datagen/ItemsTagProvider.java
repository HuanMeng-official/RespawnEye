package me.huanmeng.datagen;

import me.huanmeng.item.ReArmor;
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
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ReArmor.RUBY_HELMET, ReArmor.RUBY_CHESTPLATE, ReArmor.RUBY_LEGGINGS, ReArmor.RUBY_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(ReArmor.AMETHYST_HELMET, ReArmor.AMETHYST_CHESTPLATE, ReArmor.AMETHYST_LEGGINGS, ReArmor.AMETHYST_BOOTS);
    }
}

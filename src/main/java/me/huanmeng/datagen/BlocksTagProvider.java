package me.huanmeng.datagen;

import me.huanmeng.block.ReBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BlocksTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlocksTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        // Needs Pickaxe Tools
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ReBlocks.RUBY_BLOCK)
                .add(ReBlocks.TITANIUM_BLOCK)
                .add(ReBlocks.URANIUM_BLOCK)
                .add(ReBlocks.DEEPSLATE_RUBY_ORE)
                .add(ReBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ReBlocks.DEEPSLATE_URANIUM_ORE)
                .add(ReBlocks.DEEPSLATE_SALT_ORE)
                .add(ReBlocks.RUBY_ORE)
                .add(ReBlocks.TITANIUM_ORE)
                .add(ReBlocks.URANIUM_ORE)
                .add(ReBlocks.SALT_ORE)
                .add(ReBlocks.TIGERS_EYE_ORE)
                .add(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE)
                .add(ReBlocks.TIGERS_EYE_BLOCK);

        // Needs Pickaxe(Stone_Pickaxe) Tools
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ReBlocks.RUBY_ORE)
                .add(ReBlocks.RUBY_BLOCK)
                .add(ReBlocks.DEEPSLATE_RUBY_ORE)
                .add(ReBlocks.TIGERS_EYE_ORE)
                .add(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE)
                .add(ReBlocks.TIGERS_EYE_BLOCK);

        // Needs Pickaxe(Iron_Pickaxe) Tools
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ReBlocks.TITANIUM_BLOCK)
                .add(ReBlocks.TITANIUM_ORE)
                .add(ReBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ReBlocks.URANIUM_ORE)
                .add(ReBlocks.URANIUM_BLOCK)
                .add(ReBlocks.DEEPSLATE_URANIUM_ORE);

//        Needs Pickaxe(Diamond_Pickaxe) Tools
//        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add();

        // Needs Pickaxe(Stone_Pickaxe) Tools
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_1")))
                .add(ReBlocks.RUBY_ORE)
                .add(ReBlocks.RUBY_BLOCK)
                .add(ReBlocks.DEEPSLATE_RUBY_ORE)
                .add(ReBlocks.TIGERS_EYE_ORE)
                .add(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE)
                .add(ReBlocks.TIGERS_EYE_BLOCK);

        // Needs Pickaxe(Iron_Pickaxe) Tools
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_2")))
                .add(ReBlocks.TITANIUM_BLOCK)
                .add(ReBlocks.TITANIUM_ORE)
                .add(ReBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ReBlocks.URANIUM_ORE)
                .add(ReBlocks.URANIUM_BLOCK)
                .add(ReBlocks.DEEPSLATE_URANIUM_ORE);

//        Needs Pickaxe(Diamond_Pickaxe) Tools
//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_3"))).add();
    }
}

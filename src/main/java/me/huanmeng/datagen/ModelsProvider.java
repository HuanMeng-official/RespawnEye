package me.huanmeng.datagen;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelsProvider extends FabricModelProvider {

    public ModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.DEEPSLATE_SALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.DEEPSLATE_URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.SALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.TIGERS_EYE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.TIGERS_EYE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ReBlocks.DEEPSLATE_TIGERS_EYE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ReTools.ROSE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ReTools.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ReTools.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ReTools.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ReTools.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ReTools.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.ULTIMATE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.ULTIMATE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.ULTIMATE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ReTools.ULTIMATE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ReTools.ULTIMATE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ReTools.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ReTools.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ReTools.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ReItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ReItems.BASILISK_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.CATERKILLER_JAWS, Models.GENERATED);
        itemModelGenerator.register(ReItems.CRYSTAL_SHARD, Models.GENERATED);
        itemModelGenerator.register(ReItems.DEAD_STINK_BUG, Models.GENERATED);
        itemModelGenerator.register(ReItems.EMPEROR_SCORPION_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.GREEN_GOO, Models.GENERATED);
        itemModelGenerator.register(ReItems.JUMPY_BUG_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.KRAKEN_TOOTH, Models.GENERATED);
        itemModelGenerator.register(ReItems.MANTIS_CLAW, Models.GENERATED);
        itemModelGenerator.register(ReItems.MOBZILLA_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.MOLENOID_NOSE, Models.GENERATED);
        itemModelGenerator.register(ReItems.MOTH_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.NIGHTMARE_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.PEACOCK_FEATHER, Models.GENERATED);
        itemModelGenerator.register(ReItems.PINK_TOURMALINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ReItems.QUEEN_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.SEA_MONSTER_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.SEA_VIPER_TONGUE, Models.GENERATED);
        itemModelGenerator.register(ReItems.TIGERS_EYE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ReItems.RAW_TIGERS_EYE, Models.GENERATED);
        itemModelGenerator.register(ReItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ReItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ReItems.TITANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ReItems.TREX_TOOTH, Models.GENERATED);
        itemModelGenerator.register(ReItems.RAW_URANIUM, Models.GENERATED);
        itemModelGenerator.register(ReItems.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ReItems.URANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ReItems.VORTEX_EYE, Models.GENERATED);
        itemModelGenerator.register(ReItems.WATER_DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ReItems.WORM_TOOTH, Models.GENERATED);
        itemModelGenerator.register(ReItems.SALT, Models.GENERATED);
    }
}

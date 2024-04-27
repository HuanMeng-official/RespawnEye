package me.huanmeng.datagen;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.item.ReArmor;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class RecipesProvider extends FabricRecipeProvider {

    public RecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ReItems.RUBY, 0.4f, 200, "ruby");
        offerSmelting(exporter, TIGER_EYE_SMELTABLES, RecipeCategory.MISC, ReItems.TIGERS_EYE_INGOT, 0.4f, 200, "tigers_eye");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ReItems.RUBY, 0.4f, 100, "ruby");
        offerBlasting(exporter, TIGER_EYE_SMELTABLES, RecipeCategory.MISC, ReItems.TIGERS_EYE_INGOT, 0.4f, 100, "tigers_eye");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.RUBY, RecipeCategory.DECORATIONS, ReBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.TIGERS_EYE_INGOT, RecipeCategory.DECORATIONS, ReBlocks.TIGERS_EYE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_AXE, 1).pattern("RR ").pattern("RI ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_PICKAXE, 1).pattern("RRR").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_HOE, 1).pattern("RR ").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_SHOVEL, 1).pattern(" R ").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_SWORD, 1).pattern(" R ").pattern(" R ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.RUBY_HELMET, 1).pattern("RRR").pattern("R R").pattern("   ").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.RUBY_CHESTPLATE, 1).pattern("R R").pattern("RRR").pattern("RRR").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.RUBY_LEGGINGS, 1).pattern("RRR").pattern("R R").pattern("R R").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.RUBY_BOOTS, 1).pattern("R R").pattern("R R").pattern("   ").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.RUBY_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_AXE, 1).pattern("AA ").pattern("AI ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_PICKAXE, 1).pattern("AAA").pattern(" I ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_HOE, 1).pattern("AA ").pattern(" I ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_SHOVEL, 1).pattern(" A ").pattern(" I ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_SWORD, 1).pattern(" A ").pattern(" A ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.AMETHYST_HELMET, 1).pattern("AAA").pattern("A A").pattern("   ").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.AMETHYST_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.AMETHYST_CHESTPLATE, 1).pattern("A A").pattern("AAA").pattern("AAA").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.AMETHYST_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.AMETHYST_LEGGINGS, 1).pattern("AAA").pattern("A A").pattern("A A").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.AMETHYST_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmor.AMETHYST_BOOTS, 1).pattern("A A").pattern("A A").pattern("   ").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmor.AMETHYST_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_AXE, 1).pattern("TUT").pattern(" U ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_PICKAXE, 1).pattern("TT ").pattern("TU ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_HOE, 1).pattern("TT ").pattern(" U ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_SHOVEL, 1).pattern(" T ").pattern(" U ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_SWORD, 1).pattern(" U ").pattern(" T ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_SWORD)));
    }

    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ReBlocks.RUBY_ORE, ReBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> TIGER_EYE_SMELTABLES = List.of(ReBlocks.TIGERS_EYE_ORE, ReBlocks.DEEPSLATE_TIGERS_EYE_ORE, ReItems.RAW_TIGERS_EYE);
}

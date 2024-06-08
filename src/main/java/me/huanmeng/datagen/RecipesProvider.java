package me.huanmeng.datagen;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.item.ReItems;
import me.huanmeng.item.ReTools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends FabricRecipeProvider {

    public RecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ReItems.RUBY, 0.4f, 200, "ruby");
        offerSmelting(exporter, TIGER_EYE_SMELTABLES, RecipeCategory.MISC, ReItems.TIGERS_EYE_INGOT, 0.4f, 200, "tigers_eye");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ReItems.RUBY, 0.4f, 100, "ruby");
        offerBlasting(exporter, TIGER_EYE_SMELTABLES, RecipeCategory.MISC, ReItems.TIGERS_EYE_INGOT, 0.4f, 100, "tigers_eye");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.RUBY, RecipeCategory.DECORATIONS, ReBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.TIGERS_EYE_INGOT, RecipeCategory.DECORATIONS, ReBlocks.TIGERS_EYE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.TITANIUM_INGOT, RecipeCategory.DECORATIONS, ReBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.URANIUM_INGOT, RecipeCategory.DECORATIONS, ReBlocks.URANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_AXE, 1).pattern("RR ").pattern("RI ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_PICKAXE, 1).pattern("RRR").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_HOE, 1).pattern("RR ").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_SHOVEL, 1).pattern(" R ").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_SWORD, 1).pattern(" R ").pattern(" R ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_AXE, 1).pattern("RR ").pattern("RI ").pattern(" I ").input('R', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_PICKAXE, 1).pattern("RRR").pattern(" I ").pattern(" I ").input('R', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_HOE, 1).pattern("RR ").pattern(" I ").pattern(" I ").input('R', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_SHOVEL, 1).pattern(" R ").pattern(" I ").pattern(" I ").input('R', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_SWORD, 1).pattern(" R ").pattern(" R ").pattern(" I ").input('R', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.TITANIUM_INGOT, 1).pattern("###").pattern("###").pattern("###").input('#', ReItems.TITANIUM_NUGGET).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(MODID + "titanium_ingot_form_titanium_nugget"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.TITANIUM_NUGGET, 9).pattern("#").input('#', ReItems.TITANIUM_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(MODID + "titanium_nugget_form_titanium_ingot"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.URANIUM_INGOT, 1).pattern("###").pattern("###").pattern("###").input('#', ReItems.URANIUM_NUGGET).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.URANIUM_NUGGET)).offerTo(exporter, new Identifier(MODID + "uranium_ingot_form_uranium_nugget"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.URANIUM_NUGGET, 9).pattern("#").input('#', ReItems.URANIUM_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.URANIUM_NUGGET)).offerTo(exporter, new Identifier(MODID + "uranium_nugget_form_uranium_ingot"));
    }

    private static final String MODID = "respawneye:";
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ReBlocks.RUBY_ORE, ReBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> TIGER_EYE_SMELTABLES = List.of(ReBlocks.TIGERS_EYE_ORE, ReBlocks.DEEPSLATE_TIGERS_EYE_ORE, ReItems.RAW_TIGERS_EYE);
}

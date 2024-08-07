package me.huanmeng.datagen;

import me.huanmeng.block.ReBlocks;
import me.huanmeng.item.ReArmors;
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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.TITANIUM_INGOT, RecipeCategory.DECORATIONS, ReBlocks.TITANIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ReItems.URANIUM_INGOT, RecipeCategory.DECORATIONS, ReBlocks.URANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_AXE, 1).pattern("RR ").pattern("RI ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_PICKAXE, 1).pattern("RRR").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_HOE, 1).pattern("RR ").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_SHOVEL, 1).pattern(" R ").pattern(" I ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.RUBY_SWORD, 1).pattern(" R ").pattern(" R ").pattern(" I ").input('R', ReItems.RUBY).input('I', Items.STICK).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReTools.RUBY_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.RUBY_HELMET, 1).pattern("RRR").pattern("R R").pattern("   ").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.RUBY_CHESTPLATE, 1).pattern("R R").pattern("RRR").pattern("RRR").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.RUBY_LEGGINGS, 1).pattern("RRR").pattern("R R").pattern("R R").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.RUBY_BOOTS, 1).pattern("R R").pattern("R R").pattern("   ").input('R', ReItems.RUBY).criterion(hasItem(ReItems.RUBY), conditionsFromItem(ReItems.RUBY)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.RUBY_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_AXE, 1).pattern("AA ").pattern("AI ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_PICKAXE, 1).pattern("AAA").pattern(" I ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_HOE, 1).pattern("AA ").pattern(" I ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_SHOVEL, 1).pattern(" A ").pattern(" I ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.AMETHYST_SWORD, 1).pattern(" A ").pattern(" A ").pattern(" I ").input('A', Items.AMETHYST_SHARD).input('I', Items.STICK).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.AMETHYST_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.AMETHYST_HELMET, 1).pattern("AAA").pattern("A A").pattern("   ").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.AMETHYST_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.AMETHYST_CHESTPLATE, 1).pattern("A A").pattern("AAA").pattern("AAA").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.AMETHYST_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.AMETHYST_LEGGINGS, 1).pattern("AAA").pattern("A A").pattern("A A").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.AMETHYST_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.AMETHYST_BOOTS, 1).pattern("A A").pattern("A A").pattern("   ").input('A', Items.AMETHYST_SHARD).criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.AMETHYST_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_PICKAXE, 1).pattern("TUT").pattern(" U ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_AXE, 1).pattern("TT ").pattern("TU ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_HOE, 1).pattern("TT ").pattern(" U ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_SHOVEL, 1).pattern(" T ").pattern(" U ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_SWORD, 1).pattern(" U ").pattern(" T ").pattern(" I ").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ULTIMATE_BOW, 1).pattern(" TS").pattern("I S").pattern(" US").input('T', ReItems.TITANIUM_INGOT).input('S', Items.STRING).input('U', ReItems.URANIUM_INGOT).input('I', Items.IRON_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ULTIMATE_BOW)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.ULTIMATE_HELMET, 1).pattern("TIT").pattern("U U").input('T', ReItems.TITANIUM_INGOT).input('I', Items.IRON_INGOT).input('U', ReItems.URANIUM_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.ULTIMATE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.ULTIMATE_CHESTPLATE, 1).pattern("I I").pattern("TTT").pattern("UUU").input('I', Items.IRON_INGOT).input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.ULTIMATE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.ULTIMATE_LEGGINGS, 1).pattern("III").pattern("T T").pattern("U U").input('I', Items.IRON_INGOT).input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.ULTIMATE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.ULTIMATE_BOOTS, 1).pattern("T T").pattern("U U").input('T', ReItems.TITANIUM_INGOT).input('U', ReItems.URANIUM_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.ULTIMATE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.TITANIUM_INGOT, 1).pattern("###").pattern("###").pattern("###").input('#', ReItems.TITANIUM_NUGGET).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(MODID + "titanium_ingot_form_titanium_nugget"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.TITANIUM_NUGGET, 9).pattern("#").input('#', ReItems.TITANIUM_INGOT).criterion(hasItem(ReItems.TITANIUM_NUGGET), conditionsFromItem(ReItems.TITANIUM_INGOT)).offerTo(exporter, new Identifier(MODID + "titanium_nugget_form_titanium_ingot"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.URANIUM_INGOT, 1).pattern("###").pattern("###").pattern("###").input('#', ReItems.URANIUM_NUGGET).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.URANIUM_NUGGET)).offerTo(exporter, new Identifier(MODID + "uranium_ingot_form_uranium_nugget"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReItems.URANIUM_NUGGET, 9).pattern("#").input('#', ReItems.URANIUM_INGOT).criterion(hasItem(ReItems.URANIUM_INGOT), conditionsFromItem(ReItems.URANIUM_NUGGET)).offerTo(exporter, new Identifier(MODID + "uranium_nugget_form_uranium_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.EMERALD_HELMET, 1).pattern("###").pattern("# #").input('#', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.EMERALD_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.EMERALD_CHESTPLATE, 1).pattern("# #").pattern("###").pattern("###").input('#', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.EMERALD_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.EMERALD_LEGGINGS, 1).pattern("###").pattern("# #").pattern("# #").input('#', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.EMERALD_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReArmors.EMERALD_BOOTS, 1).pattern("# #").pattern("# #").input('#', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReArmors.EMERALD_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.EMERALD_AXE, 1).pattern("RR ").pattern("RI ").pattern(" I ").input('R', Items.EMERALD).input('I', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.EMERALD_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.EMERALD_PICKAXE, 1).pattern("RRR").pattern(" I ").pattern(" I ").input('R', Items.EMERALD).input('I', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.EMERALD_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.EMERALD_HOE, 1).pattern("RR ").pattern(" I ").pattern(" I ").input('R', Items.EMERALD).input('I', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.EMERALD_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.EMERALD_SHOVEL, 1).pattern(" R ").pattern(" I ").pattern(" I ").input('R', Items.EMERALD).input('I', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.EMERALD_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.EMERALD_SWORD, 1).pattern(" R ").pattern(" R ").pattern(" I ").input('R', Items.EMERALD).input('I', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(ReTools.EMERALD_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ReTools.ROSE_SWORD, 1).pattern(" R ").pattern(" R ").pattern(" I ").input('R', Items.POPPY).input('I', Items.STICK).criterion(hasItem(Items.POPPY), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(ReTools.ROSE_SWORD)));
    }

    private static final String MODID = "respawneye:";
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ReBlocks.RUBY_ORE, ReBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> TIGER_EYE_SMELTABLES = List.of(ReBlocks.TIGERS_EYE_ORE, ReBlocks.DEEPSLATE_TIGERS_EYE_ORE, ReItems.RAW_TIGERS_EYE);
}

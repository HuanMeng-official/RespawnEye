package me.huanmeng.respawneye.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ReRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ReRecipesProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
    }
}

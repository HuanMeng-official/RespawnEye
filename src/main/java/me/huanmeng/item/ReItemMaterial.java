package me.huanmeng.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum ReItemMaterial implements ToolMaterial {
    RUBY(BlockTags.INCORRECT_FOR_IRON_TOOL, 600, 7.0F, 2.0F, 12, () -> Ingredient.ofItems(ReItems.RUBY)),
    AMETHYST(BlockTags.INCORRECT_FOR_IRON_TOOL, 450, 6.5F, 2.0F, 9, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    TITANIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 800, 8.0F, 3.0F, 16, () -> Ingredient.ofItems(ReItems.TITANIUM_INGOT)),
    EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 650, 7.5F, 2.0F, 22, () -> Ingredient.ofItems(Items.EMERALD));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ReItemMaterial(final TagKey inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
package me.huanmeng.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ItemMaterial implements ToolMaterial {

    RUBY(3, 1500, 7.0F, 18.0F, 13, () -> Ingredient.ofItems(ReItems.RUBY)),
    AMETHYST(3, 2000, 6.0F, 13.0F, 12, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    TITANIUM(4, 3000, 7.0F, 38.0F, 14, () -> Ingredient.ofItems(ReItems.TITANIUM_INGOT)),
    EMERALD(3, 1300, 5.0F, 8.0F, 40, () -> Ingredient.ofItems(Items.EMERALD));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ItemMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
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
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ArmorsMaterial implements ArmorMaterial {

    RUBY("ruby", 38, new int[]{4,9,8,4}, 23, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0f, () -> Ingredient.ofItems(ReItems.RUBY)),
    AMETHYST("amethyst", 35, new int[]{4,8,7,3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f, 0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD("emerald", 37, new int[]{5,8,6,4}, 34, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0f, () -> Ingredient.ofItems(Items.EMERALD));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredientSupplier;
    private static final int[] BASE_DURABILITY = {11,16,15,13};

    ArmorsMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()]*this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return RespawnEye.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
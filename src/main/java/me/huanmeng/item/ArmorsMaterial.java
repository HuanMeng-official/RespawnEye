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

    RUBY("ruby", 16, new int[]{3,6,5,2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f, 0f, () -> Ingredient.ofItems(ReItems.RUBY)),
    AMETHYST("amethyst", 13, new int[]{2,5,4,1}, 7, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5f, 0f, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    EMERALD("emerald", 18, new int[]{3,7,6,3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f, 0f, () -> Ingredient.ofItems(Items.EMERALD)),
    ULTIMATE("ultimate", 21, new int[]{4,8,7,4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f, 0.2f, () -> Ingredient.ofItems(ReItems.TITANIUM_INGOT)),
    MOBZILLA("mobzilla", 100, new int[]{5,7,4,3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.1f, 0.3f, () -> Ingredient.ofItems(ReItems.MOBZILLA_SCALE));

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
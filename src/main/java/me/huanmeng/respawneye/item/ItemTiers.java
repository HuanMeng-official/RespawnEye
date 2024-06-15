package me.huanmeng.respawneye.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ItemTiers implements Tier {
    RUBY(2, 600, 7.0F, 2.0F, 12, () -> Ingredient.of(ReItems.RUBY.get())),
    AMETHYST(2, 450, 6.5F, 2.0F, 9, () -> Ingredient.of(Items.AMETHYST_SHARD)),
    TITANIUM(4, 800, 8.0F, 3.0F, 16, () -> Ingredient.of(ReItems.TITANIUM_INGOT)),
    EMERALD(3, 650, 7.5F, 2.0F, 22, () -> Ingredient.of(Items.EMERALD));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ItemTiers(int Level, int Uses, float Speed, float Damage, int EnchantmentValue, Supplier<Ingredient> RepairIngredient) {
        this.level = Level;
        this.uses = Uses;
        this.speed = Speed;
        this.damage = Damage;
        this.enchantmentValue = EnchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(RepairIngredient);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}


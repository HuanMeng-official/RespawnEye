package me.huanmeng.respawneye.item;

import com.mojang.serialization.Codec;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ArmorTiers implements StringRepresentable, ArmorMaterial {
    RUBY("ruby", 16, Util.make(new EnumMap<>(ArmorItem.Type.class), ruby_object -> {
        ruby_object.put(ArmorItem.Type.BOOTS, 2);
        ruby_object.put(ArmorItem.Type.LEGGINGS, 5);
        ruby_object.put(ArmorItem.Type.CHESTPLATE, 6);
        ruby_object.put(ArmorItem.Type.HELMET, 3);
    }), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5f, 0.0f, () -> Ingredient.of(ReItems.RUBY));

    public static final Codec<ArmorTiers> CODEC = StringRepresentable.fromEnum(ArmorTiers::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), object -> {
        object.put(ArmorItem.Type.BOOTS, 13);
        object.put(ArmorItem.Type.LEGGINGS, 15);
        object.put(ArmorItem.Type.CHESTPLATE, 16);
        object.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ArmorTiers(
            String Name,
            int DurabilityMultiplier,
            EnumMap<ArmorItem.Type, Integer> ProtectionFunctionForType,
            int EnchantmentValue,
            SoundEvent Sound,
            float Toughness,
            float KnockbackResistance,
            Supplier<Ingredient> RepairIngredient
    ) {
        this.name = Name;
        this.durabilityMultiplier = DurabilityMultiplier;
        this.protectionFunctionForType = ProtectionFunctionForType;
        this.enchantmentValue = EnchantmentValue;
        this.sound = Sound;
        this.toughness = Toughness;
        this.knockbackResistance = KnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(RepairIngredient);
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type Type) {
        return HEALTH_FUNCTION_FOR_TYPE.get(Type) * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type Type) {
        return this.protectionFunctionForType.get(Type);
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}

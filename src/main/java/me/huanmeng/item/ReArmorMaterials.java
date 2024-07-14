package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ReArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> RUBY;
    public static final RegistryEntry<ArmorMaterial> AMETHYST;
    public static final RegistryEntry<ArmorMaterial> EMERALD;

    public ReArmorMaterials() {
    }

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(new Identifier(RespawnEye.MODID + ":" + id)));
        return register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap(ArmorItem.Type.class);
        ArmorItem.Type[] var9 = ArmorItem.Type.values();
        int var10 = var9.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            ArmorItem.Type type = var9[var11];
            enumMap.put(type, (Integer)defense.get(type));
        }

        return Registry.registerReference(Registries.ARMOR_MATERIAL, new Identifier(id), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }

    static {
        RUBY = register("ruby", (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 2);
            map.put(ArmorItem.Type.LEGGINGS, 5);
            map.put(ArmorItem.Type.CHESTPLATE, 6);
            map.put(ArmorItem.Type.HELMET, 3);
        }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5F, 0.0F, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{ReItems.RUBY});
        });
        AMETHYST = register("amethyst", (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 7, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.5F, 0.0F, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.AMETHYST_SHARD});
        });
        EMERALD = register("emerald", (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 3);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 7);
            map.put(ArmorItem.Type.HELMET, 3);
        }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F, 0.0F, () -> {
            return Ingredient.ofItems(new ItemConvertible[]{Items.EMERALD});
        });
    }
}

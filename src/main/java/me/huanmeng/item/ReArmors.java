package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReArmors {
    public static final Item RUBY_HELMET;
    public static final Item RUBY_CHESTPLATE;
    public static final Item RUBY_LEGGINGS;
    public static final Item RUBY_BOOTS;
    public static final Item AMETHYST_HELMET;
    public static final Item AMETHYST_CHESTPLATE;
    public static final Item AMETHYST_LEGGINGS;
    public static final Item AMETHYST_BOOTS;
    public static final Item EMERALD_HELMET;
    public static final Item EMERALD_CHESTPLATE;
    public static final Item EMERALD_LEGGINGS;
    public static final Item EMERALD_BOOTS;

    static {
        RUBY_HELMET = registerArmors("ruby_helmet", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(16))));
        RUBY_CHESTPLATE = registerArmors("ruby_chestplate", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(16))));
        RUBY_LEGGINGS = registerArmors("ruby_leggings", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(16))));
        RUBY_BOOTS = registerArmors("ruby_boots", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(16))));

        AMETHYST_HELMET = registerArmors("amethyst_helmet", new ArmorItem(ReArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(13))));
        AMETHYST_CHESTPLATE = registerArmors("amethyst_chestplate", new ArmorItem(ReArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(13))));
        AMETHYST_LEGGINGS = registerArmors("amethyst_leggings", new ArmorItem(ReArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(13))));
        AMETHYST_BOOTS = registerArmors("amethyst_boots", new ArmorItem(ReArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(13))));

        EMERALD_HELMET = registerArmors("emerald_helmet", new ArmorItem(ReArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));
        EMERALD_CHESTPLATE = registerArmors("emerald_chestplate", new ArmorItem(ReArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));
        EMERALD_LEGGINGS = registerArmors("emerald_leggings", new ArmorItem(ReArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));
        EMERALD_BOOTS = registerArmors("emerald_boots", new ArmorItem(ReArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));
    }

    public static Item registerArmors(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RespawnEye.MODID, name), item);
    }

    public static void registryArmors() {
        RespawnEye.LOGGER.info("Registering Armors for " + RespawnEye.MODID);
    }
}

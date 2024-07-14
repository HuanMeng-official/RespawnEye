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

    static {
        RUBY_HELMET = registerArmors("ruby_helmet", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(16))));
        RUBY_CHESTPLATE = registerArmors("ruby_chestplate", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(16))));
        RUBY_LEGGINGS = registerArmors("ruby_leggings", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(16))));
        RUBY_BOOTS = registerArmors("ruby_boots", new ArmorItem(ReArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(16))));
    }

    public static Item registerArmors(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryArmors() {
        RespawnEye.LOGGER.info("Registering Armors for " + RespawnEye.MODID);
    }
}

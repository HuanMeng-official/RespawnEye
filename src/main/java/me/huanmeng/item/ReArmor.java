package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReArmor {

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
        RUBY_HELMET = registerArmors("ruby_helmet", new ArmorItem(ArmorsMaterial.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
        RUBY_CHESTPLATE = registerArmors("ruby_chestplate", new ArmorItem(ArmorsMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        RUBY_LEGGINGS = registerArmors("ruby_leggings", new ArmorItem(ArmorsMaterial.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        RUBY_BOOTS = registerArmors("ruby_boots", new ArmorItem(ArmorsMaterial.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

        AMETHYST_HELMET = registerArmors("amethyst_helmet", new ArmorItem(ArmorsMaterial.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
        AMETHYST_CHESTPLATE = registerArmors("amethyst_chestplate", new ArmorItem(ArmorsMaterial.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        AMETHYST_LEGGINGS = registerArmors("amethyst_leggings", new ArmorItem(ArmorsMaterial.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        AMETHYST_BOOTS = registerArmors("amethyst_boots", new ArmorItem(ArmorsMaterial.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

        EMERALD_HELMET = registerArmors("emerald_helmet", new ArmorItem(ArmorsMaterial.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
        EMERALD_CHESTPLATE = registerArmors("emerald_chestplate", new ArmorItem(ArmorsMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        EMERALD_LEGGINGS = registerArmors("emerald_leggings", new ArmorItem(ArmorsMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        EMERALD_BOOTS = registerArmors("emerald_boots", new ArmorItem(ArmorsMaterial.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    }

    public static Item registerArmors(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryArmors() {
        RespawnEye.LOGGER.info("Registering Armors for " + RespawnEye.MODID);
    }
}

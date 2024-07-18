package me.huanmeng.respawneye.item;

import me.huanmeng.respawneye.RespawnEye;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ReArmors {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RespawnEye.MODID);

    public static final DeferredItem<Item> RUBY_HELMET;
    public static final DeferredItem<Item> RUBY_CHESTPLATE;
    public static final DeferredItem<Item> RUBY_LEGGINGS;
    public static final DeferredItem<Item> RUBY_BOOTS;
    public static final DeferredItem<Item> AMETHYST_HELMET;
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE;
    public static final DeferredItem<Item> AMETHYST_LEGGINGS;
    public static final DeferredItem<Item> AMETHYST_BOOTS;
    public static final DeferredItem<Item> EMERALD_HELMET;
    public static final DeferredItem<Item> EMERALD_CHESTPLATE;
    public static final DeferredItem<Item> EMERALD_LEGGINGS;
    public static final DeferredItem<Item> EMERALD_BOOTS;

    static {
        RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
        RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));
        AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ArmorTiers.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
        AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ArmorTiers.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ArmorTiers.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ArmorTiers.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));
        EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ArmorTiers.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
        EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ArmorTiers.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ArmorTiers.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ArmorTiers.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));
    }

    public static void registryItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Armors for RespawnEye");
    }
}

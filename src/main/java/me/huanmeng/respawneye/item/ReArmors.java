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

    static {
        RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
        RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorTiers.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));
    }

    public static void registryItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Armors for RespawnEye");
    }
}

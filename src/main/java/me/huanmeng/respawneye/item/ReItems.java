package me.huanmeng.respawneye.item;

import me.huanmeng.respawneye.RespawnEye;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ReItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RespawnEye.MODID);

    public static final DeferredItem<Item> RUBY;
    public static final DeferredItem<Item> SALT;
    static {
        RUBY = ITEMS.registerSimpleItem("ruby", new Item.Properties());
        SALT = ITEMS.registerSimpleItem("salt", new Item.Properties());
    }

    public static void registryItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Items for RespawnEye");
    }
}

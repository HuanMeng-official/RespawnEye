package me.huanmeng.respawneye.item;

import me.huanmeng.respawneye.RespawnEye;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ReTools {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RespawnEye.MODID);

    public static final DeferredItem<Item> RUBY_AXE;
    public static final DeferredItem<Item> RUBY_PICKAXE;
    public static final DeferredItem<Item> RUBY_SHOVEL;
    public static final DeferredItem<Item> RUBY_HOE;
    public static final DeferredItem<Item> RUBY_SWORD;

    static {
        RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ItemTiers.RUBY, 7, -3.0F, new Item.Properties()));
        RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ItemTiers.RUBY, 2, -2.8F, new Item.Properties()));
        RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ItemTiers.RUBY, 2.5F, -3.0F, new Item.Properties()));
        RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ItemTiers.RUBY, -2, 0.0F, new Item.Properties()));
        RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ItemTiers.RUBY, 4, -2.4F, new Item.Properties()));
    }

    public static void registryTools(IEventBus eventBus) {
        ITEMS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Tools for RespawnEye");
    }
}

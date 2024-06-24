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
    public static final DeferredItem<Item> AMETHYST_AXE;
    public static final DeferredItem<Item> AMETHYST_PICKAXE;
    public static final DeferredItem<Item> AMETHYST_SHOVEL;
    public static final DeferredItem<Item> AMETHYST_HOE;
    public static final DeferredItem<Item> AMETHYST_SWORD;
    public static final DeferredItem<Item> ULTIMATE_AXE;
    public static final DeferredItem<Item> ULTIMATE_PICKAXE;
    public static final DeferredItem<Item> ULTIMATE_SHOVEL;
    public static final DeferredItem<Item> ULTIMATE_HOE;
    public static final DeferredItem<Item> ULTIMATE_SWORD;

    static {
        RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ItemTiers.RUBY, 7, -3.0F, new Item.Properties()));
        RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ItemTiers.RUBY, 2, -2.8F, new Item.Properties()));
        RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ItemTiers.RUBY, 2.5F, -3.0F, new Item.Properties()));
        RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ItemTiers.RUBY, -2, 0.0F, new Item.Properties()));
        RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ItemTiers.RUBY, 4, -2.4F, new Item.Properties()));

        AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ItemTiers.AMETHYST, 6, -3.0F, new Item.Properties()));
        AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ItemTiers.AMETHYST, 1, -2.8F, new Item.Properties()));
        AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ItemTiers.AMETHYST, 1.5F, -3.0F, new Item.Properties()));
        AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ItemTiers.AMETHYST, -2, 0.0F, new Item.Properties()));
        AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ItemTiers.AMETHYST, 3, -2.4F, new Item.Properties()));

        ULTIMATE_AXE = ITEMS.register("ultimate_axe", () -> new AxeItem(ItemTiers.TITANIUM, 9, -3.0F, new Item.Properties()));
        ULTIMATE_PICKAXE = ITEMS.register("ultimate_pickaxe", () -> new PickaxeItem(ItemTiers.TITANIUM, 4, -2.8F, new Item.Properties()));
        ULTIMATE_SHOVEL = ITEMS.register("ultimate_shovel", () -> new ShovelItem(ItemTiers.TITANIUM, 3.5F, -3.0F, new Item.Properties()));
        ULTIMATE_HOE = ITEMS.register("ultimate_hoe", () -> new HoeItem(ItemTiers.TITANIUM, -3, 0.0F, new Item.Properties()));
        ULTIMATE_SWORD = ITEMS.register("ultimate_sword", () -> new SwordItem(ItemTiers.TITANIUM, 6, -2.4F, new Item.Properties()));
    }

    public static void registryTools(IEventBus eventBus) {
        ITEMS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Tools for RespawnEye");
    }
}

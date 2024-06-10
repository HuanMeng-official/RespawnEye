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
    public static final DeferredItem<Item> BASILISK_SCALE;
    public static final DeferredItem<Item> CATERKILLER_JAWS;
    public static final DeferredItem<Item> CRYSTAL_SHARD;
    public static final DeferredItem<Item> DEAD_STINK_BUG;
    public static final DeferredItem<Item> EMPEROR_SCORPION_SCALE;
    public static final DeferredItem<Item> GREEN_GOO;
    public static final DeferredItem<Item> JUMPY_BUG_SCALE;
    public static final DeferredItem<Item> KRAKEN_TOOTH;
    public static final DeferredItem<Item> MANTIS_CLAW;
    public static final DeferredItem<Item> MOBZILLA_SCALE;
    public static final DeferredItem<Item> MOLENOID_NOSE;
    public static final DeferredItem<Item> MOTH_SCALE;
    public static final DeferredItem<Item> NIGHTMARE_SCALE;
    public static final DeferredItem<Item> PEACOCK_FEATHER;
    public static final DeferredItem<Item> PINK_TOURMALINE_INGOT;
    public static final DeferredItem<Item> QUEEN_SCALE;
    public static final DeferredItem<Item> SEA_MONSTER_SCALE;
    public static final DeferredItem<Item> SEA_VIPER_TONGUE;
    public static final DeferredItem<Item> TIGERS_EYE_INGOT;
    public static final DeferredItem<Item> RAW_TIGERS_EYE;
    public static final DeferredItem<Item> RAW_TITANIUM;
    public static final DeferredItem<Item> TITANIUM_INGOT;
    public static final DeferredItem<Item> TITANIUM_NUGGET;
    public static final DeferredItem<Item> TREX_TOOTH;
    public static final DeferredItem<Item> RAW_URANIUM;
    public static final DeferredItem<Item> URANIUM_INGOT;
    public static final DeferredItem<Item> URANIUM_NUGGET;
    public static final DeferredItem<Item> VORTEX_EYE;
    public static final DeferredItem<Item> WATER_DRAGON_SCALE;
    public static final DeferredItem<Item> WORM_TOOTH;

    static {
        RUBY = ITEMS.registerSimpleItem("ruby", new Item.Properties());
        SALT = ITEMS.registerSimpleItem("salt", new Item.Properties());
        BASILISK_SCALE = ITEMS.registerSimpleItem("basilisk_scale", new Item.Properties());
        CATERKILLER_JAWS = ITEMS.registerSimpleItem("caterkiller_jaws", new Item.Properties());
        CRYSTAL_SHARD = ITEMS.registerSimpleItem("crystal_shard", new Item.Properties());
        DEAD_STINK_BUG = ITEMS.registerSimpleItem("dead_stink_bug", new Item.Properties());
        EMPEROR_SCORPION_SCALE = ITEMS.registerSimpleItem("emperor_scorpion_scale", new Item.Properties());
        GREEN_GOO = ITEMS.registerSimpleItem("green_goo", new Item.Properties());
        JUMPY_BUG_SCALE  = ITEMS.registerSimpleItem("jumpy_bug_scale", new Item.Properties());
        KRAKEN_TOOTH = ITEMS.registerSimpleItem("kraken_tooth", new Item.Properties());
        MANTIS_CLAW = ITEMS.registerSimpleItem("mantis_claw", new Item.Properties());
        MOBZILLA_SCALE  = ITEMS.registerSimpleItem("mobzilla_scale", new Item.Properties());
        MOLENOID_NOSE = ITEMS.registerSimpleItem("molenoid_nose", new Item.Properties());
        MOTH_SCALE = ITEMS.registerSimpleItem("moth_scale", new Item.Properties());
        NIGHTMARE_SCALE  = ITEMS.registerSimpleItem("nightmare_scale", new Item.Properties());
        PEACOCK_FEATHER = ITEMS.registerSimpleItem("peacock_feather", new Item.Properties());
        PINK_TOURMALINE_INGOT = ITEMS.registerSimpleItem("pink_tourmaline_ingot", new Item.Properties());
        QUEEN_SCALE = ITEMS.registerSimpleItem("queen_scale", new Item.Properties());
        SEA_MONSTER_SCALE  = ITEMS.registerSimpleItem("sea_monster_scale", new Item.Properties());
        SEA_VIPER_TONGUE = ITEMS.registerSimpleItem("sea_viper_tongue", new Item.Properties());
        TIGERS_EYE_INGOT = ITEMS.registerSimpleItem("tigers_eye_ingot", new Item.Properties());
        RAW_TIGERS_EYE  = ITEMS.registerSimpleItem("raw_tigers_eye", new Item.Properties());
        RAW_TITANIUM = ITEMS.registerSimpleItem("raw_titanium", new Item.Properties());
        TITANIUM_INGOT  = ITEMS.registerSimpleItem("titanium_ingot", new Item.Properties());
        TITANIUM_NUGGET  = ITEMS.registerSimpleItem("titanium_nugget", new Item.Properties());
        TREX_TOOTH = ITEMS.registerSimpleItem("trex_tooth", new Item.Properties());
        RAW_URANIUM = ITEMS.registerSimpleItem("raw_uranium", new Item.Properties());
        URANIUM_INGOT  = ITEMS.registerSimpleItem("uranium_ingot", new Item.Properties());
        URANIUM_NUGGET  = ITEMS.registerSimpleItem("uranium_nugget", new Item.Properties());
        VORTEX_EYE  = ITEMS.registerSimpleItem("vortex_eye", new Item.Properties());
        WATER_DRAGON_SCALE  = ITEMS.registerSimpleItem("water_dragon_scale", new Item.Properties());
        WORM_TOOTH = ITEMS.registerSimpleItem("worm_tooth", new Item.Properties());
    }

    public static void registryItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Items for RespawnEye");
    }
}

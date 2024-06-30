package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReItems {

    public static final Item RUBY;
    public static final Item SALT;
    public static final Item BASILISK_SCALE;
    public static final Item CATERKILLER_JAWS;
    public static final Item CRYSTAL_SHARD;
    public static final Item DEAD_STINK_BUG;
    public static final Item EMPEROR_SCORPION_SCALE;
    public static final Item GREEN_GOO;
    public static final Item JUMPY_BUG_SCALE;
    public static final Item KRAKEN_TOOTH;
    public static final Item MANTIS_CLAW;
    public static final Item MOBZILLA_SCALE;
    public static final Item MOLENOID_NOSE;
    public static final Item MOTH_SCALE;
    public static final Item NIGHTMARE_SCALE;
    public static final Item PEACOCK_FEATHER;
    public static final Item PINK_TOURMALINE_INGOT;
    public static final Item QUEEN_SCALE;
    public static final Item SEA_MONSTER_SCALE;
    public static final Item SEA_VIPER_TONGUE;
    public static final Item TIGERS_EYE_INGOT;
    public static final Item RAW_TIGERS_EYE;
    public static final Item RAW_TITANIUM;
    public static final Item TITANIUM_INGOT;
    public static final Item TITANIUM_NUGGET;
    public static final Item TREX_TOOTH;
    public static final Item RAW_URANIUM;
    public static final Item URANIUM_INGOT;
    public static final Item URANIUM_NUGGET;
    public static final Item VORTEX_EYE;
    public static final Item WATER_DRAGON_SCALE;
    public static final Item WORM_TOOTH;

    static {
        RUBY = registerItems("ruby", new Item(new Item.Settings()));
        SALT  = registerItems("salt", new Item(new Item.Settings()));
        BASILISK_SCALE = registerItems("basilisk_scale", new Item(new Item.Settings()));
        CATERKILLER_JAWS = registerItems("caterkiller_jaws", new Item(new Item.Settings()));
        CRYSTAL_SHARD = registerItems("crystal_shard", new Item(new Item.Settings()));
        DEAD_STINK_BUG = registerItems("dead_stink_bug", new Item(new Item.Settings()));
        EMPEROR_SCORPION_SCALE = registerItems("emperor_scorpion_scale", new Item(new Item.Settings()));
        GREEN_GOO = registerItems("green_goo", new Item(new Item.Settings()));
        JUMPY_BUG_SCALE = registerItems("jumpy_bug_scale", new Item(new Item.Settings()));
        KRAKEN_TOOTH = registerItems("kraken_tooth", new Item(new Item.Settings()));
        MANTIS_CLAW = registerItems("mantis_claw", new Item(new Item.Settings()));
        MOBZILLA_SCALE = registerItems("mobzilla_scale", new Item(new Item.Settings()));
        MOLENOID_NOSE = registerItems("molenoid_nose", new Item(new Item.Settings()));
        MOTH_SCALE = registerItems("moth_scale", new Item(new Item.Settings()));
        NIGHTMARE_SCALE = registerItems("nightmare_scale", new Item(new Item.Settings()));
        PEACOCK_FEATHER = registerItems("peacock_feather", new Item(new Item.Settings()));
        PINK_TOURMALINE_INGOT = registerItems("pink_tourmaline_ingot", new Item(new Item.Settings()));
        QUEEN_SCALE = registerItems("queen_scale", new Item(new Item.Settings()));
        SEA_MONSTER_SCALE = registerItems("sea_monster_scale", new Item(new Item.Settings()));
        SEA_VIPER_TONGUE = registerItems("sea_viper_tongue", new Item(new Item.Settings()));
        TIGERS_EYE_INGOT = registerItems("tigers_eye_ingot", new Item(new Item.Settings()));
        RAW_TIGERS_EYE  = registerItems("raw_tigers_eye", new Item(new Item.Settings()));
        RAW_TITANIUM = registerItems("raw_titanium", new Item(new Item.Settings()));
        TITANIUM_INGOT = registerItems("titanium_ingot", new Item(new Item.Settings()));
        TITANIUM_NUGGET = registerItems("titanium_nugget", new Item(new Item.Settings()));
        TREX_TOOTH = registerItems("trex_tooth", new Item(new Item.Settings()));
        RAW_URANIUM = registerItems("raw_uranium", new Item(new Item.Settings()));
        URANIUM_INGOT = registerItems("uranium_ingot", new Item(new Item.Settings()));
        URANIUM_NUGGET = registerItems("uranium_nugget", new Item(new Item.Settings()));
        VORTEX_EYE = registerItems("vortex_eye", new Item(new Item.Settings()));
        WATER_DRAGON_SCALE = registerItems("water_dragon_scale", new Item(new Item.Settings()));
        WORM_TOOTH = registerItems("worm_tooth", new Item(new Item.Settings()));
    }

    public static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RespawnEye.MODID, name), item);
    }

    public static void registryItems() {
        RespawnEye.LOGGER.info("Registering Items for " + RespawnEye.MODID);
    }
}

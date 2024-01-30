package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReItems {

    public static final Item RUBY = registerItems("ruby", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItems("salt", new Item(new FabricItemSettings()));
    public static final Item BASILISK_SCALE = registerItems("basilisk_scale", new Item(new FabricItemSettings()));
    public static final Item CATERKILLER_JAWS = registerItems("caterkiller_jaws", new Item(new FabricItemSettings()));
    public static final Item CRYSTAL_SHARD = registerItems("crystal_shard", new Item(new FabricItemSettings()));
    public static final Item DEAD_STINK_BUG = registerItems("dead_stink_bug", new Item(new FabricItemSettings()));
    public static final Item EMPEROR_SCORPION_SCALE = registerItems("emperor_scorpion_scale", new Item(new FabricItemSettings()));
    public static final Item GREEN_GOO = registerItems("green_goo", new Item(new FabricItemSettings()));
    public static final Item JUMPY_BUG_SCALE = registerItems("jumpy_bug_scale", new Item(new FabricItemSettings()));
    public static final Item KRAKEN_TOOTH = registerItems("kraken_tooth", new Item(new FabricItemSettings()));
    public static final Item MANTIS_CLAW = registerItems("mantis_claw", new Item(new FabricItemSettings()));
    public static final Item MOBZILLA_SCALE = registerItems("mobzilla_scale", new Item(new FabricItemSettings()));
    public static final Item MOLENOID_NOSE = registerItems("molenoid_nose", new Item(new FabricItemSettings()));
    public static final Item MOTH_SCALE = registerItems("moth_scale", new Item(new FabricItemSettings()));
    public static final Item NIGHTMARE_SCALE = registerItems("nightmare_scale", new Item(new FabricItemSettings()));
    public static final Item PEACOCK_FEATHER = registerItems("peacock_feather", new Item(new FabricItemSettings()));
    public static final Item PINK_TOURMALINE_INGOT = registerItems("pink_tourmaline_ingot", new Item(new FabricItemSettings()));
    public static final Item QUEEN_SCALE = registerItems("queen_scale", new Item(new FabricItemSettings()));
    public static final Item SEA_MONSTER_SCALE = registerItems("sea_monster_scale", new Item(new FabricItemSettings()));
    public static final Item SEA_VIPER_TONGUE = registerItems("sea_viper_tongue", new Item(new FabricItemSettings()));
    public static final Item TIGERS_EYE_INGOT = registerItems("tigers_eye_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TITANIUM = registerItems("raw_titanium", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItems("titanium_ingot", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_NUGGET = registerItems("titanium_nugget", new Item(new FabricItemSettings()));
    public static final Item TREX_TOOTH = registerItems("trex_tooth", new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItems("raw_uranium", new Item(new FabricItemSettings()));
    public static final Item URANIUM_INGOT = registerItems("uranium_ingot", new Item(new FabricItemSettings()));
    public static final Item URANIUM_NUGGET = registerItems("uranium_nugget", new Item(new FabricItemSettings()));
    public static final Item VORTEX_EYE = registerItems("vortex_eye", new Item(new FabricItemSettings()));
    public static final Item WATER_DRAGON_SCALE = registerItems("water_dragon_scale", new Item(new FabricItemSettings()));
    public static final Item WORM_TOOTH = registerItems("worm_tooth", new Item(new FabricItemSettings()));

    public static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryItems() {
        RespawnEye.LOGGER.info("Registering Items for " + RespawnEye.MODID);
    }
}

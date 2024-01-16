package me.huanmeng.world.items;

import me.huanmeng.RespawnEye;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class reitems {

    public static final Item RUBY = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "ruby"), new Item(new Item.Settings()));
    public static final Item SALT = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "salt"), new Item(new Item.Settings()));
    public static final Item BASILISK_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "basilisk_scale"), new Item(new Item.Settings()));
    public static final Item CATERKILLER_JAWS = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "caterkiller_jaws"), new Item(new Item.Settings()));
    public static final Item CRYSTAL_SHARD = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "crystal_shard"), new Item(new Item.Settings()));
    public static final Item DEAD_STINK_BUG = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "dead_stink_bug"), new Item(new Item.Settings()));
    public static final Item EMPEROR_SCORPION_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "emperor_scorpion_scale"), new Item(new Item.Settings()));
    public static final Item GREEN_GOO = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "green_goo"), new Item(new Item.Settings()));
    public static final Item JUMPY_BUG_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "jumpy_bug_scale"), new Item(new Item.Settings()));
    public static final Item KRAKEN_TOOTH = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "kraken_tooth"), new Item(new Item.Settings()));
    public static final Item MANTIS_CLAW = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "mantis_claw"), new Item(new Item.Settings()));
    public static final Item MOBZILLA_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "mobzilla_scale"), new Item(new Item.Settings()));
    public static final Item MOLENOID_NOSE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "molenoid_nose"), new Item(new Item.Settings()));
    public static final Item MOTH_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "moth_scale"), new Item(new Item.Settings()));
    public static final Item NIGHTMARE_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "nightmare_scale"), new Item(new Item.Settings()));
    public static final Item PEACOCK_FEATHER = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "peacock_feather"), new Item(new Item.Settings()));
    public static final Item PINK_TOURMALINE_INGOT = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "pink_tourmaline_ingot"), new Item(new Item.Settings()));
    public static final Item QUEEN_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "queen_scale"), new Item(new Item.Settings()));
    public static final Item SEA_MONSTER_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "sea_monster_scale"), new Item(new Item.Settings()));
    public static final Item SEA_VIPER_TONGUE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "sea_viper_tongue"), new Item(new Item.Settings()));
    public static final Item TIGERS_EYE_INGOT = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "tigers_eye_ingot"), new Item(new Item.Settings()));
    public static final Item TITANIUM_INGOT = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "titanium_ingot"), new Item(new Item.Settings()));
    public static final Item TITANIUM_NUGGET = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "titanium_nugget"), new Item(new Item.Settings()));
    public static final Item TREX_TOOTH = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "trex_tooth"), new Item(new Item.Settings()));
    public static final Item URANIUM_INGOT = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "uranium_ingot"), new Item(new Item.Settings()));
    public static final Item URANIUM_NUGGET = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "uranium_nugget"), new Item(new Item.Settings()));
    public static final Item VORTEX_EYE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "vortex_eye"), new Item(new Item.Settings()));
    public static final Item WATER_DRAGON_SCALE = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "water_dragon_scale"), new Item(new Item.Settings()));
    public static final Item WORM_TOOTH = Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, "worm_tooth"), new Item(new Item.Settings()));

    public static void registryItems() {
        RespawnEye.LOGGER.debug("Registering Items for" + RespawnEye.MODID);
    }
}

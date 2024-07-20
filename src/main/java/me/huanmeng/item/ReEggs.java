package me.huanmeng.item;

import me.huanmeng.RespawnEye;
import me.huanmeng.entity.ReEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReEggs {

    public static final Item ANT_SPAWN_EGG;
    static {
        ANT_SPAWN_EGG = registerEggs("ant_spawn_egg", new SpawnEggItem(ReEntity.ANT, 0x502c0c, 0x2f1a05, new Item.Settings()));
    }

    public static Item registerEggs(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RespawnEye.MODID, name), item);
    }

    public static void registryEggss() {
        RespawnEye.LOGGER.info("Registering Eggs for " + RespawnEye.MODID);
    }
}

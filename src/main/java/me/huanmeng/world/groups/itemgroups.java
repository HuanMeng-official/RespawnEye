package me.huanmeng.world.groups;

import me.huanmeng.RespawnEye;
import me.huanmeng.world.items.reitems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class itemgroups {
    public static final ItemGroup GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(reitems.RUBY))
            .displayName(Text.translatable("ig.respawneye.item"))
            .entries((displayContext, entries) -> {
                entries.add(reitems.RUBY);
                entries.add(reitems.SALT);
                entries.add(reitems.BASILISK_SCALE);
                entries.add(reitems.CATERKILLER_JAWS);
                entries.add(reitems.CRYSTAL_SHARD);
                entries.add(reitems.DEAD_STINK_BUG);
                entries.add(reitems.EMPEROR_SCORPION_SCALE);
                entries.add(reitems.GREEN_GOO);
                entries.add(reitems.JUMPY_BUG_SCALE);
                entries.add(reitems.KRAKEN_TOOTH);
                entries.add(reitems.MOLENOID_NOSE);
                entries.add(reitems.MANTIS_CLAW);
                entries.add(reitems.MOBZILLA_SCALE);
                entries.add(reitems.MOTH_SCALE);
                entries.add(reitems.NIGHTMARE_SCALE);
                entries.add(reitems.PEACOCK_FEATHER);
                entries.add(reitems.PINK_TOURMALINE_INGOT);
                entries.add(reitems.QUEEN_SCALE);
                entries.add(reitems.SEA_VIPER_TONGUE);
                entries.add(reitems.SEA_MONSTER_SCALE);
                entries.add(reitems.TITANIUM_NUGGET);
                entries.add(reitems.TITANIUM_INGOT);
                entries.add(reitems.TREX_TOOTH);
                entries.add(reitems.TIGERS_EYE_INGOT);
                entries.add(reitems.URANIUM_NUGGET);
                entries.add(reitems.URANIUM_INGOT);
                entries.add(reitems.VORTEX_EYE);
                entries.add(reitems.WATER_DRAGON_SCALE);
                entries.add(reitems.WORM_TOOTH);
            })
            .build();

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(RespawnEye.MODID, "itemgroup"), GROUP);

    public static void registryGroup() {
        RespawnEye.LOGGER.debug("Registering Group for" + RespawnEye.MODID);
    }
}

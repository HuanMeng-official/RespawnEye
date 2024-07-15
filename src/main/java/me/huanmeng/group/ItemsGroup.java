package me.huanmeng.group;

import me.huanmeng.RespawnEye;
import me.huanmeng.item.ReItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemsGroup {

    public static final ItemGroup ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RespawnEye.MODID, "items_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ReItems.RUBY))
                    .displayName(Text.translatable("ig.respawneye.item"))
                    .entries((displayContext, entries) -> {
                        entries.add(ReItems.RUBY);
                        entries.add(ReItems.SALT);
                        entries.add(ReItems.BASILISK_SCALE);
                        entries.add(ReItems.CATERKILLER_JAWS);
                        entries.add(ReItems.CRYSTAL_SHARD);
                        entries.add(ReItems.DEAD_STINK_BUG);
                        entries.add(ReItems.EMPEROR_SCORPION_SCALE);
                        entries.add(ReItems.GREEN_GOO);
                        entries.add(ReItems.JUMPY_BUG_SCALE);
                        entries.add(ReItems.KRAKEN_TOOTH);
                        entries.add(ReItems.MOLENOID_NOSE);
                        entries.add(ReItems.MANTIS_CLAW);
                        entries.add(ReItems.MOBZILLA_SCALE);
                        entries.add(ReItems.MOTH_SCALE);
                        entries.add(ReItems.NIGHTMARE_SCALE);
                        entries.add(ReItems.PEACOCK_FEATHER);
                        entries.add(ReItems.PINK_TOURMALINE_INGOT);
                        entries.add(ReItems.QUEEN_SCALE);
                        entries.add(ReItems.SEA_VIPER_TONGUE);
                        entries.add(ReItems.SEA_MONSTER_SCALE);
                        entries.add(ReItems.RAW_TITANIUM);
                        entries.add(ReItems.TITANIUM_NUGGET);
                        entries.add(ReItems.TITANIUM_INGOT);
                        entries.add(ReItems.TREX_TOOTH);
                        entries.add(ReItems.TIGERS_EYE_INGOT);
                        entries.add(ReItems.RAW_TIGERS_EYE);
                        entries.add(ReItems.RAW_URANIUM);
                        entries.add(ReItems.URANIUM_NUGGET);
                        entries.add(ReItems.URANIUM_INGOT);
                        entries.add(ReItems.VORTEX_EYE);
                        entries.add(ReItems.WATER_DRAGON_SCALE);
                        entries.add(ReItems.WORM_TOOTH);
                    })
                    .build());

    public static void registryGroup() {
    }
}

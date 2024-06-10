package me.huanmeng.respawneye.group;

import me.huanmeng.respawneye.RespawnEye;
import me.huanmeng.respawneye.item.ReItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ItemsGroup {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RespawnEye.MODID);

    public static final Supplier<CreativeModeTab> ITEMS_TAB = TAB.register("items_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("ig.respawneye.item"))
                    .icon(() -> ReItems.RUBY.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ReItems.RUBY.get());
                        pOutput.accept(ReItems.SALT.get());
                        pOutput.accept(ReItems.BASILISK_SCALE.get());
                        pOutput.accept(ReItems.CATERKILLER_JAWS.get());
                        pOutput.accept(ReItems.CRYSTAL_SHARD.get());
                        pOutput.accept(ReItems.DEAD_STINK_BUG.get());
                        pOutput.accept(ReItems.EMPEROR_SCORPION_SCALE.get());
                        pOutput.accept(ReItems.GREEN_GOO.get());
                        pOutput.accept(ReItems.JUMPY_BUG_SCALE.get());
                        pOutput.accept(ReItems.KRAKEN_TOOTH.get());
                        pOutput.accept(ReItems.MANTIS_CLAW.get());
                        pOutput.accept(ReItems.MOBZILLA_SCALE.get());
                        pOutput.accept(ReItems.MOLENOID_NOSE.get());
                        pOutput.accept(ReItems.MOTH_SCALE.get());
                        pOutput.accept(ReItems.NIGHTMARE_SCALE.get());
                        pOutput.accept(ReItems.PEACOCK_FEATHER.get());
                        pOutput.accept(ReItems.PINK_TOURMALINE_INGOT.get());
                        pOutput.accept(ReItems.QUEEN_SCALE.get());
                        pOutput.accept(ReItems.SEA_MONSTER_SCALE.get());
                        pOutput.accept(ReItems.SEA_VIPER_TONGUE.get());
                        pOutput.accept(ReItems.TIGERS_EYE_INGOT.get());
                        pOutput.accept(ReItems.RAW_TIGERS_EYE.get());
                        pOutput.accept(ReItems.RAW_TITANIUM.get());
                        pOutput.accept(ReItems.TITANIUM_INGOT.get());
                        pOutput.accept(ReItems.TITANIUM_NUGGET.get());
                        pOutput.accept(ReItems.TREX_TOOTH.get());
                        pOutput.accept(ReItems.RAW_URANIUM.get());
                        pOutput.accept(ReItems.URANIUM_INGOT.get());
                        pOutput.accept(ReItems.URANIUM_NUGGET.get());
                        pOutput.accept(ReItems.WORM_TOOTH.get());
                        pOutput.accept(ReItems.VORTEX_EYE.get());
                        pOutput.accept(ReItems.WATER_DRAGON_SCALE.get());
                    }))
                    .build());

    public static void registryGroup(IEventBus eventBus) {
        TAB.register(eventBus);
        RespawnEye.LOGGER.info("Registering ItemsGroup for RespawnEye");
    }
}

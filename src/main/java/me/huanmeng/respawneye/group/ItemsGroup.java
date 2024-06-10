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

    public static final Supplier<CreativeModeTab> ITEMS_TAB = TAB.register("items_bus",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("ig.respawneye.item"))
                    .icon(() -> ReItems.RUBY.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ReItems.RUBY.get());
                        pOutput.accept(ReItems.SALT.get());
                    }))
                    .build());

    public static void registryGroup(IEventBus eventBus) {
        TAB.register(eventBus);
        RespawnEye.LOGGER.info("Registering ItemsGroup for RespawnEye");
    }
}

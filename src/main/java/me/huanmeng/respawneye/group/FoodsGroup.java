package me.huanmeng.respawneye.group;

import me.huanmeng.respawneye.RespawnEye;
import me.huanmeng.respawneye.item.ReFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FoodsGroup {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RespawnEye.MODID);

    public static final Supplier<CreativeModeTab> FOODS_TAB = TAB.register("foods_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("ig.respawneye.food"))
                    .icon(() -> ReFoods.SPARK_FISH.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ReFoods.SPARK_FISH.get());
                    }))
                    .build());

    public static void registryGroup(IEventBus eventBus) {
        TAB.register(eventBus);
        RespawnEye.LOGGER.info("Registering FoodGroup for RespawnEye");
    }
}

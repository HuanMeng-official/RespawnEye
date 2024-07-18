package me.huanmeng.respawneye.group;

import me.huanmeng.respawneye.RespawnEye;
import me.huanmeng.respawneye.item.ReArmors;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ArmorsGroup {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RespawnEye.MODID);

    public static final Supplier<CreativeModeTab> ARMORS_TAB = TAB.register("armors_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("ig.respawneye.armor"))
                    .icon(() -> ReArmors.RUBY_CHESTPLATE.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ReArmors.RUBY_HELMET.get());
                        pOutput.accept(ReArmors.RUBY_CHESTPLATE.get());
                        pOutput.accept(ReArmors.RUBY_LEGGINGS.get());
                        pOutput.accept(ReArmors.RUBY_BOOTS.get());
                        pOutput.accept(ReArmors.AMETHYST_HELMET.get());
                        pOutput.accept(ReArmors.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(ReArmors.AMETHYST_LEGGINGS.get());
                        pOutput.accept(ReArmors.AMETHYST_BOOTS.get());
                        pOutput.accept(ReArmors.EMERALD_HELMET.get());
                        pOutput.accept(ReArmors.EMERALD_CHESTPLATE.get());
                        pOutput.accept(ReArmors.EMERALD_LEGGINGS.get());
                        pOutput.accept(ReArmors.EMERALD_BOOTS.get());
                    }))
                    .build());

    public static void registryGroup(IEventBus eventBus) {
        TAB.register(eventBus);
        RespawnEye.LOGGER.info("Registering ArmorsGroup for RespawnEye");
    }
}

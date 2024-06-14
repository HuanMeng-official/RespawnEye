package me.huanmeng.respawneye.group;

import me.huanmeng.respawneye.RespawnEye;
import me.huanmeng.respawneye.item.ReTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ToolsGroup {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RespawnEye.MODID);

    public static final Supplier<CreativeModeTab> FOODS_TAB = TAB.register("tools_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("ig.respawneye.tool"))
                    .icon(() -> ReTools.RUBY_AXE.get().getDefaultInstance())
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ReTools.RUBY_AXE.get());
                        pOutput.accept(ReTools.RUBY_PICKAXE.get());
                        pOutput.accept(ReTools.RUBY_SHOVEL.get());
                        pOutput.accept(ReTools.RUBY_HOE.get());
                        pOutput.accept(ReTools.RUBY_SWORD.get());
                    }))
                    .build());

    public static void registryGroup(IEventBus eventBus) {
        TAB.register(eventBus);
        RespawnEye.LOGGER.info("Registering ToolsGroup for RespawnEye");
    }
}
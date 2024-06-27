package me.huanmeng.respawneye.util;

import me.huanmeng.respawneye.item.ReTools;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ReToolsProperties {

    public static void registerModels() {
        registerBow(ReTools.ULTIMATE_BOW.get());
    }

    public static void registerBow(Item bow) {
        ItemProperties.register(bow, new ResourceLocation("pull"), (stack, world, entity, speed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - entity.getUseItemRemainingTicks()) / 20.0F;
            }
        });

        ItemProperties.register(bow,
                new ResourceLocation("pulling"),
                (stack, world, entity, speed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F
        );
    }
}

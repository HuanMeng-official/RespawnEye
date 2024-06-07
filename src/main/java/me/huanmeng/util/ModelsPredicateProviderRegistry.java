package me.huanmeng.util;

import me.huanmeng.item.ReTools;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModelsPredicateProviderRegistry {

    public static void registerModels() {
        registerBow(ReTools.ULTIMATE_BOW);
    }

    public static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(Items.BOW, new Identifier("pull"),
                (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getActiveItem() != stack) {
                return 0.0f;
            }
            return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
        });

        ModelPredicateProviderRegistry.register(Items.BOW, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}

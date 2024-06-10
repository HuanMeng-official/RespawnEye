package me.huanmeng.respawneye.item;

import me.huanmeng.respawneye.RespawnEye;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ReFoods {
    private static final DeferredRegister.Items FOODS = DeferredRegister.createItems(RespawnEye.MODID);

    public static final DeferredItem<Item> SPARK_FISH;
    static {
        SPARK_FISH = FOODS.registerSimpleItem("spark_fish", new Item.Properties().food(new FoodProperties.Builder().fast().nutrition(1).saturationMod(0.2f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 100, 0), 1).build()));
    }

    public static void registryItems(IEventBus eventBus) {
        FOODS.register(eventBus);
        RespawnEye.LOGGER.info("Registering Foods for RespawnEye");
    }
}

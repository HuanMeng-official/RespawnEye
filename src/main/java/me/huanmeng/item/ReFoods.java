package me.huanmeng.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ReFoods {
    public static final FoodComponent SPARK_FISH;
    static {
        SPARK_FISH = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.2f).snack().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100, 1), 1).build();
    }
}

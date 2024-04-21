package me.huanmeng.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ReFoods {

    public static final FoodComponent SPARK_FISH = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(0.2f)
            .snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100), 1)
            .build();
}

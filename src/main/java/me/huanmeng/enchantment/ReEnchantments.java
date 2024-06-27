package me.huanmeng.enchantment;

import me.huanmeng.RespawnEye;
import me.huanmeng.enchantment.custome.LightningStrike;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReEnchantments {

    public static final Enchantment LIGHTNING_STRIKE = register("lightning_strike", new LightningStrike(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(RespawnEye.MODID, name), enchantment);
    }

    public static void registerEnchantments() {
        RespawnEye.LOGGER.info("Registering Enchantments for " + RespawnEye.MODID);
    }
}

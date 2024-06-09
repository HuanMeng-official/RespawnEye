package me.huanmeng.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningStrike extends Enchantment {

    public LightningStrike(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getEntityWorld();
            BlockPos pos = target.getBlockPos();
            if (level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, pos, SpawnReason.TRIGGERED, true, true);
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}

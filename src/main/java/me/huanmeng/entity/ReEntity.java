package me.huanmeng.entity;

import me.huanmeng.RespawnEye;
import me.huanmeng.entity.custom.AntEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ReEntity {
    public static final EntityType<AntEntity> ANT = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RespawnEye.MODID, "ant"),
            EntityType.Builder.create(AntEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 0.4f).build());
}

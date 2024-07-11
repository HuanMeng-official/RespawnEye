package me.huanmeng.entity.client;

import me.huanmeng.RespawnEye;
import me.huanmeng.entity.custom.AntEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class AntModel extends GeoModel<AntEntity> {
    @Override
    public Identifier getModelResource(AntEntity animatable) {
        return new Identifier(RespawnEye.MODID, "geo/ant.geo.json");
    }

    @Override
    public Identifier getTextureResource(AntEntity animatable) {
        return new Identifier(RespawnEye.MODID, "textures/entity/ant.png");
    }

    @Override
    public Identifier getAnimationResource(AntEntity animatable) {
        return new Identifier(RespawnEye.MODID, "animations/ant.animation.json");
    }

    @Override
    public void setCustomAnimations(AntEntity animatable, long instanceId, AnimationState<AntEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");
        if (head != null) {
            EntityModelData data = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(data.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(data.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}

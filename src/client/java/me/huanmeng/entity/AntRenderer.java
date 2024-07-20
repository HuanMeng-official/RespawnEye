package me.huanmeng.entity;

import me.huanmeng.RespawnEye;
import me.huanmeng.entity.custom.AntEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AntRenderer extends GeoEntityRenderer<AntEntity> {
    public AntRenderer(EntityRendererFactory.Context context) {
        super(context, new AntModel());
    }

    @Override
    public Identifier getTexture(AntEntity entity) {
        return new Identifier(RespawnEye.MODID, "textures/entity/ant.png");
    }

    @Override
    public void render(AntEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}

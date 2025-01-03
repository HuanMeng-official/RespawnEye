package me.huanmeng;

import me.huanmeng.entity.ReEntity;
import me.huanmeng.entity.client.AntRenderer;
import me.huanmeng.util.client.ModelsPredicateProviderRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RespawnEyeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelsPredicateProviderRegistry.registerModels();
        EntityRendererRegistry.register(ReEntity.ANT, AntRenderer::new);
    }
}

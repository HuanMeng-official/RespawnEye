package me.huanmeng;

import me.huanmeng.util.ModelsPredicateProviderRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class RespawnEyeClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModelsPredicateProviderRegistry.registerModels();
    }
}

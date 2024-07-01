package me.huanmeng.respawneye.datagen;

import me.huanmeng.respawneye.RespawnEye;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ReItemModelsProvider extends ItemModelProvider {
    public ReItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RespawnEye.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }
}

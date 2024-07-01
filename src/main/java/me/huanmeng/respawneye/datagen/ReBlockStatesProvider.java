package me.huanmeng.respawneye.datagen;

import me.huanmeng.respawneye.RespawnEye;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ReBlockStatesProvider extends BlockStateProvider {
    public ReBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RespawnEye.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }
}

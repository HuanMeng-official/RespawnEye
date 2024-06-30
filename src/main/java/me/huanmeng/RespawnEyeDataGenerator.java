package me.huanmeng;

import me.huanmeng.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RespawnEyeDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(BlocksTagProvider::new);
		pack.addProvider(LootTablesProvider::new);
		pack.addProvider(ModelsProvider::new);
		pack.addProvider(RecipesProvider::new);
	}
}

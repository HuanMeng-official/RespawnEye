package me.huanmeng;

import me.huanmeng.datagen.*;
import me.huanmeng.world.ReConfiguredFeatures;
import me.huanmeng.world.RePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class RespawnEyeDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(BlocksTagProvider::new);
		pack.addProvider(LootTablesProvider::new);
		pack.addProvider(ModelsProvider::new);
		pack.addProvider(RecipesProvider::new);
		pack.addProvider(DynamicRegistryProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ReConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, RePlacedFeatures::boostrap);
	}
}

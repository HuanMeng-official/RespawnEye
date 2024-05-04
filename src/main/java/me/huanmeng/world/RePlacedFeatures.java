package me.huanmeng.world;

import me.huanmeng.RespawnEye;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class RePlacedFeatures {

    public static final RegistryKey<PlacedFeature> RUBY_ORE = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SALT_ORE = registerKey("salt_ore_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE = registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> URANIUM_ORE = registerKey("uranium_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context){
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE, configuredFeatureRegistryEntryLookup.getOrThrow(ReConfiguredFeatures.RUBY_ORE_KEY),
                ReOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(60))));
        register(context, SALT_ORE, configuredFeatureRegistryEntryLookup.getOrThrow(ReConfiguredFeatures.SALT_ORE_KEY),
                ReOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-20), YOffset.fixed(70))));
        register(context, TITANIUM_ORE, configuredFeatureRegistryEntryLookup.getOrThrow(ReConfiguredFeatures.TITANIUM_ORE_KEY),
                ReOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(25))));
        register(context, URANIUM_ORE, configuredFeatureRegistryEntryLookup.getOrThrow(ReConfiguredFeatures.URANIUM_ORE_KEY),
                ReOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(20))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(RespawnEye.MODID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

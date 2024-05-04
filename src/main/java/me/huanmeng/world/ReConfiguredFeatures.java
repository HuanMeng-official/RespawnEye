package me.huanmeng.world;

import me.huanmeng.RespawnEye;
import me.huanmeng.block.ReBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ReConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SALT_ORE_KEY = registerKey("salt_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stonePlace = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepPlace = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> RubyOverWorld =
                List.of(OreFeatureConfig.createTarget(stonePlace, ReBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepPlace, ReBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> SaltOverWorld =
                List.of(OreFeatureConfig.createTarget(stonePlace, ReBlocks.SALT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepPlace, ReBlocks.DEEPSLATE_SALT_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> TitaniumOverWorld =
                List.of(OreFeatureConfig.createTarget(stonePlace, ReBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepPlace, ReBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> UraniumOverWorld =
                List.of(OreFeatureConfig.createTarget(stonePlace, ReBlocks.URANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepPlace, ReBlocks.DEEPSLATE_URANIUM_ORE.getDefaultState()));

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(RubyOverWorld, 8));
        register(context, SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(SaltOverWorld, 14));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(TitaniumOverWorld, 4));
        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(UraniumOverWorld, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(RespawnEye.MODID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

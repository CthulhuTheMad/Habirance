package net.endurteam.habirance.block.world.feature;

import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeature {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ALABASTER = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.ALABASTER_BLOCK.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_REDROCK = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.REDROCK_BLOCK.get().defaultBlockState()));

    public static final ConfiguredFeature<?, ?> ORE_ALABASTER = FeatureUtils.register("ore_alabaster",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_ALABASTER, 64)));
    public static final ConfiguredFeature<?, ?> ORE_REDROCK = FeatureUtils.register("ore_redrock",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_REDROCK, 64)));
}

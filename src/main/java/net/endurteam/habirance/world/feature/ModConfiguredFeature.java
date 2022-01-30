package net.endurteam.habirance.world.feature;

import net.endurteam.habirance.block.ModBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeature {
    public static final RuleTest REDROCK = new BlockMatchTest(ModBlocks.REDROCK_BLOCK.get());
    public static final RuleTest GRANITE = new BlockMatchTest(Blocks.GRANITE);
    public static final RuleTest TUFF = new BlockMatchTest(Blocks.TUFF);

    public static final List<OreConfiguration.TargetBlockState> TUFF_REPLACEABLES = List.of(
            OreConfiguration.target(ModConfiguredFeature.TUFF, ModBlocks.TUFF_IRON_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> GRANITE_REPLACEABLES = List.of(
            OreConfiguration.target(ModConfiguredFeature.GRANITE, ModBlocks.GRANITE_COPPER_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> REDROCK_REPLACEABLES = List.of(
            OreConfiguration.target(ModConfiguredFeature.REDROCK, ModBlocks.REDROCK_REDSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ALABASTER = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.ALABASTER_BLOCK.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_REDROCK = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.REDROCK_BLOCK.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SLATE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, ModBlocks.SLATE_BLOCK.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> NETHER_IGNEOT = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.IGNEOT_BLOCK.get().defaultBlockState()));


    public static final ConfiguredFeature<?, ?> ORE_ALABASTER = FeatureUtils.register("ore_alabaster",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_ALABASTER, 30)));
    public static final ConfiguredFeature<?, ?> ORE_REDROCK = FeatureUtils.register("ore_redrock",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_REDROCK, 64)));
    public static final ConfiguredFeature<?, ?> ORE_REDSTONE_REDROCK = FeatureUtils.register("ore_redstone_redrock",
            Feature.ORE.configured(new OreConfiguration(REDROCK_REPLACEABLES, 8)));
    public static final ConfiguredFeature<?, ?> ORE_TUFF_IRON = FeatureUtils.register("ore_tuff_iron",
            Feature.ORE.configured(new OreConfiguration(TUFF_REPLACEABLES, 8)));
    public static final ConfiguredFeature<?, ?> ORE_GRANITE_COPPER = FeatureUtils.register("ore_granite_copper",
            Feature.ORE.configured(new OreConfiguration(GRANITE_REPLACEABLES, 8)));
    public static final ConfiguredFeature<?, ?> ORE_SLATE = FeatureUtils.register("ore_slate",
            Feature.ORE.configured(new OreConfiguration(OVERWORLD_REDROCK, 40)));
    public static final ConfiguredFeature<BlockStateConfiguration, ?> LIMESTONE_ROCK = FeatureUtils.register("limestone_rock",
            Feature.FOREST_ROCK.configured(new BlockStateConfiguration(ModBlocks.LIMESTONE_BLOCK.get().defaultBlockState())));
    public static final ConfiguredFeature<BlockStateConfiguration, ?> SLATE_ROCK = FeatureUtils.register("slate_rock",
            Feature.FOREST_ROCK.configured(new BlockStateConfiguration(ModBlocks.SLATE_BLOCK.get().defaultBlockState())));

    public static final ConfiguredFeature<?, ?> ORE_IGNEOT = FeatureUtils.register("ore_igneot",
            Feature.ORE.configured(new OreConfiguration(NETHER_IGNEOT, 40, 1.0f)));

}

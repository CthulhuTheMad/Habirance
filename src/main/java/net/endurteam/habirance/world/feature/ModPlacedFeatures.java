package net.endurteam.habirance.world.feature;


import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;


public class ModPlacedFeatures {
    public static final PlacedFeature ORE_ALABASTER_PLACED = PlacementUtils.register("ore_alabaster_placed",
            ModConfiguredFeature.ORE_ALABASTER.placed(ModOrePlacement.commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-15)))));
    public static final PlacedFeature ORE_REDROCK_UPPER_PLACED = PlacementUtils.register("ore_redorck_upper_placed",
            ModConfiguredFeature.ORE_REDROCK.placed(ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
    public static final PlacedFeature ORE_REDROCK_LOWER_PLACED = PlacementUtils.register("ore_redorck_lower_placed",
            ModConfiguredFeature.ORE_REDROCK.placed(ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));
    public static final PlacedFeature ORE_REDSTONE_REDROCK = PlacementUtils.register("ore_redstone_redrock",
            ModConfiguredFeature.ORE_REDSTONE_REDROCK.placed(ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15)))));
    public static final PlacedFeature LIMESTONE_ROCK = PlacementUtils.register("limestone_rock", ModConfiguredFeature.LIMESTONE_ROCK.placed(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

}

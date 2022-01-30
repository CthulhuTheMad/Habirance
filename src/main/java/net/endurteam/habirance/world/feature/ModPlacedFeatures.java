package net.endurteam.habirance.world.feature;


import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;


public class ModPlacedFeatures {
    public static final PlacedFeature ORE_ALABASTER_PLACED = PlacementUtils.register("ore_alabaster_placed",
            ModConfiguredFeature.ORE_ALABASTER.placed(ModOrePlacement.commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(-45)))));
    public static final PlacedFeature ORE_REDROCK_UPPER_PLACED = PlacementUtils.register("ore_redorck_upper_placed",
            ModConfiguredFeature.ORE_REDROCK.placed(ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
    public static final PlacedFeature ORE_REDROCK_LOWER_PLACED = PlacementUtils.register("ore_redorck_lower_placed",
            ModConfiguredFeature.ORE_REDROCK.placed(ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));
    public static final PlacedFeature ORE_REDSTONE_REDROCK = PlacementUtils.register("ore_redstone_redrock",
            ModConfiguredFeature.ORE_REDSTONE_REDROCK.placed(ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15)))));
    public static final PlacedFeature LIMESTONE_ROCK = PlacementUtils.register("limestone_rock", ModConfiguredFeature.LIMESTONE_ROCK.placed(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final PlacedFeature ORE_TUFF_IRON = PlacementUtils.register("ore_tuff_iron",
            ModConfiguredFeature.ORE_TUFF_IRON.placed(ModOrePlacement.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(0)))));
    public static final PlacedFeature ORE_GRANITE_COPPER = PlacementUtils.register("ore_granite_copper",
            ModConfiguredFeature.ORE_GRANITE_COPPER.placed(ModOrePlacement.commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112)))));
    public static final PlacedFeature ORE_SLATE_PLACED = PlacementUtils.register("ore_slate_placed",
            ModConfiguredFeature.ORE_SLATE.placed(ModOrePlacement.rareOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(128)))));
    public static final PlacedFeature SLATE_ROCK = PlacementUtils.register("slate_rock", ModConfiguredFeature.SLATE_ROCK.placed(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final PlacedFeature ORE_IGNEOT_PLACED = PlacementUtils.register("ore_igneot_placed", ModConfiguredFeature.ORE_IGNEOT.placed(ModOrePlacement.commonOrePlacement(3, PlacementUtils.RANGE_10_10)));

}

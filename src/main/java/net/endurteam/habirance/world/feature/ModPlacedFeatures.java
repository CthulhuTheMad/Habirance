package net.endurteam.habirance.world.feature;


import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;


public class ModPlacedFeatures {
    public static final PlacedFeature ORE_ALABASTER_PLACED = PlacementUtils.register("ore_alabaster_placed",
            ModConfiguredFeature.ORE_ALABASTER.placed(ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(0)))));
    public static final PlacedFeature ORE_REDROCK_UPPER_PLACED = PlacementUtils.register("ore_redorck_upper_placed",
            ModConfiguredFeature.ORE_REDROCK.placed(ModOrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128)))));
    public static final PlacedFeature ORE_REDROCK_LOWER_PLACED = PlacementUtils.register("ore_redorck_lower_placed",
            ModConfiguredFeature.ORE_REDROCK.placed(ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));
}

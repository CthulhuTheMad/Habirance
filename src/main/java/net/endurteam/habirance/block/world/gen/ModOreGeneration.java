package net.endurteam.habirance.block.world.gen;

import net.endurteam.habirance.block.world.feature.ModPlacedFeatures;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Supplier<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(() -> ModPlacedFeatures.ORE_ALABASTER_PLACED);
        base.add(() -> ModPlacedFeatures.ORE_REDROCK_LOWER_PLACED);
        base.add(() -> ModPlacedFeatures.ORE_REDROCK_UPPER_PLACED);
    }
}
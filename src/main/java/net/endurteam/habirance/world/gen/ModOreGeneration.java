package net.endurteam.habirance.world.gen;

import net.endurteam.habirance.world.feature.ModPlacedFeatures;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {

        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
        List<Supplier<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(() -> ModPlacedFeatures.ORE_ALABASTER_PLACED);
        base.add(() -> ModPlacedFeatures.ORE_REDROCK_LOWER_PLACED);
        base.add(() -> ModPlacedFeatures.ORE_REDROCK_UPPER_PLACED);
        base.add(() -> ModPlacedFeatures.ORE_REDSTONE_REDROCK);
        base.add(() -> ModPlacedFeatures.ORE_TUFF_IRON);
        base.add(() -> ModPlacedFeatures.ORE_GRANITE_COPPER);
        base.add(() -> ModPlacedFeatures.ORE_IGNEOT_PLACED);

        if (types.contains(BiomeDictionary.Type.JUNGLE)) {

            base.add(() -> ModPlacedFeatures.ORE_SLATE_PLACED);
        }


    }
}

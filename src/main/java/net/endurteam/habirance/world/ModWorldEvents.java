package net.endurteam.habirance.world;

import net.endurteam.habirance.Habirance;
import net.endurteam.habirance.world.gen.ModBiomeChanges;
import net.endurteam.habirance.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Habirance.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModBiomeChanges.generateBiomeFeatures(event);
    }
}

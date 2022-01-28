package net.fabricmc.tutorial.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.tutorial.world.features.ModConfiguredFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModConfiguredFeatures.BLUEBELLS_KEY);

//        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
//                 GenerationStep.Feature.VEGETAL_DECORATION, ModConfiguredFeatures.NIGHT_CURON_KEY);
    }
}
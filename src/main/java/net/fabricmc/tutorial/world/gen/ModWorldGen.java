package net.fabricmc.tutorial.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModTreeGeneration.generateTrees();
        ModFlowerGeneration.generateFlowers();
        ModOreGeneration.generateOres();
    }
}

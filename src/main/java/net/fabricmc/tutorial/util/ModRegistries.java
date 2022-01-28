package net.fabricmc.tutorial.util;

import net.fabricmc.tutorial.block.ModBlocks;
import net.fabricmc.tutorial.items.ModItems;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {
    public static void registerModFeatures()
    {
        registerModComposterChances();
    }

    public static void registerModComposterChances() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.KURO_SEEDS, 0.35f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.KURO, 0.65f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.KURO_WHEAT_BLOCK, 0.90f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.NITRIS_LEAVES, 0.75f);
    }

}

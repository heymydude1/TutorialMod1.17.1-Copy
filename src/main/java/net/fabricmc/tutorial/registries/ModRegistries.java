package net.fabricmc.tutorial.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
//import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.tutorial.Main;
//import net.fabricmc.tutorial.block.ModBlocks;
import net.fabricmc.tutorial.block.ModBlocks;
import net.fabricmc.tutorial.items.ModItems;

public class ModRegistries {

    public static void registerModFuels() {
        System.out.println("Now registering Fuels for " + Main.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.IRON_WOOL, 300); // x / 20
        registry.add(ModItems.PEPPER, 60);
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);

        StrippableBlockRegistry.register(ModBlocks.NITRIS_LOG, ModBlocks.STRIPPED_NITRIS_LOG);
        StrippableBlockRegistry.register(ModBlocks.NITRIS_WOOD, ModBlocks.STRIPPED_NITRIS_WOOD);


    }
}


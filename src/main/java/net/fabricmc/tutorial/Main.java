package net.fabricmc.tutorial;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.tutorial.block.ModBlocks;
import net.fabricmc.tutorial.config.ModConfigs;
import net.fabricmc.tutorial.enchantments.ModEnchantments;
import net.fabricmc.tutorial.items.ModItems;
import net.fabricmc.tutorial.painting.ModPaintings;
import net.fabricmc.tutorial.registries.ModRegistries;
import net.fabricmc.tutorial.sounds.ModSounds;
import net.fabricmc.tutorial.util.ModCommandRegister;
import net.fabricmc.tutorial.util.ModEventsRegister;
import net.fabricmc.tutorial.util.ModLootTableModifiers;
import net.fabricmc.tutorial.world.features.ModConfiguredFeatures;
import net.fabricmc.tutorial.world.gen.ModWorldGen;
import net.minecraft.client.render.RenderLayer;

public class Main implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		ModConfigs.registerConfigs();
		ModConfiguredFeatures.registerConfiguredFeatures();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();




		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NITRIS_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NITRIS_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_NIGHT_CURON, RenderLayer.getCutout());


		ModRegistries.registerModFuels();
		ModRegistries.registerStrippables();

		ModCommandRegister.registerCommands();
		ModEventsRegister.registerEvents();

		//ModRecipes.register();

		ModLootTableModifiers.modifyLootTables();
		ModSounds.registerSounds();

		ModEnchantments.registerModEnchantments();

		ModWorldGen.generateModWorldGen();

		System.out.println("Hello Fabric world!");
	}
}

package net.fabricmc.tutorial.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.tutorial.Main;
import net.fabricmc.tutorial.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {

    public static BlockEntityType<CropCutterBlockEntity> CROP_CUTTER_BLOCK_ENTITY;

    public static void registerBlockEntities() {
        CROP_CUTTER_BLOCK_ENTITY =
                Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.MOD_ID, "crop_cutter_block"),
                        FabricBlockEntityTypeBuilder.create(CropCutterBlockEntity::new,
                                ModBlocks.CROP_CUTTER_BLOCK).build(null));
    }

}

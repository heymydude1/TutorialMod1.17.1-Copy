package net.fabricmc.tutorial.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.tutorial.Main;
import net.fabricmc.tutorial.block.custom.*;
import net.fabricmc.tutorial.fluid.ModFluids;
import net.fabricmc.tutorial.items.ModItemGroups;
import net.fabricmc.tutorial.items.RubyItemGroup;
import net.fabricmc.tutorial.items.custom.KuroPlantBlock;
import net.fabricmc.tutorial.sounds.ModSounds;
import net.fabricmc.tutorial.world.features.tree.RedwoodSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block MOON_STONE_DUST_BLOCK = registerBlock("moon_stone_dust_block",
            new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(1f)
                    .sounds(BlockSoundGroup.LANTERN)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block KURO_WHEAT_BLOCK = registerBlock("kuro_wheat_block",
            new PillarBlock(FabricBlockSettings.of(Material.PLANT).strength(1f)
                    .sounds(BlockSoundGroup.GRASS)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block BLACKSTONE_METAL_BLOCK = registerBlock("blackstone_metal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f)
                    .sounds(BlockSoundGroup.BONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block GLIMMERING_AMETHYST_BLOCK = registerBlock("glimmering_amethyst_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(2f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_LIMESTONE = registerBlock("cobbled_limestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_LOG = registerBlock("nitris_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_WOOD = registerBlock("nitris_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_PLANKS = registerBlock("nitris_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block STRIPPED_NITRIS_LOG = registerBlock("stripped_nitris_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block STRIPPED_NITRIS_WOOD = registerBlock("stripped_nitris_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_LEAVES = registerBlock("nitris_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ModItemGroups.MORE_WEAPONRY);

    //public static final Block NITRIS_SAPLING = registerBlock("nitris_sapling",
//            new ModSaplingBlock(new RedwoodSaplingGenerator(ModConfiguredFeatures.NITRIS_TREE),
//                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroups.MORE_WEAPONRY);

    public static final Block NIGHT_CURON = registerBlock("night_curon",
            new FlowerBlock(StatusEffects.WITHER, 100,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()),
            ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_SLAB = registerBlock("nitris_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_STAIRS = registerBlock("nitris_stairs",
            new OrichalcumStairsBlock(ModBlocks.NITRIS_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            new OrichalcumStairsBlock(ModBlocks.LIMESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_LIMESTONE_SLAB = registerBlock("cobbled_limestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_LIMESTONE_STAIRS = registerBlock("cobbled_limestone_stairs",
            new OrichalcumStairsBlock(ModBlocks.COBBLED_LIMESTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.STONE)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_FENCE = registerBlock("nitris_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_FENCE_GATE = registerBlock("nitris_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_LIMESTONE_WALL = registerBlock("cobbled_limestone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_BUTTON = registerBlock("nitris_button",
            new ModWoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block LIMESTONE_BUTTON = registerBlock("limestone_button",
            new OrichalcumStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLESTONE_BUTTON = registerBlock("cobblestone_button",
            new OrichalcumStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_LIMESTONE_BUTTON = registerBlock("cobbled_limestone_button",
            new OrichalcumStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_PRESSURE_PLATE = registerBlock("nitris_pressure_plate",
            new OrichalcumPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.WOOD).strength(2f)
                            .sounds(BlockSoundGroup.WOOD)
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block LIMESTONE_PRESSURE_PLATE = registerBlock("limestone_pressure_plate",
            new OrichalcumPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).strength(3f)
                            .sounds(BlockSoundGroup.STONE)
                            .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate",
            new OrichalcumPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).strength(3f)
                            .sounds(BlockSoundGroup.STONE)
                            .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_LIMESTONE_PRESSURE_PLATE = registerBlock("cobbled_limestone_pressure_plate",
            new OrichalcumPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).strength(3f)
                            .sounds(BlockSoundGroup.STONE)
                            .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_DOOR = registerBlock("nitris_door",
            new OrichalcumDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_TRAPDOOR = registerBlock("nitris_trapdoor",
            new OrichalcumTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(2f)
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block MARE_DIAMOND_BLOCK = registerBlock("mare_diamond_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block CIRTICT_BLOCK = registerBlock("cirtict_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)
                    .sounds(BlockSoundGroup.METAL)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block CROP_CUTTER_BLOCK = registerBlock("crop_cutter_block",
            new CropCutterBlock(FabricBlockSettings.of(Material.WOOD)), ModItemGroups.MORE_WEAPONRY);

    public static final Block MARE_DIAMOND_ORE = registerBlock("mare_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block DEEPSLATE_MARE_DIAMOND_ORE = registerBlock("deepslate_mare_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block BLUESTONE = registerBlock("bluestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_BLUESTONE = registerBlock("cobbled_bluestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block BLUESTONE_STAIRS = registerBlock("bluestone_stairs",
            new OrichalcumStairsBlock(ModBlocks.BLUESTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f)
                            .sounds(BlockSoundGroup.STONE)
                            .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_BLUESTONE_STAIRS = registerBlock("cobbled_bluestone_stairs",
            new OrichalcumStairsBlock(ModBlocks.COBBLED_BLUESTONE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2f)
                            .sounds(BlockSoundGroup.STONE)
                            .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block BLUESTONE_SLAB = registerBlock("bluestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_BLUESTONE_SLAB = registerBlock("cobbled_bluestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()), ModItemGroups.MORE_WEAPONRY);

    public static final Block BLUESTONE_WALL = registerBlock("bluestone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block COBBLED_BLUESTONE_WALL = registerBlock("cobbled_bluestone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()
            ), ModItemGroups.MORE_WEAPONRY);

    public static final Block CIRTICT_DEBRIS = registerBlock("cirtict_debris",
            new Block(FabricBlockSettings.copy(Blocks.ANCIENT_DEBRIS)), ModItemGroups.MORE_WEAPONRY);

    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static final Block KURO_PLANT = registerBlockWithoutBlockItem("kuro_plant",
            new KuroPlantBlock(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.ROOTS).nonOpaque()
                    .noCollision()), ModItemGroups.MORE_WEAPONRY);


    public static final Block POTTED_NIGHT_CURON = registerBlockWithoutBlockItem("potted_night_curon",
            new FlowerPotBlock(ModBlocks.NIGHT_CURON, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM)),
            ModItemGroups.MORE_WEAPONRY);


    public static final Block NITRIS_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("nitris_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.NITRIS),
            ModItemGroups.MORE_WEAPONRY);

    public static final Block NITRIS_SIGN_BLOCK = registerBlockWithoutBlockItem("nitris_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.NITRIS),
            ModItemGroups.MORE_WEAPONRY);







    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block STATUS_BLOCK = registerBlock("status_block",
            new StatusBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new RubyStairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));


    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new RubyStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new RubyPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));


    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new RubyDoorBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().nonOpaque()));

    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new RubyTrapdoorBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().nonOpaque()));

    public static final Block TEST_BLOCK = registerBlock("test_block",
            new TestBlock(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block DICE_BLOCK = registerBlock("dice_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block PEPPER_PLANT = registerBlockWithoutBlockItem("pepper_plant",
            new PepperPlantBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()), ModItemGroups.MORE_WEAPONRY);

    public static final Block BLUEBELLS = registerBlock("bluebells",
            new FlowerBlock(StatusEffects.DOLPHINS_GRACE, 200,
                    FabricBlockSettings.copy(Blocks.DANDELION).nonOpaque().noCollision()));

    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new RedwoodSaplingBlock(new RedwoodSaplingGenerator(),
                    (FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque())));

   public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()));

    public static final Block ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()));

        public static final Block DEEPSLATE_ORICHALCUM_ORE = registerBlock("deepslate_orichalcum_ore",
                new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));

        public static final Block RAW_ORICHALCUM_BLOCK = registerBlock("raw_orichalcum_block",
                new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()));


        public static final Block ORICHALCUM_STAIRS = registerBlock("orichalcum_stairs",
                new OrichalcumStairsBlock(ModBlocks.ORICHALCUM_BLOCK.getDefaultState(),
                        FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

        public static final Block ORICHALCUM_SLAB = registerBlock("orichalcum_slab",
                new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

        public static final Block ORICHALCUM_BUTTON = registerBlock("orichalcum_button",
                new OrichalcumStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

        public static final Block ORICHALCUM_PRESSURE_PLATE = registerBlock("orichalcum_pressure_plate",
                new OrichalcumPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                        FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));


        public static final Block ORICHALCUM_FENCE = registerBlock("orichalcum_fence",
                new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

        public static final Block ORICHALCUM_FENCE_GATE = registerBlock("orichalcum_fence_gate",
                new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

        public static final Block ORICHALCUM_WALL = registerBlock("orichalcum_wall",
                new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

        public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
                new OrichalcumDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));

        public static final Block CHEERY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
                new OrichalcumTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()));


        public static final Block ORICHALCUM_LAMP = registerBlock("orichalcum_lamp",
                new OrichalcumLampBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()
                        .luminance((state) -> state.get(OrichalcumLampBlock.CLICKED) ? 15 : 0)
                        .sounds(ModSounds.ORICHALCUM_SOUNDS)));


        public static final Block TURNIP_CROP = registerBlockWithoutBlockItem("turnip_crop",
                new TurnipBlock(FabricBlockSettings.copy(Blocks.BEETROOTS).nonOpaque()), ModItemGroups.MORE_WEAPONRY);


        public static final Block PINK_ROSE = registerBlock("pink_rose",
                new FlowerBlock(StatusEffects.GLOWING, 8,
                        FabricBlockSettings.copy(Blocks.PINK_TULIP).nonOpaque()));

        public static final Block POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
                new FlowerPotBlock(ModBlocks.PINK_ROSE, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()), ModItemGroups.MORE_WEAPONRY);


        //public static final Block ORICHALCUM_BLASTER = registerBlock("orichalcum_blaster",
                //new OrichalcumBlasterBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()));

        public static final Block HONEY_FLUID_BLOCK = registerBlockWithoutBlockItem("honey_fluid_block",
                new OrichalcumFluidBlock(ModFluids.HONEY_STILL, FabricBlockSettings.of(Material.WATER)
                        .noCollision().nonOpaque().dropsNothing()), ModItemGroups.MORE_WEAPONRY);





    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup moreWeaponry){
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(RubyItemGroup.RUBY)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + Main.MOD_ID);
    }
}//}

package net.fabricmc.tutorial.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.tutorial.Main;
import net.fabricmc.tutorial.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORICHALCUM_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_blocks"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_ITEMS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_items"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_TOOLS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_tools"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_WEAPONS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_weapons"),
            () -> new ItemStack(ModItems.ORICHALCUM_WEAPONS));

    public static final ItemGroup ORICHALCUM_ARMOR = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_armor"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_FOOD = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_food"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_MISC = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_misc"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_USELESS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_useless"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM_PLANTS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum_plants"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup ORICHALCUM = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "orichalcum"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));

    public static final ItemGroup MORE_WEAPONRY = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "more_weaponry"),
            () -> new ItemStack(ModBlocks.MOON_STONE_DUST_BLOCK));
}

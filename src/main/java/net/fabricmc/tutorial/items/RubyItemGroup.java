package net.fabricmc.tutorial.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.tutorial.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RubyItemGroup {

    public static final ItemGroup RUBY = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "ruby"),
            () -> new ItemStack(ModItems.RUBY));


    public static void registerModItemGroup() {
        System.out.println("Registering Mod Item for " + Main.MOD_ID);
    }
}


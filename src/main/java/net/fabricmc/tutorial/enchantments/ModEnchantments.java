package net.fabricmc.tutorial.enchantments;

import net.fabricmc.tutorial.Main;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    public static Enchantment THUNDERING = register("thundering",
            new ThunderingEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.TRIDENT));

    public static Enchantment EVOKERS_REVENGE = register("evokers_revenge",
            new EvokersRevengeEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON));

    public static Enchantment AUTO_MENDING = register("auto_mending",
            new AutoMendingEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.ARMOR_CHEST));

    public static Enchantment POWER_OF_THE_WITHER = register("power_of_the_wither",
            new PowerOfTheWitherEnchantment(Enchantment.Rarity.RARE,
                    EnchantmentTarget.BOW));

    private static Enchantment STRAY_BONAGE = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("moreweaponry", "stray_bonage"),
            new StrayBonageEnchantment()
    );


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Main.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering ModEnchantments for " + Main.MOD_ID);
    }
}

package net.fabricmc.tutorial.items;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    
    GLIMMERING_AMETHYST(MiningLevels.DIAMOND, 1014, 6.0f, 2f, 23, () -> Ingredient.ofItems(ModItems.GLIMMERING_AMETHYST)),
    REFINED_MOON_STONE(MiningLevels.DIAMOND, 1788, 8.5f, 3f, 17, () -> Ingredient.ofItems(ModItems.REFINED_MOON_STONE)),
    OG_NETHERITE(MiningLevels.NETHERITE, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    OG_DIAMOND(MiningLevels.DIAMOND, 1561, 8.0f, 3.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    BLACKSTONE_METAL(MiningLevels.NETHERITE, 2176, 9.5f, 5.0f, 13, () -> Ingredient.ofItems(ModItems.BLACKSTONE_INGOT)),
    GUARDIAN_SCALE(MiningLevels.NETHERITE, 2458, 10.0f, 7.0f, 16, () -> Ingredient.ofItems(ModItems.GUARDIAN_SCALE)),
    ELDER_GUARDIAN_SCALE(MiningLevels.NETHERITE, 2986, 11.0f, 8.0f, 17, () -> Ingredient.ofItems(ModItems.ELDER_GUARDIAN_SCALE)),
    HELLFIRE(MiningLevels.NETHERITE, 3182, 12.0f, 17.0f, 14, () -> Ingredient.ofItems(ModItems.WITHER_ESSENCE)),
    OG_IRON(MiningLevels.IRON, 250, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    OG_WOOD(MiningLevels.WOOD, 59, 2.0f, 0.0f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    OG_STONE(MiningLevels.STONE, 131, 4.0f, 1.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    OG_GOLD(MiningLevels.WOOD, 32, 12.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}



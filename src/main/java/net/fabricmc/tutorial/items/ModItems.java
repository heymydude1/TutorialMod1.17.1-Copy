package net.fabricmc.tutorial.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.tutorial.Main;
import net.fabricmc.tutorial.block.ModBlocks;
import net.fabricmc.tutorial.config.ModConfigs;
import net.fabricmc.tutorial.fluid.ModFluids;
import net.fabricmc.tutorial.items.custom.*;
import net.fabricmc.tutorial.sounds.ModSounds;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;



public class ModItems<registerModItems> {
    public static final Item BLASTED_AMETHYST = registerItem("blasted_amethyst",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GLIMMERING_AMETHYST = registerItem("glimmering_amethyst",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item MOON_STONE_DUST = registerItem("moon_stone_dust",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item REFINED_MOON_STONE = registerItem("refined_moon_stone",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item HANDLE = registerItem("handle",
            new ModHandleItem(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item KURO_SEEDS = registerItem("kuro_seeds",
            new BlockItem(ModBlocks.KURO_PLANT, new FabricItemSettings().fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item KURO = registerItem("kuro",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item KURO_BREAD = registerItem("kuro_bread",
            new Item(new FabricItemSettings().fireproof().food
                    (new FoodComponent.Builder().alwaysEdible().hunger(10).statusEffect
                                    (new StatusEffectInstance(StatusEffects.ABSORPTION, 20*15), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*20), 1f)
                            .saturationModifier(0.8f).build()).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CURON_BREW = registerItem("curon_brew",
            new ModStewItem(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC).food
                    (new FoodComponent.Builder().alwaysEdible().hunger(16).statusEffect
                                    (new StatusEffectInstance(StatusEffects.BLINDNESS, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*3), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 20*5), 1f)
                            .saturationModifier(1.0f).build()).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item NITRIS_BOWL = registerItem("nitris_bowl",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CURON_FLOWER_PETALS = registerItem("curon_flower_petals",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).statusEffect
                            (new StatusEffectInstance(StatusEffects.WEAKNESS, 20*3), 0.5f)
                    .saturationModifier(1.0f).build()).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CONDENSED_KURO = registerItem("condensed_kuro",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CRUSHED_KURO = registerItem("crushed_kuro",
            new Item(new FabricItemSettings().food
                    (new FoodComponent.Builder().hunger(5).statusEffect
                                    (new StatusEffectInstance(StatusEffects.HASTE, 20*5), 0.5f)
                            .saturationModifier(1.0f).build()).fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_INGOT = registerItem("blackstone_ingot",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item NETHERITE_HANDLE = registerItem("netherite_handle",
            new ModHandleItem(new FabricItemSettings().fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item MARE_DIAMOND = registerItem("mare_diamond",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item AMETHYST_HANDLE = registerItem("amethyst_handle",
            new ModHandleItem(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE = registerItem("guardian_scale",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE = registerItem("elder_guardian_scale",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIANS_EYE = registerItem("elder_guardians_eye",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item PRISMARINE_HANDLE = registerItem("prismarine_handle",
            new ModHandleItem(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item WITHER_ESSENCE = registerItem("wither_essence",
            new ModEssenceItem(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item WITHER_BONE = registerItem("wither_bone",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item PHANTOM_ESSENCE = registerItem("phantom_essence",
            new ModEssenceItem(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item PHANTOM_SCALE = registerItem("phantom_scale",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item PHANTOM_HELMET = registerItem("phantom_helmet",
            new PhantomScaleHelm(ModArmorMaterial.PHANTOM_SCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item HELLFIRE_BROAD_AXE = registerItem("hellfire_broad_axe",
            new ModBroadAxeItem((ToolMaterial) ModToolMaterial.HELLFIRE, 24, -3.0f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CIRTICT_INGOT = registerItem("cirtict_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));


    public static final Item GLIMMERING_SWORD = registerItem("glimmering_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 3, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GLIMMERING_SHOVEL = registerItem("glimmering_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 1, -3f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GLIMMERING_PICKAXE = registerItem("glimmering_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 1, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GLIMMERING_AXE = registerItem("glimmering_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 5, -3f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GLIMMERING_HOE = registerItem("glimmering_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, -1, 0f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GLIMMERING_BATTLEAXE = registerItem("glimmering_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 8, -3.5f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item MOON_STONE_SWORD = registerItem("moon_stone_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 5, -1.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item MOON_STONE_SHOVEL = registerItem("moon_stone_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 1, -2.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item MOON_STONE_PICKAXE = registerItem("moon_stone_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 2, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item MOON_STONE_AXE = registerItem("moon_stone_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 7, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item MOON_STONE_HOE = registerItem("moon_stone_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 0, -0.1f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item MOON_STONE_BATTLEAXE = registerItem("moon_stone_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 10, -3.2f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_SWORD = registerItem("blackstone_metal_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 8, -2f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_SHOVEL = registerItem("blackstone_metal_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 2, -2.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_PICKAXE = registerItem("blackstone_metal_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 3, -2.3f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_AXE = registerItem("blackstone_metal_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 12, -3.4f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_HOE = registerItem("blackstone_metal_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 1, -0.1f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_BATTLEAXE = registerItem("blackstone_metal_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 15, -3.4f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));


    public static final Item NETHERITE_BATTLEAXE = registerItem("netherite_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_NETHERITE, 11, -3.3f,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item DIAMOND_BATTLEAXE = registerItem("diamond_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_DIAMOND, 9, -3.4f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GLIMMERING_HELMET = registerItem("glimmering_helmet",
            new ModElderScaleArmorItem(ModArmorMaterial.GLIMMERING_AMETHYST, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GLIMMERING_CHESTPLATE = registerItem("glimmering_chestplate",
            new ModElderScaleArmorItem(ModArmorMaterial.GLIMMERING_AMETHYST, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GLIMMERING_LEGGINGS = registerItem("glimmering_leggings",
            new ModElderScaleArmorItem(ModArmorMaterial.GLIMMERING_AMETHYST, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GLIMMERING_BOOTS = registerItem("glimmering_boots",
            new ModElderScaleArmorItem(ModArmorMaterial.GLIMMERING_AMETHYST, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item MOON_STONE_HELMET = registerItem("moon_stone_helmet",
            new ModElderScaleArmorItem(ModArmorMaterial.REFINED_MOON_STONE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item MOON_STONE_CHESTPLATE = registerItem("moon_stone_chestplate",
            new ModElderScaleArmorItem(ModArmorMaterial.REFINED_MOON_STONE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item MOON_STONE_LEGGINGS = registerItem("moon_stone_leggings",
            new ModElderScaleArmorItem(ModArmorMaterial.REFINED_MOON_STONE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item MOON_STONE_BOOTS = registerItem("moon_stone_boots",
            new ModElderScaleArmorItem(ModArmorMaterial.REFINED_MOON_STONE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_HELMET = registerItem("blackstone_metal_helmet",
            new ModElderScaleArmorItem(ModArmorMaterial.BLACKSTONE_METAL, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_CHESTPLATE = registerItem("blackstone_metal_chestplate",
            new ModElderScaleArmorItem(ModArmorMaterial.BLACKSTONE_METAL, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_LEGGINGS = registerItem("blackstone_metal_leggings",
            new ModElderScaleArmorItem(ModArmorMaterial.BLACKSTONE_METAL, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_BOOTS = registerItem("blackstone_metal_boots",
            new ModElderScaleArmorItem(ModArmorMaterial.BLACKSTONE_METAL, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_HELMET = registerItem("elder_guardian_scale_helmet",
            new ModElderScaleArmorItem(ModArmorMaterial.ELDER_GUARDIAN_SCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_CHESTPLATE = registerItem("elder_guardian_scale_chestplate",
            new ModElderScaleArmorItem(ModArmorMaterial.ELDER_GUARDIAN_SCALE, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_LEGGINGS = registerItem("elder_guardian_scale_leggings",
            new ModElderScaleArmorItem(ModArmorMaterial.ELDER_GUARDIAN_SCALE, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_BOOTS = registerItem("elder_guardian_scale_boots",
            new ModElderScaleArmorItem(ModArmorMaterial.ELDER_GUARDIAN_SCALE, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_SWORD = registerItem("elder_guardian_scale_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 9, -1.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_SHOVEL = registerItem("elder_guardian_scale_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 4, -2.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_PICKAXE = registerItem("elder_guardian_scale_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_AXE = registerItem("elder_guardian_scale_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 18, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_HOE = registerItem("elder_guardian_scale_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 1, -0.1f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_BATTLEAXE = registerItem("elder_guardian_scale_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 21, -3.2f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_HELMET = registerItem("guardian_scale_helmet",
            new ArmorItem(ModArmorMaterial.GUARDIAN_SCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_CHESTPLATE = registerItem("guardian_scale_chestplate",
            new ArmorItem(ModArmorMaterial.GUARDIAN_SCALE, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_LEGGINGS = registerItem("guardian_scale_leggings",
            new ArmorItem(ModArmorMaterial.GUARDIAN_SCALE, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_BOOTS = registerItem("guardian_scale_boots",
            new ArmorItem(ModArmorMaterial.GUARDIAN_SCALE, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_SWORD = registerItem("guardian_scale_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 9, -1.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_SHOVEL = registerItem("guardian_scale_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 3, -2.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_PICKAXE = registerItem("guardian_scale_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 4, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_AXE = registerItem("guardian_scale_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 14, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_HOE = registerItem("guardian_scale_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 1, -0.1f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_BATTLEAXE = registerItem("guardian_scale_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 19, -3.2f,
                    new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroups.MORE_WEAPONRY)));

   /* public static final Item GLIMMERING_SHIELD = registerItem("glimmering_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(1782).group(ModItemGroups.MORE_WEAPONRY), 20, 23, ModItems.GLIMMERING_AMETHYST));

    public static final Item BLACKSTONE_METAL_SHIELD = registerItem("blackstone_metal_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2476).rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY), 10, 17, ModItems.BLACKSTONE_INGOT));

    public static final Item MOON_STONE_SHIELD = registerItem("moon_stone_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2006).group(ModItemGroups.MORE_WEAPONRY), 15, 19, ModItems.REFINED_MOON_STONE));

    public static final Item GUARDIAN_SCALE_SHIELD = registerItem("guardian_scale_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2938).rarity(Rarity.UNCOMMON).group(ModItemGroups.MORE_WEAPONRY), 8, 17, ModItems.GUARDIAN_SCALE));

    public static final Item ELDER_SCALE_SHIELD  = registerItem("elder_scale_shield",
            new FabricShieldItem().maxDamage(3276).rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY), 7, 18, ModItems.ELDER_GUARDIAN_SCALE));
*/
    public static final Item ELDER_SCALE_TRIDENT = registerItem("elder_scale_trident",
            new ElderScaleTridentItem(new FabricItemSettings().maxDamage(15).rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item THOR_HAMMER_TRIDENT = registerItem("thor_hammer_trident",
            new ThorHammerTridentItem(new FabricItemSettings().maxDamage(15).rarity(Rarity.EPIC).group(ModItemGroups.MORE_WEAPONRY)));


    public static final Item GOLDEN_KNIFE = registerItem("golden_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_GOLD, 2, 1.0f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_STONE, 2, -0.2f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item IRON_KNIFE = registerItem("diamond_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_IRON, 5, 0.3f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item DIAMOND_KNIFE = registerItem("iron_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_DIAMOND, 4, -0.1f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item WOODEN_KNIFE = registerItem("wooden_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_WOOD, 1, -0.3f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_NETHERITE, 7, 0.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item REFINED_MOON_KNIFE = registerItem("refined_moon_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 6, 0.4f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GLIMMERED_AMETHYST_KNIFE = registerItem("glimmered_amethyst_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 5, 0.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_KNIFE = registerItem("blackstone_metal_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 8, 0.6f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_KNIFE = registerItem("guardian_scale_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 8, 0.6f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_KNIFE = registerItem("elder_guardian_scale_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 8, 0.6f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item GOLDEN_BATTLEAXE = registerItem("golden_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_GOLD, 11, -2.9f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item WOODEN_BATTLEAXE = registerItem("wooden_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_WOOD, 8, -3.6f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item STONE_BATTLEAXE = registerItem("stone_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_STONE, 10, -3.5f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item IRON_BATTLEAXE = registerItem("iron_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_IRON, 13, -3.2f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CIRTICT_BATTLEAXE = registerItem("cirtict_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.HELLFIRE, 26, -3.0f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_BATTLEAXE = registerItem("heated_cirtict_battleaxe",
            new HeatedCirtictBattleaxe((ToolMaterial) ModToolMaterial.HELLFIRE, 30, -3.0f,
                    new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLUESTONE_IGNITOR = registerItem("bluestone_ignitor",
            new BluestoneIgnitor(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item BLUESTONE_ROCK = registerItem("bluestone_rock",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item CIRTICT_SCRAP = registerItem("cirtict_scrap",
            new Item(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY)));

    public static final Item WARDENS_STEP_MUSIC_DISC = registerItem("wardens_step_music_disc",
            new ModMusicDiscItem(9, ModSounds.WARDENS_STEP,
                    new FabricItemSettings().maxCount(1).group(ModItemGroups.MORE_WEAPONRY)));

    ;


    public static final Item NITRIS_SIGN = registerItem("nitris_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroups.MORE_WEAPONRY).maxCount(16),
                    ModBlocks.NITRIS_SIGN_BLOCK, ModBlocks.NITRIS_WALL_SIGN_BLOCK));


    public static final Item ELDER_SCALE_BOW = registerItem("elder_scale_bow",
            new BowItem(new FabricItemSettings().maxCount(1).maxDamage(476).group(ModItemGroups.ORICHALCUM_MISC)));

    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_MISC)));

    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_MISC)));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_MISC)));


    //public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            //new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_FOOD).food(OrichalcumFoodComponents.TURNIP)));

    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_MISC)));


    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new OrichalcumPickaxeItem(OrichalcumToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_TOOLS)));
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new OrichalcumAxeItem(OrichalcumToolMaterial.ORICHALCUM, 3, 1f,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_TOOLS)));
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new OrichalcumHoeItem(OrichalcumToolMaterial.ORICHALCUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_TOOLS)));
    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(OrichalcumToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_TOOLS)));
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new OrichalcumSlowingSwordItem(OrichalcumToolMaterial.ORICHALCUM, 3, 3f,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_WEAPONS)));

    //public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel",
            //new ModPaxelItem(ModToolMaterial.ORICHALCUM, 1, 1f,
                    //new FabricItemSettings().group(ModItemGroups.COURSE)));


    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new OrichalcumArmorItem(OrichalcumArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_ARMOR)));
    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new ArmorItem(OrichalcumArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_ARMOR)));
    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings",
            new ArmorItem(OrichalcumArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_ARMOR)));
    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new ArmorItem(OrichalcumArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM_ARMOR)));

    public static final Item ORICHALCUM_HORSE_ARMOR = registerItem("orichalcum_horse_armor",
            new HorseArmorItem(15, "orichalcum",
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM)));

    public static final Item TURNIP_SEEDS = registerItem("turnip_seeds",
            new AliasedBlockItem(ModBlocks.TURNIP_CROP,
                    new FabricItemSettings().group(ModItemGroups.ORICHALCUM)));

    //public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            //new ModMusicDiscItem(9, ModSounds.BAR_BRAWL,
                    //new FabricItemSettings().group(ModItemGroups.COURSE).maxCount(1)));


    public static final Item ORICHALCUM_STAFF = registerItem("orichalcum_staff",
            new Item(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_USELESS).maxCount(1)));

    public static final Item ORICHALCUM_BOW = registerItem("orichalcum_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroups.ORICHALCUM_WEAPONS).maxCount(1)));

    public static final Item HONEY_BUCKET = registerItem("honey_bucket",
            new BucketItem(ModFluids.HONEY_STILL, new FabricItemSettings().group(ModItemGroups.ORICHALCUM_MISC).maxCount(1)));
    
    //public static final Item WOODEN_DOWSER = registerItem("wooden_dowser",
    //       new Item(new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item OPAL = registerItem("opal",
            new Item(new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build())
            .group(RubyItemGroup.RUBY)));

    public static final Item Wooden_DOWSING_ROD = registerItem("wooden_dowsing_rod",
            new WoodenDowsingRodItem(new FabricItemSettings().group(RubyItemGroup.RUBY)
                    .maxDamage(ModConfigs.MAX_DAMAGE_WOODEN_DOWSING_ROD)));

//    public static final Item THOR_HAMMER_TRIDENT = registerItem("thor_hammor_trident",
//            new ThorHammorTridentItem(new FabricItemSettings().maxDamage(15).rarity(Rarity.EPIC).group(ItemGroup.MISC)));


    public static final Item RUBY_DOWSING_ROD = registerItem("ruby_dowsing_rod",
            new RubyDowsingRodItem(new FabricItemSettings().group(RubyItemGroup.RUBY)
                    .maxDamage(ModConfigs.MAX_DAMAGE_RUBY_DOWSING_ROD)));

    public static final Item IRON_WOOL = registerItem("iron_wool",
            new Item(new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(RubyToolMaterial.RUBY, 2, 1f, (new FabricItemSettings()
                    .group(RubyItemGroup.RUBY))));

    public static final Item REDWOOD_STICK = registerItem("redwood_stick",
                new Item(new FabricItemSettings().group(RubyItemGroup.RUBY)));





    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(RubyToolMaterial.RUBY, 0, 1f,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new RubyPickaxeItem(RubyToolMaterial.RUBY, 0, 1f,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new RubyAxeItem(RubyToolMaterial.RUBY, 4, -1f,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new RubyHoeItem(RubyToolMaterial.RUBY, 0, 0f,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new RubyArmorItem(RubyArmorMaterial.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor",
            new HorseArmorItem(7, "ruby",
                    new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().group(RubyItemGroup.RUBY)));

    public static final Item ORICHALCUM_WEAPONS = registerItem("orichalcum_weapons",
            new Item(new FabricItemSettings()));

    public static final Item PEPPER_SEEDS = registerItem("pepper_seeds",
            new AliasedBlockItem(ModBlocks.PEPPER_PLANT, new FabricItemSettings().group(RubyItemGroup.RUBY)));

    //public static final ModTridentItem THOR_HAMMER = (ModTridentItem) registerItem("thor_hammer",
            //new net.fabricmc.tutorial.items.custom.ModTridentItem(new FabricItemSettings().maxDamage(250).group(RubyItemGroup.RUBY)));

    public static void registerModItems() {

    }

    {
        System.out.println("Registering Mod Items for " + Main.MOD_ID);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);



        //public static final Item OBSICOAL_INGOT = new NewItem(new FabricItemSettings()
        //.group_(ItemGroup.MISC));
    }


}

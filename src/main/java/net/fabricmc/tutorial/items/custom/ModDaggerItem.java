package net.fabricmc.tutorial.items.custom;

import net.minecraft.item.ToolMaterial;

public class ModDaggerItem extends ModKnifeItem{
    public ModDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}

package net.fabricmc.tutorial.items.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class RubyAxeItem extends AxeItem {
    public RubyAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

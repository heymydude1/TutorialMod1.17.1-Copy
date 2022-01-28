package net.fabricmc.tutorial.items.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class OrichalcumHoeItem extends HoeItem {
    public OrichalcumHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

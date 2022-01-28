package net.fabricmc.tutorial.items.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class OrichalcumPickaxeItem extends PickaxeItem {
    public OrichalcumPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

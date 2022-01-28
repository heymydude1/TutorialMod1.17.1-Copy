package net.fabricmc.tutorial.items.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class OrichalcumAxeItem extends AxeItem {
    public OrichalcumAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}

package net.fabricmc.tutorial.mixin;

import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TridentEntity.class)
public abstract class TridentEntityMixin {
    @Shadow private ItemStack tridentStack;

    protected TridentEntityMixin(ItemStack tridentStack) {
        this.tridentStack = tridentStack;
    }
}

package net.fabricmc.tutorial.mixin;

import net.fabricmc.tutorial.entity.ElderScaleTridentEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends EntityMixin {
    private @Nullable Consumer<ItemStack> impaled$dropSink;

    @Inject(method = "drop", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;shouldDropLoot()Z"))
    private void drop(DamageSource source, CallbackInfo ci) {
        Entity directSource = source.getSource();

        if (directSource instanceof ElderScaleTridentEntity) {
            this.impaled$dropSink = ((ElderScaleTridentEntity) directSource).getStackFetcher();
        }
    }

    @Inject(method = "drop", at = @At("RETURN"))
    private void endDrop(DamageSource source, CallbackInfo ci) {
        this.impaled$dropSink = null;
    }

}

package net.fabricmc.tutorial.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class EvokersRevengeEnchantment extends Enchantment {
    public EvokersRevengeEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient()) {
            ServerWorld world = ((ServerWorld) user.world);
            PlayerEntity player = ((PlayerEntity) user);
            BlockPos position = target.getBlockPos();

            if (level == 1) {
                EntityType.EVOKER_FANGS.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            if (level == 2) {
                EntityType.EVOKER_FANGS.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);

            }
            if(level == 3) {
                EntityType.EVOKER_FANGS.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }


            super.onTargetDamaged(user, target, level);
        }

    }

    @Override
    public int getMaxLevel() {
        return 5;
    }
}

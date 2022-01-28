package net.fabricmc.tutorial.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;


public class NewItem extends Item {

    public NewItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        playerEntity.setVelocity(playerEntity.getVelocity().x, 0.5, playerEntity.getVelocity().z);
        playerEntity.playSound(SoundEvents.BLOCK_ANCIENT_DEBRIS_BREAK, 1.0F, 1.0F);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
    {
    // Basic Info
                tooltip.add(new TranslatableText("this is fnfs s jf"));



                if(Screen.hasShiftDown())
                {
                    tooltip.add(new TranslatableText("this is fnfs s jf").formatted(Formatting.BLACK));

                }
                else
                {
                    tooltip.add(new TranslatableText("press shift for additonal info").formatted(Formatting.BLACK));
                }

    }
}

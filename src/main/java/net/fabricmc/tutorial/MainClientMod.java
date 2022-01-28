package net.fabricmc.tutorial;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.tutorial.block.ModBlocks;
import net.fabricmc.tutorial.screen.CropCutterScreen;
import net.fabricmc.tutorial.screen.ModScreenHandlers;
import net.fabricmc.tutorial.util.ModRenderHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.StickyKeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;


@Environment(EnvType.CLIENT)
public class MainClientMod implements ClientModInitializer{
    public static final Identifier PacketID = new Identifier(Main.MOD_ID, "spawn_packet");



    @Override
    public void onInitializeClient() {
        ModRenderHelper.setRenderLayers();
        ScreenRegistry.register(ModScreenHandlers.CROP_CUTTER_SCREEN_HANDLER, CropCutterScreen::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_NIGHT_CURON, RenderLayer.getCutout());


                KeyBinding binding1 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.fabric-key-binding-api-v1-testmod.test_keybinding_1", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_P, "key.category.first.test"));
                KeyBinding binding2 = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.fabric-key-binding-api-v1-testmod.test_keybinding_2", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_U, "key.category.second.test"));
                KeyBinding stickyBinding = KeyBindingHelper.registerKeyBinding(new StickyKeyBinding("key.fabric-key-binding-api-v1-testmod.test_keybinding_sticky", GLFW.GLFW_KEY_R, "key.category.first.test", () -> true));
                KeyBinding duplicateBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.fabric-key-binding-api-v1-testmod.test_keybinding_duplicate", GLFW.GLFW_KEY_LEFT_SHIFT, "key.category.first.test"));

                ClientTickEvents.END_CLIENT_TICK.register(client -> {
                    while (binding1.wasPressed()) {
                        client.player.sendMessage(new LiteralText("Key 1 was pressed!"), false);
                    }

                    while (binding2.wasPressed()) {
                        client.player.sendMessage(new LiteralText("Key 2 was pressed!"), false);
                    }

                    if (stickyBinding.isPressed()) {
                        client.player.sendMessage(new LiteralText("Sticky Key was pressed!"), false);
                    }

                    while (duplicateBinding.wasPressed()) {
                        client.player.sendMessage(new LiteralText("Duplicate Key was pressed!"), false);

                    }
                });
            }
        }






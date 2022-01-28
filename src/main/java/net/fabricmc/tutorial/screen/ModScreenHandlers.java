package net.fabricmc.tutorial.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.fabricmc.tutorial.Main;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

    public class ModScreenHandlers {
        public static ScreenHandlerType<CropCutterScreenHandler> CROP_CUTTER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Main.MOD_ID, "crop_cutter_block"),
                        CropCutterScreenHandler::new);
    }
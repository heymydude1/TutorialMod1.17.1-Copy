package net.fabricmc.tutorial.block;

import net.fabricmc.tutorial.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {
    public static final SignType NITRIS =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("nitris"));
}

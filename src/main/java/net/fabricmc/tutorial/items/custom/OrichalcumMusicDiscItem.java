package net.fabricmc.tutorial.items.custom;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class OrichalcumMusicDiscItem extends MusicDiscItem {
    public OrichalcumMusicDiscItem(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings);
    }
}

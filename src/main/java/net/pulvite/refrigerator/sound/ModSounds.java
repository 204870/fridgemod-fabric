package net.pulvite.refrigerator.sound;

import net.minecraft.client.sound.Sound;
import net.pulvite.refrigerator.refrigeratormod;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent WATCH_OUT = registerSoundEvent("watch_out");
    public static SoundEvent MUSIC_COLD = registerSoundEvent("music_cold1");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(refrigeratormod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
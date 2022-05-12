package net.pulvite.refrigerator.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pulvite.refrigerator.item.custom.*;
import net.pulvite.refrigerator.refrigeratormod;
import net.pulvite.refrigerator.sound.ModSounds;

public class ModItems {

    //test stuffs
    public static final Item REFRIGERATOR_DOOR = registerItem("refrigerator_door", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //tools
    public static final Item FROZEN_SWORD = registerItem("frozen_sword", new SwordItem(ModToolMaterials.ICE,2, 1f,
            new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item FROZEN_PICKAXE = registerItem("frozen_pickaxe", new ModPickaxeItem(ModToolMaterials.ICE,1, 0f,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FROZEN_AXE = registerItem("frozen_axe", new ModAxeItem(ModToolMaterials.ICE,3, -1f,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FROZEN_HOE = registerItem("frozen_hoe", new ModHoeItem(ModToolMaterials.ICE,0, 0.5f,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item FROZEN_SHOVEL = registerItem("frozen_shovel", new ModShovelItem(ModToolMaterials.ICE,0, 0.5f,
            new FabricItemSettings().group(ItemGroup.TOOLS)));

    //music discs
    public static final Item WATCH_OUT_MUSIC_DISC = registerItem("watch_out_music_disc", new ModMusicDiscItem(7, ModSounds.WATCH_OUT,
            new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));
    public static final Item CREEP_MUSIC_DISC = registerItem("creep_music_disc", new ModMusicDiscItem(7, ModSounds.CREEP,
            new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(refrigeratormod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        refrigeratormod.LOGGER.info("Registering Mod Items for refrigeratormod");
    }

}

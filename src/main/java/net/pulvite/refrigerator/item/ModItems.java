package net.pulvite.refrigerator.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pulvite.refrigerator.refrigeratormod;

public class ModItems {
    public static final Item REFRIGERATOR_DOOR = registerItem("refrigerator_door", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(refrigeratormod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        refrigeratormod.LOGGER.info("Registering Mod Items for refrigeratormod");
    }

}

package net.pulvite.refrigerator.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.pulvite.refrigerator.refrigeratormod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block REFRIGERATOR_BLOCK = registerBlock("refrigerator_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ItemGroup.MISC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(refrigeratormod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(refrigeratormod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        refrigeratormod.LOGGER.info("Registering ModBlocks for " + refrigeratormod.MOD_ID);
    }
}

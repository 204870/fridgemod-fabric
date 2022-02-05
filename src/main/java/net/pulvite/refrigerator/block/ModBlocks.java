package net.pulvite.refrigerator.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.entity.BlockEntityType;
import net.pulvite.refrigerator.block.entity.RefrigeratorBlockEntity;
import net.pulvite.refrigerator.refrigeratormod;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.pulvite.refrigerator.refrigeratormod.MOD_ID;

public class ModBlocks {

    public static final Block REFRIGERATOR = registerBlock("refrigerator",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ItemGroup.MISC);
    public static final BlockEntityType REFRIGERATOR_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "Refrigerator"), BlockEntityType.Builder.create(RefrigeratorBlockEntity::new, REFRIGERATOR).build(null));




    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        refrigeratormod.LOGGER.info("Registering Mod Blocks for refrigeratormod");
    }
}

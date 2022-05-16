package net.pulvite.refrigerator.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pulvite.refrigerator.refrigeratormod;

public class ModBlocks {


    public static final Block REFINED_ICE = registerBlock("refined_ice",
            new Block(FabricBlockSettings.of(Material.STONE).nonOpaque().slipperiness(1.25f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().hardness(25.0f).resistance(600.0f)), ItemGroup.MISC);

    /*
    public static final Block ICE = Blocks.register("ice",
            new IceBlock(AbstractBlock.Settings.of(Material.ICE).slipperiness(0.98f).ticksRandomly().strength(0.5f).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning((state, world, pos, entityType) -> entityType == EntityType.POLAR_BEAR)));
     */

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(refrigeratormod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(refrigeratormod.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        refrigeratormod.LOGGER.info("Registering ModBlocks for " + refrigeratormod.MOD_ID);
    }
}

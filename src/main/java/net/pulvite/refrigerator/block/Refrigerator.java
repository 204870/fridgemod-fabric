package net.pulvite.refrigerator.block;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.swing.text.html.BlockView;

public class Refrigerator extends AbstractFurnaceBlock {
    public Refrigerator(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockView world) {
        return new RefrigeratorBlockEntity();
    }

    @Override
    public void openScreen(World world, BlockPos pos, PlayerEntity player){
        //This is called by the onUse method inside AbstractFurnaceBlock so
        //it is a little bit different of how you open the screen for normal container
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof RefrigeratorBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
    }
}

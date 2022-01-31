package net.pulvite.refrigerator.block.entity;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

public class RefrigeratorBlockEntity extends AbstractFurnaceBlockEntity {
    public RefrigeratorBlockEntity(){
        super(RefrigerationRecipe.TEST_REFRIGERATOR_BLOCK_ENTITY), RefrigerationRecipe.TEST_RECIPE_TYPE;)
    }

    @Override
    public Text getContainerName(){
        return Text.of("Refrigerator");
    }

    @Override
    public ScreenHandler createScreenHandler(int syncID, PlayerInventory, playerInventory){
        return new RefrigeratorScreenHandler(syncID, playerInventory, this, this.propertyDelegate);
    }
}

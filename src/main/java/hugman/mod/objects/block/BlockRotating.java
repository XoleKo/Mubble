package hugman.mod.objects.block;

import hugman.mod.Reference;
import hugman.mod.init.MubbleBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class BlockRotating extends Block
{	
    public BlockRotating()
    {
        super(Properties.from(Blocks.STONE));
        setRegistryName(Reference.MOD_ID, "rotating_block");
        MubbleBlocks.register(this);
    }
    
    @Override
    public void onLanded(IBlockReader worldIn, Entity entityIn)
    {
    	if(entityIn.isSneaking() && entityIn.motionY < -0.1)
    	{
    		if(!entityIn.world.isRemote) entityIn.world.destroyBlock(new BlockPos(entityIn).down(), false);
    		entityIn.motionY = 0.625D;
    	}
    }
}

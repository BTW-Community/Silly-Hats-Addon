//Based on FCBlockSkull

package net.minecraft.src;

import java.util.Random;

public class SHBlockHat extends BlockContainer
{
    protected SHBlockHat(int par1)
    {
        super(par1, Material.circuits);
        
        SetAxesEffectiveOn( true );
        
        setHardness( 1F );
        
        InitBlockBounds( 0.25D, 0D, 0.25D, 0.75D, 0.5D, 0.75D );
        
        setStepSound( soundStoneFootstep );
        
        setUnlocalizedName( "SHBlockHat" );
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return -1;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
	@Override
    public void setBlockBoundsBasedOnState( IBlockAccess blockAccess, int i, int j, int k )
    {
    	// override to deprecate parent
    }
	
    @Override
    public AxisAlignedBB GetBlockBoundsFromPoolBasedOnState( 
    	IBlockAccess blockAccess, int i, int j, int k )
    {
        int iFacing = blockAccess.getBlockMetadata(i, j, k) & 7;

        switch ( iFacing )
        {
            case 2:
            	
            	return AxisAlignedBB.getAABBPool().getAABB(         	
            		0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F );

            case 3:
            	
            	return AxisAlignedBB.getAABBPool().getAABB(         	
            		0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);

            case 4:
            	
            	return AxisAlignedBB.getAABBPool().getAABB(         	
            		0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);

            case 5:
            	
            	return AxisAlignedBB.getAABBPool().getAABB(         	
            		0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
                
            default:
            	
            	return AxisAlignedBB.getAABBPool().getAABB(         	
            		0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
        }
    }
    
    
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool( World world, int i, int j, int k )
    {
    	return GetBlockBoundsFromPoolBasedOnState( world, i, j, k ).offset( i, j, k );
    }
    
    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        int var7 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var7, 2);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new SHTileEntityHat();
    }

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return SHMod.hat.itemID;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        TileEntity var5 = par1World.getBlockTileEntity(par2, par3, par4);
        return var5 != null && var5 instanceof SHTileEntityHat ? ((SHTileEntityHat)var5).getHatType() : super.getDamageValue(par1World, par2, par3, par4);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {}

    /**
     * Called when the block is attempted to be harvested
     */
    public void onBlockHarvested(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer)
    {
        if (par6EntityPlayer.capabilities.isCreativeMode)
        {
            par5 |= 8;
            par1World.setBlockMetadataWithNotify(par2, par3, par4, par5, 4);
        }

        super.onBlockHarvested(par1World, par2, par3, par4, par5, par6EntityPlayer);
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        if (!par1World.isRemote)
        {
            if ((par6 & 8) == 0)
            {
                ItemStack var7 = new ItemStack(SHMod.hat.itemID, 1, this.getDamageValue(par1World, par2, par3, par4));
                SHTileEntityHat var8 = (SHTileEntityHat)par1World.getBlockTileEntity(par2, par3, par4);

                this.dropBlockAsItem_do(par1World, par2, par3, par4, var7);
            }

            super.breakBlock(par1World, par2, par3, par4, par5, par6);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return SHMod.hat.itemID;
    }

    private boolean func_82528_d(World par1World, int par2, int par3, int par4, int par5)
    {
        if (par1World.getBlockId(par2, par3, par4) != this.blockID)
        {
            return false;
        }
        else
        {
            TileEntity var6 = par1World.getBlockTileEntity(par2, par3, par4);
            return var6 != null && var6 instanceof SHTileEntityHat ? ((SHTileEntityHat)var6).getHatType() == par5 : false;
        }
    }

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister) {}

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return Block.slowSand.getBlockTextureFromSide(par1);
    }

    /**
     * Gets the icon name of the ItemBlock corresponding to this block. Used by hoppers.
     */
    public String getItemIconName()
    {
        return SHItemHat.textureNames[0];
    }
    
    @Override
	public boolean IsBlockRestingOnThatBelow( IBlockAccess blockAccess, int i, int j, int k )
	{
        int iMetadata = blockAccess.getBlockMetadata( i, j, k );
        
        return iMetadata == 1;
	}
	
    @Override
	public boolean CanRotateOnTurntable( IBlockAccess blockAccess, int i, int j, int k )
	{
		return true;
	}
	
    @Override
	public boolean RotateAroundJAxis( World world, int i, int j, int k, boolean bReverse )
	{
        TileEntity tileEnt = world.getBlockTileEntity( i, j, k );
    	
        if ( tileEnt != null && tileEnt instanceof SHTileEntityHat)
        {        	
        	SHTileEntityHat skullEnt = (SHTileEntityHat)tileEnt;
        	
        	int iSkullFacing = skullEnt.GetSkullRotationServerSafe();
        	
        	if ( bReverse )
        	{
        		iSkullFacing += 4;
        		
        		if ( iSkullFacing > 15 )
        		{
        			iSkullFacing -= 16;
        		}
        	}
        	else
        	{
        		iSkullFacing -= 4;
        		
        		if ( iSkullFacing < 0 )
        		{
        			iSkullFacing += 16;
        		}
        	}
        	
        	skullEnt.setHatRotation( iSkullFacing );
        	
	        world.markBlockForUpdate( i, j, k );
	        
	        return true;
        }
        
        return false;
	}
	
    @Override
    public ItemStack GetStackRetrievedByBlockDispenser( World world, int i, int j, int k )
    {
		// don't allow skulls to be retrieved because their code is a mess
		
    	return null;
    }
    
	//----------- Client Side Functionality -----------//
    
    @Override
    public boolean RenderBlock( RenderBlocks renderBlocks, int i, int j, int k )
    {
    	return false;
    }    
}

package btw.community.sockthing.block.blocks;

import btw.block.blocks.SkullBlock;
import btw.community.sockthing.block.tileentity.HatTileEntity;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.item.items.HatItem;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.minecraft.src.*;

import java.util.Random;

public class HatBlock extends BlockContainer {
    public HatBlock(int par1)
    {
        super(par1, Material.circuits);

        setAxesEffectiveOn( true );

        setHardness( 1F );

        initBlockBounds( 0.25D, 0D, 0.25D, 0.75D, 0.5D, 0.75D );

        setStepSound( soundStoneFootstep );

        setUnlocalizedName( "SHBlockHat" );
    }

    @Override
    public TileEntity createNewTileEntity(World var1) {
        return new HatTileEntity();
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
    public AxisAlignedBB getBlockBoundsFromPoolBasedOnState(
            IBlockAccess blockAccess, int i, int j, int k )
    {
        int hatFacing = blockAccess.getBlockMetadata(i, j, k) & 7;
        int headFacing = blockAccess.getBlockMetadata(i, j - 1, k) & 7;

        TileEntity te = blockAccess.getBlockTileEntity(i, j, k);
        TileEntity teBelow = blockAccess.getBlockTileEntity(i, j - 1, k);

        if (te instanceof HatTileEntity)
        {
            HatTileEntity hat = (HatTileEntity) te;
            if (hat.getYShift() != 0)
            {
                if (teBelow instanceof MobHeadTileEntity)
                {
                    MobHeadTileEntity head = (MobHeadTileEntity) teBelow;
                    if (MobHeadsUtil.isVillagerType(head.getHeadType()))
                    {
                        switch ( headFacing )
                        {
                            default:
                                return AxisAlignedBB.getAABBPool().getAABB(
                                        0.25F, -0.25F - 2/16F, 0.25F,
                                        0.75F, 0.25F - 2/16F, 0.75F);

                            case 2:
                                return AxisAlignedBB.getAABBPool().getAABB(
                                        0.25F, -0.25F + 2/16F, 0.5F,
                                        0.75F, 0.25F + 2/16F, 1.0F);
                            case 3:
                                return AxisAlignedBB.getAABBPool().getAABB(
                                        0.25F, -0.25F + 2/16F, 0.0F,
                                        0.75F, 0.25F + 2/16F, 0.5F);
                            case 4:
                                return AxisAlignedBB.getAABBPool().getAABB(
                                        0.5F, -0.25F + 2/16F, 0.25F,
                                        1.0F, 0.25F + 2/16F, 0.75F);
                            case 5:
                                return AxisAlignedBB.getAABBPool().getAABB(
                                        0.0F, -0.25F + 2/16F, 0.25F,
                                        0.5F, 0.25F + 2/16F, 0.75F);
                        }
                    }

                    switch ( headFacing )
                    {
                        default:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, -0.25F - 4/16F, 0.25F,
                                    0.75F, 0.25F - 4/16F, 0.75F);

                        case 2:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, -0.25F, 0.5F,
                                    0.75F, 0.25F, 1.0F);
                        case 3:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, -0.25F, 0.0F,
                                    0.75F, 0.25F, 0.5F);
                        case 4:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.5F, -0.25F, 0.25F,
                                    1.0F, 0.25F, 0.75F);
                        case 5:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.0F, -0.25F, 0.25F,
                                    0.5F, 0.25F, 0.75F);
                    }
                }
                else if (teBelow instanceof TileEntitySkull)
                {
                    switch ( headFacing )
                    {
                        default:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, -0.25F - 4/16F, 0.25F,
                                    0.75F, 0.25F - 4/16F, 0.75F);

                        case 2:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, -0.25F, 0.5F,
                                    0.75F, 0.25F, 1.0F);
                        case 3:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, -0.25F, 0.0F,
                                    0.75F, 0.25F, 0.5F);
                        case 4:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.5F, -0.25F, 0.25F,
                                    1.0F, 0.25F, 0.75F);
                        case 5:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.0F, -0.25F, 0.25F,
                                    0.5F, 0.25F, 0.75F);
                    }
                }
                else {
                    switch ( hatFacing )
                    {
                        case 2:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, 0.25F, 0.5F,
                                    0.75F, 0.75F, 1.0F );

                        case 3:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, 0.25F, 0.0F,
                                    0.75F, 0.75F, 0.5F);

                        case 4:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.5F, 0.25F, 0.25F,
                                    1.0F, 0.75F, 0.75F);

                        case 5:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.0F, 0.25F, 0.25F,
                                    0.5F, 0.75F, 0.75F);

                        default:
                            return AxisAlignedBB.getAABBPool().getAABB(
                                    0.25F, 0.0F, 0.25F,
                                    0.75F, 0.5F, 0.75F);
                    }
                }
            }
        }

        switch ( hatFacing )
        {
            case 2:
                return AxisAlignedBB.getAABBPool().getAABB(
                        0.25F, 0.25F, 0.5F,
                        0.75F, 0.75F, 1.0F );

            case 3:
                return AxisAlignedBB.getAABBPool().getAABB(
                        0.25F, 0.25F, 0.0F,
                        0.75F, 0.75F, 0.5F);

            case 4:
                return AxisAlignedBB.getAABBPool().getAABB(
                        0.5F, 0.25F, 0.25F,
                        1.0F, 0.75F, 0.75F);

            case 5:
                return AxisAlignedBB.getAABBPool().getAABB(
                        0.0F, 0.25F, 0.25F,
                        0.5F, 0.75F, 0.75F);

            default:
                return AxisAlignedBB.getAABBPool().getAABB(
                        0.25F, 0.0F, 0.25F,
                        0.75F, 0.5F, 0.75F);
        }
    }


    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool( World world, int i, int j, int k )
    {
        return null; //getBlockBoundsFromPoolBasedOnState( world, i, j, k ).offset( i, j, k );
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving player, ItemStack itemStack)
    {
        int var7 = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, var7, 2);

        int blockIDBelow = world.getBlockId(x, y - 1, z);
        Block blockBelow = Block.blocksList[blockIDBelow];
        HatTileEntity hat = (HatTileEntity) world.getBlockTileEntity(x, y, z);

        if (hat != null && hat instanceof HatTileEntity)
        {
            if (blockBelow instanceof SkullBlock)
            {
                hat.setYShift( -7/32F);
            }
            else hat.setYShift( 0/16F );
        }
    }

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return SHItems.hat.itemID;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        TileEntity var5 = par1World.getBlockTileEntity(par2, par3, par4);
        return var5 != null && var5 instanceof HatTileEntity ? ((HatTileEntity)var5).getHatType() : super.getDamageValue(par1World, par2, par3, par4);
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
                ItemStack var7 = new ItemStack(SHItems.hat.itemID, 1, this.getDamageValue(par1World, par2, par3, par4));
                HatTileEntity var8 = (HatTileEntity)par1World.getBlockTileEntity(par2, par3, par4);

                this.dropBlockAsItem_do(par1World, par2, par3, par4, var7);
            }

            super.breakBlock(par1World, par2, par3, par4, par5, par6);
        }
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int neighbourBlockID) {
        int facing = world.getBlockMetadata(x,y,z) & 7;

        //System.out.println("hat is facing " + facing);

        if (facing == 1)
        {
            if (world.getBlockId(x,y - 1,z) == 0) world.setBlockToAir(x,y,z);
        }
        else
        {
            switch (facing)
            {
                case 2:
                    if (world.getBlockId(x,y,z + 1) == 0) world.setBlockToAir(x,y,z);
                    break;
                case 3:
                    if (world.getBlockId(x,y,z - 1) == 0) world.setBlockToAir(x,y,z);
                    break;
                case 4:
                    if (world.getBlockId(x + 1,y,z) == 0) world.setBlockToAir(x,y,z);
                    break;
                case 5:
                    if (world.getBlockId(x - 1,y,z) == 0) world.setBlockToAir(x,y,z);
                    break;
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return SHItems.hat.itemID;
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
            return var6 != null && var6 instanceof HatTileEntity ? ((HatTileEntity)var6).getHatType() == par5 : false;
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
        return HatsUtil.hatTypes[0];
    }

    @Override
    public boolean isBlockRestingOnThatBelow( IBlockAccess blockAccess, int i, int j, int k )
    {
        int iMetadata = blockAccess.getBlockMetadata( i, j, k );

        return iMetadata == 1;
    }

    @Override
    public boolean canRotateOnTurntable( IBlockAccess blockAccess, int i, int j, int k )
    {
        return true;
    }

    @Override
    public boolean rotateAroundJAxis( World world, int i, int j, int k, boolean bReverse )
    {
        TileEntity tileEnt = world.getBlockTileEntity( i, j, k );

        if ( tileEnt != null && tileEnt instanceof HatTileEntity)
        {
            HatTileEntity skullEnt = (HatTileEntity)tileEnt;

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
    public ItemStack getStackRetrievedByBlockDispenser(World world, int i, int j, int k )
    {
        // don't allow skulls to be retrieved because their code is a mess

        return null;
    }

    //----------- Client Side Functionality -----------//

    @Override
    public boolean renderBlock( RenderBlocks renderBlocks, int i, int j, int k )
    {
        return false;
    }
}

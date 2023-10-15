package btw.community.sockthing.block.blocks;

import btw.community.sockthing.utils.MobHeadsUtil;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.item.items.MobHeadItem;
import net.minecraft.src.*;

import java.util.Random;

public class MobHeadBlock extends BlockContainer
{
    public MobHeadBlock(int blockID)
    {
        super(blockID, Material.circuits);
        setAxesEffectiveOn( true );

        setHardness( 1F );

        initBlockBounds( 0.25D, 0D, 0.25D, 0.75D, 0.5D, 0.75D );

        setStepSound( soundStoneFootstep );

        setUnlocalizedName( "SHBlockMobHead" );
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

    @Override
    public AxisAlignedBB getBlockBoundsFromPoolBasedOnState(IBlockAccess blockAccess, int x, int y, int z )
    {
        return this.GetBlockBoundsBasedOnState(blockAccess, x, y, z);
    }

    private AxisAlignedBB GetBlockBoundsBasedOnState( IBlockAccess blockAccess, int x, int y, int z )
    {
        AxisAlignedBB box = new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);

        MobHeadTileEntity mobhead = (MobHeadTileEntity) blockAccess.getBlockTileEntity(x,y,z);
        float extraHeadHeight = 0F;

        if (mobhead != null)
        {
            int type = mobhead.getHeadType();
            if ( MobHeadsUtil.isVillagerType(type) )
            {
                extraHeadHeight = 2/16F;
            }
        }

        int metaDir = blockAccess.getBlockMetadata(x, y, z) & 7;

        if (metaDir == 1)
        {
            box = new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F + extraHeadHeight, 0.75F);
        }
        else
        {
            int var5 = blockAccess.getBlockMetadata(x, y, z) & 7;


            switch (var5)
            {
                case 1:
                default:
                    box = new AxisAlignedBB(0.25F, 0.0F, 0.25F, 0.75F, 0.5F + extraHeadHeight, 0.75F);
                    break;

                case 2:
                    box = new AxisAlignedBB(0.25F, 0.25F, 0.5F, 0.75F, 0.75F + extraHeadHeight, 1.0F);
                    break;

                case 3:
                    box = new AxisAlignedBB(0.25F, 0.25F, 0.0F, 0.75F, 0.75F + extraHeadHeight, 0.5F);
                    break;

                case 4:
                    box = new AxisAlignedBB(0.5F, 0.25F, 0.25F, 1.0F, 0.75F + extraHeadHeight, 0.75F);
                    break;

                case 5:
                    box = new AxisAlignedBB(0.0F, 0.25F, 0.25F, 0.5F, 0.75F + extraHeadHeight, 0.75F);
                    break;
            }

        }
        return box;
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);

        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    @Override
    public boolean hasCenterHardPointToFacing(IBlockAccess blockAccess, int i, int j, int k, int iFacing, boolean bIgnoreTransparency) {
        return iFacing == 1;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving player, ItemStack stack)
    {
        int var7 = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, var7, 2);
    }

    // Sometimes drops wrong damage
//    @Override
//    public void onNeighborBlockChange(World world, int x, int y, int z, int neighbourID)
//    {
//        int facing = world.getBlockMetadata(x,y,z) & 7;
//
//        if (!WorldUtils.doesBlockHaveCenterHardpointToFacing(world, x,y,z, Facing.oppositeSide[facing]))
//        {
//            dropHead(world, x,y,z);
//        }
//
//
//    }
//
//    private void dropHead(World world, int x, int y, int z) {
//        TileEntity te = world.getBlockTileEntity(x,y,z);
//        int headType = ((MobHeadTileEntity)te).getHeadType();
//        dropBlockAsItem(world, x, y, z, headType, 0);
//
//        world.setBlockWithNotify( x, y, z, 0 );
//    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World world)
    {
        return new MobHeadTileEntity();
    }

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World world, int x, int y, int z)
    {
        return SHItems.mobHead.itemID;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World world, int x, int y, int z)
    {
        TileEntity var5 = world.getBlockTileEntity(x, y, z);
        return var5 != null && var5 instanceof MobHeadTileEntity ? ((MobHeadTileEntity)var5).getHeadType() : super.getDamageValue(world, x, y, z);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int meta)
    {
        return meta;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int par5, float par6, int par7) {}

    /**
     * Called when the block is attempted to be harvested
     */
    public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode)
        {
            meta |= 8;
            world.setBlockMetadataWithNotify(x, y, z, meta, 4);
        }

        super.onBlockHarvested(world, x, y, z, meta, player);
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World world, int x, int y, int z, int par5, int par6)
    {
        if (!world.isRemote)
        {
            if ((par6 & 8) == 0)
            {
                ItemStack droppedStack = new ItemStack(SHItems.mobHead.itemID, 1, this.getDamageValue(world, x, y, z));
                MobHeadTileEntity mobHead = (MobHeadTileEntity)world.getBlockTileEntity(x, y, z);

                boolean isSheepHead = droppedStack.getItemDamage() == 16 || droppedStack.getItemDamage() == 17 || droppedStack.getItemDamage() == 18;

                if (isSheepHead)
                {
                    int fleeceColor = mobHead.getFleeceColor();
                    NBTTagCompound newTag = new NBTTagCompound();
                    droppedStack.setTagCompound(newTag);
                    droppedStack.getTagCompound().setInteger( "fleeceColor", fleeceColor );
                }
                this.dropBlockAsItem_do(world, x, y, z, droppedStack);
            }

            super.breakBlock(world, x, y, z, par5, par6);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random random, int par3)
    {
        return SHItems.mobHead.itemID;
    }

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister register) {}

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int meta)
    {
        return Block.slowSand.getBlockTextureFromSide(side);
    }

    /**
     * Gets the icon name of the ItemBlock corresponding to this block. Used by hoppers.
     */
    public String getItemIconName()
    {
        return MobHeadItem.headTypes[0];
    }

    // --- Copied from FCBlockSkull --- //

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
    public boolean rotateAroundJAxis( World world, int x, int y, int z, boolean bReverse )
    {
        TileEntity tileEnt = world.getBlockTileEntity( x, y, z );

        if ( tileEnt != null && tileEnt instanceof MobHeadTileEntity)
        {
            MobHeadTileEntity skullEnt = (MobHeadTileEntity)tileEnt;

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

            skullEnt.setHeadRotation( iSkullFacing );

            world.markBlockForUpdate( x, y, z );

            return true;
        }

        return false;
    }

    @Override
    public ItemStack getStackRetrievedByBlockDispenser( World world, int x, int y, int z )
    {
        // don't allow skulls to be retrieved because their code is a mess

        return null;
    }

    //----------- Client Side Functionality -----------//

    @Override
    public boolean renderBlock( RenderBlocks renderBlocks, int x, int y, int z )
    {
        return false;
    }
}

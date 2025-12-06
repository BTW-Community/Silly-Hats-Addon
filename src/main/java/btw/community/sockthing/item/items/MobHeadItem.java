package btw.community.sockthing.item.items;

import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.utils.heads.MobHeadType;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.community.sockthing.utils.heads.SheepHeadType;
import btw.world.util.WorldUtils;
import com.prupe.mcpatcher.cit.CITUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.*;

import java.util.List;

public class MobHeadItem extends Item {
     private Block block;
    public MobHeadItem(int itemID, Block blockID) {
        super(itemID);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.block = blockID;

        setBuoyant();
        setIncineratedInCrucible();
        setFilterableProperties(Item.FILTERABLE_SOLID_BLOCK);
        setUnlocalizedName( "SHItemMobHead" );
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int facing, float clickX, float clickY, float clickZ)
    {

        if (world.getBlockId(x,y,z) == SHBlocks.mobHead.blockID
            || world.getBlockId(x,y,z) == Block.skull.blockID )
        {
            return false;
        }

        if (facing == 0)
        {
            return false;
        }
        else if ( !world.getBlockMaterial( x, y, z ).isSolid()
                && !( facing == 1 && WorldUtils.doesBlockHaveSmallCenterHardpointToFacing(world, x, y, z, 1) ) )
        {
            return false;
        }
        else
        {
            if (facing == 1)
            {
                ++y;
            }

            if (facing == 2)
            {
                --z;
            }

            if (facing == 3)
            {
                ++z;
            }

            if (facing == 4)
            {
                --x;
            }

            if (facing == 5)
            {
                ++x;
            }

            if (!player.canPlayerEdit(x, y, z, facing, stack))
            {
                return false;
            }
            else if (!block.canPlaceBlockAt(world, x, y, z))
            {
                return false;
            }
            else
            {
                // FCMOD: Changed to notify neighbors
                //par3World.setBlock(par4, par5, par6, Block.skull.blockID, par7, 2);
                world.setBlock(x, y, z, block.blockID, facing, 3);
                // END FCMOD
                int rotation = 0;

                if (facing == 1)
                {
                    rotation = MathHelper.floor_double((double)(player.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
                }

                TileEntity mobHead = world.getBlockTileEntity(x, y, z);

                if (mobHead instanceof MobHeadTileEntity)
                {
                    ((MobHeadTileEntity) mobHead).setHeadType(stack.getItemDamage());
                    ((MobHeadTileEntity) mobHead).setHeadRotation(rotation);

                    if (stack.hasTagCompound())
                    {
                        int fleeceColor;
                        if (stack.stackTagCompound.hasKey("fleeceColor") )
                        {
                            fleeceColor = stack.stackTagCompound.getInteger("fleeceColor");
                            ((MobHeadTileEntity) mobHead).setFleeceColor(fleeceColor);
                        }

                    }
                }

                --stack.stackSize;
                return true;
            }
        }
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int id, CreativeTabs creativeTabs, List list)
    {
        for (MobHeadType mobHead : MobHeadsUtil.mobHeads.values()){
            list.add(new ItemStack(id, 1, mobHead.getId()));
        }
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(int itemDamage)
    {
//        if (itemDamage < 0 || itemDamage >= MobHeadsUtil.mobHeads.size())
//        {
//            itemDamage = 0;
//        }

        return this.icons[itemDamage];
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int par1)
    {
        return par1;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack itemStack)
    {
        int type = itemStack.getItemDamage();

//        if (type < 0 || type >= MobHeadsUtil.mobHeads.size())
//        {
//            type = 0;
//        }

        if (MobHeadsUtil.mobHeads.get(type) instanceof SheepHeadType && itemStack.hasTagCompound())
        {
            if (itemStack.getTagCompound().hasKey("fleeceColor"))
            {
                int fleeceColor = itemStack.getTagCompound().getInteger("fleeceColor");

                return getUnlocalizedName() + "." + MobHeadsUtil.mobHeads.get(type).getName() + "_" + fleeceColor;
            }
        }

        if (MobHeadsUtil.mobHeads.get(type) == null){
           return getUnlocalizedName() + "." + "unknown";
        }
        else return getUnlocalizedName() + "." + MobHeadsUtil.mobHeads.get(type).getName();
    }

    public String getItemDisplayName(ItemStack stack)
    {
        return stack.getItemDamage() == 3 && stack.hasTagCompound() && stack.getTagCompound().hasKey("SkullOwner") ? StatCollector.translateToLocalFormatted("item.skull.player.name", new Object[] {stack.getTagCompound().getString("SkullOwner")}): super.getItemDisplayName(stack);
    }

    private Icon[] icons;
    private Icon[] sheepIcons;
    private Icon[] sheepFamishedIcons;
    private Icon[] sheepStarvingIcons;

    public void registerIcons(IconRegister register)
    {
        this.icons = new Icon[1024];
        this.sheepIcons = new Icon[16];
        this.sheepFamishedIcons = new Icon[16];
        this.sheepStarvingIcons = new Icon[16];

        for (MobHeadType mobHead : MobHeadsUtil.mobHeads.values()){
            this.icons[mobHead.getId()] = register.registerIcon("SHItemMobHead_" + mobHead.getName());
        }

        for (int j = 0; j < sheepIcons.length; ++j)
        {
            this.sheepIcons[j] = register.registerIcon("SHItemMobHead_sheep_" + j);
        }

        for (int k = 0; k < sheepFamishedIcons.length; ++k)
        {
            this.sheepFamishedIcons[k] = register.registerIcon("SHItemMobHead_sheepFamished_" + k);
        }

        for (int l = 0; l < sheepStarvingIcons.length; ++l)
        {
            this.sheepStarvingIcons[l] = register.registerIcon("SHItemMobHead_sheepStarving_" + l);
        }
    }

    @Environment(EnvType.CLIENT)
    public Icon getIconIndex(ItemStack itemStack)
    {
        if (MobHeadsUtil.mobHeads.get(itemStack.getItemDamage()) instanceof SheepHeadType && itemStack.hasTagCompound())
        {
            if (itemStack.getTagCompound().hasKey("fleeceColor"))
            {
                int fleeceColor = itemStack.getTagCompound().getInteger("fleeceColor");
                switch (itemStack.getItemDamage())
                {
                    case MobHeadsUtil.SHEEP:
                        return sheepIcons[fleeceColor];

                    case MobHeadsUtil.SHEEP_FAMISHED:
                        return sheepFamishedIcons[fleeceColor];

                    case MobHeadsUtil.SHEEP_STARVING:
                        return sheepStarvingIcons[fleeceColor];
                }
            }
        }

        return CITUtils.getIcon(this.getIconFromDamage(itemStack.getItemDamage()), itemStack, 0);
    }
}

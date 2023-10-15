package btw.community.sockthing.item.items;

import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.HatTileEntity;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.world.util.WorldUtils;
import net.minecraft.src.*;

import java.util.List;

public class HatItem extends Item {
    private Icon[] icons;
    public HatItem(int par1)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setMaxStackSize(1);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int facing, float clickX, float clickY, float clickZ)
    {
        if (facing == 0)
        {
            return false;
        }
        else if ( !world.getBlockMaterial( x, y, z ).isSolid() &&
                !( facing == 1 && WorldUtils.doesBlockHaveSmallCenterHardpointToFacing(world, x, y, z, 1) ) )
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

            if (!player.canPlayerEdit(x, y, z, facing, itemStack))
            {
                return false;
            }
            else if (!SHBlocks.hat.canPlaceBlockAt(world, x, y, z))
            {
                return false;
            }
            else
            {
                world.setBlock(x, y, z, SHBlocks.hat.blockID, facing, 3);
                int rotation = 0;

                HatTileEntity hat = (HatTileEntity) world.getBlockTileEntity(x, y, z);
                int hatType = itemStack.getItemDamage();

                if (facing == 1)
                {
                    rotation = MathHelper.floor_double((double)(player.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
                }

                if (hat != null && hat instanceof HatTileEntity)
                {
                    hat.setHatType(hatType);
                    hat.setHatRotation(rotation);

                    if (world.getBlockId(x, y - 1, z) == Block.skull.blockID
                            || world.getBlockId(x, y - 1, z) == SHBlocks.mobHead.blockID)
                    {
                        int skullBelowFacing = world.getBlockMetadata(x, y - 1, z) & 7;

                        if (skullBelowFacing != 1) {

                            switch (hatType)
                            {
                                default:
                                    hat.setYShift(-5/16F);
                                    break;

                                case HatsUtil.SQUID:
                                case HatsUtil.FEZ:
                                case HatsUtil.FRUIT:
                                    hat.setYShift(-4/16F);
                                    break;

                                case HatsUtil.FARMER:
                                case HatsUtil.FROG:
                                case HatsUtil.PIRATE:
                                case HatsUtil.COWBOY:
                                case HatsUtil.MUSHROOM_RED:
                                case HatsUtil.MUSHROOM_BROWN:
                                    hat.setYShift(-6/16F);
                                    break;

                                case HatsUtil.FLOWER:
                                case HatsUtil.CAP:
                                    hat.setYShift(-7/16F);
                                    break;

                                case HatsUtil.WOLF:
                                case HatsUtil.BEAST:
                                case HatsUtil.ARROW:
                                case HatsUtil.DEVIL:
                                case HatsUtil.CAT:
                                    hat.setYShift(-8/16F);
                                    break;

                                case HatsUtil.USHANKA:
                                    hat.setYShift(-9/16F);
                                    break;

                                case HatsUtil.SPIDER:
                                    hat.setYShift(-10/16F);
                                    break;

                                case HatsUtil.DINO:
                                    hat.setYShift(-11/16F);
                                    break;

                                case HatsUtil.PUMPKIN:
                                case HatsUtil.BAT:
                                case HatsUtil.BANDANNA:
                                    hat.setYShift(-12/16F);
                                    break;

                            }

                            //Shift Hat, depending if hats a head below
                            switch (skullBelowFacing)
                            {
                                case 2:
                                    hat.setZShift(3.875F/16F);
                                    break;
                                case 3:
                                    hat.setZShift(-3.875F/16F);
                                    break;
                                case 4:
                                    hat.setXShift(3.875F/16F);
                                    break;
                                case 5:
                                    hat.setXShift(-3.875F/16F);
                                    break;
                            }
                        }
                        else {
                            //Shift Hat in the y axis
                            switch (hatType)
                            {
                                default:
                                    hat.setYShift(-9/16F);
                                    break;

                                case HatsUtil.SQUID:
                                case HatsUtil.FEZ:
                                case HatsUtil.FRUIT:
                                    hat.setYShift(-8/16F);
                                    break;

                                case HatsUtil.FARMER:
                                case HatsUtil.BIG:
                                case HatsUtil.FROG:
                                case HatsUtil.PIRATE:
                                case HatsUtil.COWBOY:
                                case HatsUtil.MUSHROOM_RED:
                                case HatsUtil.MUSHROOM_BROWN:
                                    hat.setYShift(-10/16F);
                                    break;

                                case HatsUtil.FLOWER:
                                case HatsUtil.CAP:
                                    hat.setYShift(-11/16F);
                                    break;

                                case HatsUtil.WOLF:
                                case HatsUtil.BEAST:
                                case HatsUtil.ARROW:
                                case HatsUtil.DEVIL:
                                case HatsUtil.CAT:
                                    hat.setYShift(-12/16F);
                                    break;

                                case HatsUtil.SPIDER:
                                case HatsUtil.USHANKA:
                                    hat.setYShift(-13/16F);
                                    break;

                                case HatsUtil.DINO:
                                    hat.setYShift(-15/16F);
                                    break;

                                case HatsUtil.PUMPKIN:
                                case HatsUtil.BAT:
                                case HatsUtil.BANDANNA:
                                    hat.setYShift(-16/16F);
                                    break;
                            }
                        }
                    }
                    else {
                        if (facing == 1)
                        {
                           switch (hatType){
                               default:
                                   hat.setYShift(0);
                                   break;

                               case HatsUtil.FROG:
                                   hat.setYShift(1/16F);
                                   break;
                           }
                        }

                    }

                    //Villager head exceptions, y axis shift
                    int headBelowFacing = world.getBlockMetadata(x, y - 1, z) & 7;
                    TileEntity teBelow = world.getBlockTileEntity(x, y - 1, z);

                    if (world.getBlockId(x, y - 1, z) == SHBlocks.mobHead.blockID && teBelow instanceof MobHeadTileEntity)
                    {
                        MobHeadTileEntity mobHeadBelow = (MobHeadTileEntity) teBelow;
                        if (MobHeadsUtil.isVillagerType(mobHeadBelow.getHeadType()))
                        {
                            float oldShift = hat.getYShift();

                            switch (hatType){
                                default:
                                hat.setYShift(oldShift + 2/16F);
                                    break;

                                case HatsUtil.BANDANNA:
                                    hat.setYShift(oldShift);
                                    break;
                            }
                        }
                    }
                }

                --itemStack.stackSize;

                return true;
            }
        }
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < HatsUtil.hatTypes.length; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(int par1)
    {
        if (par1 < 0 || par1 >= HatsUtil.hatTypes.length)
        {
            par1 = 0;
        }

        return this.icons[par1];
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
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int var2 = par1ItemStack.getItemDamage();

        if (var2 < 0 || var2 >= HatsUtil.hatTypes.length)
        {
            var2 = 0;
        }

        return super.getUnlocalizedName() + "." + HatsUtil.hatTypes[var2];
    }

//    public String getItemDisplayName(ItemStack par1ItemStack)
//    {
//        return par1ItemStack.getItemDamage() == 3 && par1ItemStack.hasTagCompound() && par1ItemStack.getTagCompound().hasKey("SkullOwner") ? StatCollector.translateToLocalFormatted("item.skull.player.name", new Object[] {par1ItemStack.getTagCompound().getString("SkullOwner")}): super.getItemDisplayName(par1ItemStack);
//    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.icons = new Icon[HatsUtil.hatTypes.length];

        for (int var2 = 0; var2 < HatsUtil.hatTypes.length; ++var2)
        {
            this.icons[var2] = par1IconRegister.registerIcon("SHItemHat_" + HatsUtil.hatTypes[var2]);
        }
    }

//    @Override
//    public String customBlur(ItemStack stack) {
//
//        if (stack.getItemDamage() == 12)
//        {
//            return "shmodtex/blur/blurPumpkinBackside";
//        }
//        else return null;
//    }

//    @Override
//    public String customBlurGUIDisabled(ItemStack stack) {
//
//        if (stack.getItemDamage() == 12)
//        {
//            return "shmodtex/blur/blurPumpkinBackside";
//        }
//        else return null;
//    }
}

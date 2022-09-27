package net.minecraft.src;

import java.util.List;

public class SHItemHat extends Item
{
    private static final String[] hatTypes = new String[] {"farmer", "witch", "top", "chef", "flower", "wolf", "direwolf", "big", "crown", "squid", "ushanka", "frog"};
    public static final String[] textureNames = new String[] {"farmer", "witch", "top", "chef", "flower", "wolf", "direwolf", "big", "crown", "squid", "ushanka", "frog"};
    
    private Icon[] icons;

    public SHItemHat(int par1)
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
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int meta, float par8, float par9, float par10)
    {
        if (meta == 0)
        {
            return false;
        }
        // FCMOD: Change
        //else if (!par3World.getBlockMaterial(par4, par5, par6).isSolid())
        else if ( !world.getBlockMaterial( x, y, z ).isSolid() && 
        	!( meta == 1 && FCUtilsWorld.DoesBlockHaveSmallCenterHardpointToFacing( world, x, y, z, 1 ) ) )
    	// END FCMOD
        {
            return false;
        }
        else
        {
            if (meta == 1)
            {
                ++y;
            }

            if (meta == 2)
            {
                --z;
            }

            if (meta == 3)
            {
                ++z;
            }

            if (meta == 4)
            {
                --x;
            }

            if (meta == 5)
            {
                ++x;
            }

            if (!player.canPlayerEdit(x, y, z, meta, itemStack))
            {
                return false;
            }
            else if (!SHMod.hatBlock.canPlaceBlockAt(world, x, y, z))
            {
                return false;
            }
            else
            {
            	// FCMOD: Changed to notify neighbors
                //par3World.setBlock(par4, par5, par6, Block.skull.blockID, par7, 2);
                world.setBlock(x, y, z, SHMod.hatBlock.blockID, meta, 3);
            	// END FCMOD
                int var11 = 0;

                if (meta == 1)
                {
                    var11 = MathHelper.floor_double((double)(player.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
                }

                TileEntity te = world.getBlockTileEntity(x, y, z);

                if (te != null && te instanceof SHTileEntityHat)
                {
                    ((SHTileEntityHat)te).setHatType(itemStack.getItemDamage());
                    ((SHTileEntityHat)te).setHatRotation(var11);
                    
                    System.out.println( ((SHTileEntityHat)te).getHatRotation() );
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
        for (int var4 = 0; var4 < hatTypes.length; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(int par1)
    {
        if (par1 < 0 || par1 >= hatTypes.length)
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

        if (var2 < 0 || var2 >= hatTypes.length)
        {
            var2 = 0;
        }

        return super.getUnlocalizedName() + "." + hatTypes[var2];
    }

//    public String getItemDisplayName(ItemStack par1ItemStack)
//    {
//        return par1ItemStack.getItemDamage() == 3 && par1ItemStack.hasTagCompound() && par1ItemStack.getTagCompound().hasKey("SkullOwner") ? StatCollector.translateToLocalFormatted("item.skull.player.name", new Object[] {par1ItemStack.getTagCompound().getString("SkullOwner")}): super.getItemDisplayName(par1ItemStack);
//    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.icons = new Icon[textureNames.length];

        for (int var2 = 0; var2 < textureNames.length; ++var2)
        {
            this.icons[var2] = par1IconRegister.registerIcon("SCItemHat_" + textureNames[var2]);
        }
    }
    
    @Override
    public boolean isValidforArmorSlot(int armorType, ItemStack itemStack) {
    	
    	return itemStack.itemID == this.itemID && armorType == 0;
    }
}

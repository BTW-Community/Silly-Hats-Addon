# Silly-Hats-Addon
Silly Hats for BTW CE

# Ignored Classes
The following classes have been ignored as they contained too much BTW and Vanilla code. These are base edits that in the future will be replaced by a hook.
- Block.java
	´´´
	public boolean isValidforArmorSlot(int armorType, ItemStack itemStack) {
		return false;
	}
	´´´
- Item.java
	´´´
	public boolean isValidforArmorSlot(int armorType, ItemStack itemStack) {
		return false;
	}
	´´´
- RenderPlayer.java
	After: ´´´else if (var4.getItem().itemID == Item.skull.itemID)´´´
	´´´
            else if (var4.getItem().itemID == SHMod.hat.itemID)
            {
                var5 = 1.0625F;
                GL11.glScalef(var5, -var5, -var5);
//                String var6 = "";
//
//                if (var4.hasTagCompound() && var4.getTagCompound().hasKey("SkullOwner"))
//                {
//                    var6 = var4.getTagCompound().getString("SkullOwner");
//                }

                SHTileEntityHatRenderer.hatRenderer.drawHat(-0.5F, 0.0F, -0.5F, 1, 180.0F, var4.getItemDamage());
            }
    ´´´
- FCBlockPumpkin.java
	´´´
	@Override
    public boolean isValidforArmorSlot(int armorType, ItemStack itemStack) {
    	
    	return itemStack.itemID == this.blockID && armorType == 0;
    }
    ´´´
- ItemSkull.java
	´´´
	@Override
    public boolean isValidforArmorSlot(int armorType, ItemStack itemStack) {
    	
    	return itemStack.itemID == this.blockID && armorType == 0;
    }
    ´´´
- SlotArmor.java
	´´´
    public boolean isItemValid(ItemStack par1ItemStack)
    {
    	if (par1ItemStack == null)
    	{
    		return false;
    	}
    	else
    	{
    		if (par1ItemStack.getItem() instanceof ItemArmor)
    		{
    			return ((ItemArmor)par1ItemStack.getItem()).armorType == this.armorType;
    		}
    		else
    		{
    			int itemID = par1ItemStack.itemID;
    			int meta = par1ItemStack.getItemDamage();
    			Block block = Block.blocksList[itemID];
    			
    			if (par1ItemStack != null && par1ItemStack.getItem().isValidforArmorSlot(this.armorType, par1ItemStack))
    			{
    				return true;
    			}
    			else if (block != null && block.isValidforArmorSlot(this.armorType, par1ItemStack))
    			{
    				return true;
    			}
    			else return false;
    			
//    			else if (this.armorType == 0)
//    			{
//    				return true;
//    			}

    			
    		}
    	}
    	´´´
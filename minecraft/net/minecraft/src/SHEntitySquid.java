package net.minecraft.src;

public class SHEntitySquid extends FCEntitySquid {

	public SHEntitySquid(World world) {
		super(world);
	}

	@Override
	protected String getLivingSound()
	{		
		if (SHDecoIntegration.isDecoInstalled())
		{
			return DecoManager.getNewSoundsInstalled() ? "deco.mob.squid.say" : "";
		}
		else return super.getLivingSound();
	}

	@Override
	protected String getHurtSound()
	{
		if (SHDecoIntegration.isDecoInstalled())
		{
			return DecoManager.getNewSoundsInstalled() ? "deco.mob.squid.hurt" : "";
		}
		else return super.getHurtSound();
	}

	@Override
	protected String getDeathSound() {
		if (SHDecoIntegration.isDecoInstalled())
		{
			return DecoManager.getNewSoundsInstalled() ? "deco.mob.squid.death" : "";
		}
		else return super.getDeathSound();
	}

	@Override
	protected void dropFewItems(boolean killedByPlayer, int lootingModifier) {
		//SH ADDED
		if ( rand.nextInt( 10 ) == 0 )
		{
			ItemStack itemstack = new ItemStack( SHMod.hat, 1, 8); //Squid Hat

			entityDropItem(itemstack, 0.0F);
		}
		//SH END

		int numInkSacs = this.rand.nextInt(3 + lootingModifier) + 1;

		for (int i = 0; i < numInkSacs; ++i) {
			entityDropItem(new ItemStack(Item.dyePowder, 1, 0), 0F);
		}

		int numPrismarine = this.rand.nextInt(3 + lootingModifier) + 1;

		if (SHDecoIntegration.isDecoInstalled())
		{
			for (int i = 0; i < numPrismarine; ++i) {
				entityDropItem(new ItemStack(SHDecoIntegration.prismarineShard), 0F);
			}
		}

		if (rand.nextInt(8) - lootingModifier <= 0) {
			dropItem( FCBetterThanWolves.fcItemMysteriousGland.itemID, 1 );
		}
	}

}

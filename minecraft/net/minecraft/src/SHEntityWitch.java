package net.minecraft.src;

public class SHEntityWitch extends FCEntityWitch {

	private static final int[] m_itemDrops = new int[] {
    	FCBetterThanWolves.fcItemWitchWart.itemID, 
    	Item.glassBottle.itemID, 
    	Item.stick.itemID };

	public SHEntityWitch(World world) {
		super(world);
	}
	
    @Override
    protected void dropFewItems( boolean bKilledByPlayer, int iLootingModifier )
    {
        int iNumDrops = rand.nextInt( 3 ) + 1;
    	
        //SH ADDED
        if ( rand.nextInt( 10 ) == 0 )
    	{
            ItemStack itemstack = new ItemStack( SHMod.hat, 1, 1); //Witch Hat
            
            entityDropItem(itemstack, 0.0F);
    	}
        //SH END
    	
        for ( int iTempCount = 0; iTempCount < iNumDrops; ++iTempCount )
        {
            int iItemID = m_itemDrops[rand.nextInt( m_itemDrops.length )];

            int iNumItems = rand.nextInt( 3 );
            
            if ( iLootingModifier > 0 )
            {
                iNumItems += rand.nextInt( iLootingModifier + 1 );
            }

            for ( ; iNumItems > 0; iNumItems-- )
            {
                dropItem( iItemID, 1 );
            }
        }
        

    }
}

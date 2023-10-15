package btw.community.sockthing.mixins;

import btw.client.fx.BTWEffectManager;
import btw.community.sockthing.interfaces.PumpkinStatusAccessor;
import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.SnowmanEntity;
import btw.item.items.ShearsItem;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SnowmanEntity.class)
public abstract class SnowmanEntityMixin extends EntitySnowman implements PumpkinStatusAccessor {
    public SnowmanEntityMixin(World world) {
        super(world);
    }
    private static final int NEUTERED_STATE_DATA_WATCHER_ID = 25;

    @Override
    protected void dropHead()
    {
        entityDropItem(new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SNOWMAN), 0.0F);
    }

    @Override
    public boolean interact( EntityPlayer player )
    {
        ItemStack playersCurrentItem = player.inventory.getCurrentItem();

        if ( playersCurrentItem != null && playersCurrentItem.getItem() instanceof ShearsItem && getNeuteredState() == 0 )
        {
            if ( !worldObj.isRemote )
            {
                setNeuteredState(1);

                EntityItem hatItem = entityDropItem( new ItemStack( SHItems.hat, 1, HatsUtil.PUMPKIN), 0.25F);

                hatItem.motionY += (double)(rand.nextFloat() * 0.025F);
                hatItem.motionX += (double)((rand.nextFloat() - this.rand.nextFloat()) * 0.1F);
                hatItem.motionZ += (double)((rand.nextFloat() - this.rand.nextFloat()) * 0.1F);

                int i = MathHelper.floor_double( posX );
                int j = MathHelper.floor_double( posY );
                int k = MathHelper.floor_double( posZ );

                worldObj.playAuxSFX( BTWEffectManager.CREEPER_SNIP_EFFECT_ID, i, j, k, 0 );
            }

            playersCurrentItem.damageItem( 10, player );

            if ( playersCurrentItem.stackSize <= 0 )
            {
                player.inventory.mainInventory[player.inventory.currentItem] = null;
            }

            return true;
        }

        return super.interact(player);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();

        dataWatcher.addObject(NEUTERED_STATE_DATA_WATCHER_ID, new Byte((byte)0 ));
    }

    @Override
    public void writeEntityToNBT( NBTTagCompound tag )
    {
        super.writeEntityToNBT( tag );

        tag.setByte( "NeuteredState", (byte) getNeuteredState());
    }

    @Override
    public void readEntityFromNBT( NBTTagCompound tag )
    {
        super.readEntityFromNBT(tag);

        if ( tag.hasKey( "NeuteredState" ) )
        {
            setNeuteredState((int)tag.getByte("NeuteredState"));
        }
    }

    //------------- Class Specific Methods ------------//
    public int getNeuteredState()
    {
        return (int)( dataWatcher.getWatchableObjectByte(NEUTERED_STATE_DATA_WATCHER_ID) );
    }

    public void setNeuteredState(int iNeuteredState)
    {
        dataWatcher.updateObject(NEUTERED_STATE_DATA_WATCHER_ID, Byte.valueOf((byte)iNeuteredState));
    }

    boolean hasPumpkin = false;

    @Override
    public int hasPumpkin() {
        return getNeuteredState();
    }

}

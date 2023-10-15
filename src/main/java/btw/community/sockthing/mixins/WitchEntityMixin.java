package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.SkeletonEntity;
import btw.entity.mob.WitchEntity;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitchEntity.class)
public class WitchEntityMixin extends EntityWitch{
    public WitchEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropFewItems", at = @At(value = "HEAD"))
    public void dropWitchHat(boolean killedByPlayer, int lootingModifier, CallbackInfo ci) {
        if ( rand.nextInt( 10 ) == 0 )
        {
            ItemStack hat = new ItemStack( SHItems.hat, 1, HatsUtil.WITCH);
            entityDropItem( hat, 0 );
        }
    }

    @Override
    public void onDeath(DamageSource damageSource)
    {
        super.onDeath(damageSource);

        if (!worldObj.isRemote && damageSource.getEntity() instanceof SkeletonEntity)
        {
            ItemStack hat = new ItemStack( SHItems.hat, 1, HatsUtil.FROG);
            entityDropItem( hat, 0 );
        }
    }

    @Override
    protected void dropHead()
    {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.WITCH), 0F );
    }
}

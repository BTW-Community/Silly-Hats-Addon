package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.SquidEntity;
import net.minecraft.src.EntityWaterMob;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SquidEntity.class)
public abstract class SquidEntityMixin extends EntityWaterMob {
    public SquidEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropFewItems", at = @At(value = "HEAD"))
    public void dropSquidHat(boolean killedByPlayer, int lootingModifier, CallbackInfo ci) {
        if ( !this.worldObj.isRemote && rand.nextInt( 10 ) == 0 )
        {
            ItemStack hat = new ItemStack( SHItems.hat, 1, HatsUtil.SQUID);
            entityDropItem( hat, 0 );
        }
    }

    @Override
    public void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SQUID), 0F );
    }
}

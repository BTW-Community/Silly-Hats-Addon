package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.entity.mob.SquidEntity;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayerMP.class)
public abstract class EntityPlayerMPMixin extends EntityPlayer implements ICrafting {
    public EntityPlayerMPMixin(World world) {
        super(world);
    }

    @Inject(method = "customModDrops",
            at = @At(value = "HEAD" ))
    public void dropPirateHat(DamageSource damageSource, CallbackInfo ci)
    {
        if ( !this.worldObj.isRemote && damageSource.getEntity() instanceof SquidEntity && rand.nextFloat() < 0.20F )
        {
            ItemStack hat = new ItemStack( SHItems.hat, 1, HatsUtil.PIRATE);
            dropPlayerItemWithRandomChoice(hat, true);
        }
    }
}

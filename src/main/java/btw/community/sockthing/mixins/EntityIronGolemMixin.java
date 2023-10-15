package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityIronGolem.class)
public abstract class EntityIronGolemMixin extends EntityGolem {
    public EntityIronGolemMixin(World par1World) {
        super(par1World);
    }

    @Inject(method = "onDeath", at = @At(value = "HEAD"))
    public void onDeathDropHead(DamageSource par1DamageSource, CallbackInfo ci) {
        if (!worldObj.isRemote) {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.GOLEM), 0F );
        }
    }
}

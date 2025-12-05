package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.minecraft.src.EntityDragon;
import net.minecraft.src.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityDragon.class)
public class EntityDragonMixin {

    @Inject(method = "createEnderPortal", at = @At(value = "HEAD"))
    public void dropDragonHead(int par1, int par2, CallbackInfo ci) {
        EntityDragon thisDragon = (EntityDragon)(Object)this;

        if ( !thisDragon.worldObj.isRemote )
        {
            thisDragon.entityDropItem( new ItemStack( SHItems.mobHead, 1, MobHeadsUtil.DRAGON), 0 );
        }
    }
}

package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.minecraft.src.EntityMob;
import net.minecraft.src.EntityWither;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityWither.class)
public abstract class EntityWitherMixin extends EntityMob {

    public EntityWitherMixin(World par1World) {
        super(par1World);
    }

    @Inject(method = "dropFewItems", at = @At(value = "TAIL"), cancellable = true)
    public void onItemUse(boolean par1, int par2, CallbackInfo ci) {
        if (this.worldObj.rand.nextFloat() <= 0.1F){
            this.entityDropItem( new ItemStack( SHItems.mobHead.itemID, 1, MobHeadsUtil.WITHER_SPECIAL), 0F );
        }
        else this.entityDropItem( new ItemStack( SHItems.mobHead.itemID, 1, MobHeadsUtil.WITHER), 0F );
    }
}

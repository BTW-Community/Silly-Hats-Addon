package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.CreeperEntity;
import net.minecraft.src.EntityCreeper;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntity.class)
public abstract class CreeperEntityMixin extends EntityCreeper {
    @Shadow public abstract int getNeuteredState();

    public CreeperEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropHead", at = @At(value = "HEAD"), cancellable = true)
    public void dropHead(CallbackInfo ci) {
        if (getNeuteredState() == 1)
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.CREEPER_NEUTERED), 0F );
        }
        ci.cancel();
    }

    @Inject(method = "dropFewItems", at = @At(value = "TAIL"), cancellable = true)
    public void dropHead(boolean par1, int par2, CallbackInfo ci) {
        if (this.getPowered()) {
            this.entityDropItem( new ItemStack( SHItems.mobHead.itemID, 1, MobHeadsUtil.CREEPER_SPECIAL), 0F );

        }
    }

}

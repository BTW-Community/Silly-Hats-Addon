package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.WolfEntity;
import net.minecraft.src.EntityWolf;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WolfEntity.class)
public abstract class WolfEntityMixin extends EntityWolf {
    public WolfEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "getDropItemId",
            at = @At(value = "INVOKE",
            target = "Lbtw/entity/mob/WolfEntity;isBurning()Z",
            shift = At.Shift.BEFORE
    ))
    public void dropWolfHat(CallbackInfoReturnable<Integer> cir) {
        if ( rand.nextFloat() <= 0.10F )
        {
            ItemStack hat = new ItemStack( SHItems.hat, 1, HatsUtil.WOLF);
            entityDropItem( hat, 0 );
        }
    }

    @Override
    protected void dropHead() {
        if (isTamed())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.DOG), 0F );
        }
        else if ( isAngry() )
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.WOLF_ANGRY), 0F );
        }
        else if ( isStarving() || hasAttackTarget())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.WOLF_HUNGRY), 0F );
        }
        else entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.WOLF), 0F );

    }
}

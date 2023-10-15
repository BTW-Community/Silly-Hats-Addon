package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.DireWolfEntity;
import btw.entity.mob.WolfEntity;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DireWolfEntity.class)
public abstract class DireWolfEntityMixin extends EntityCreature implements IAnimals {
    public DireWolfEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropFewItems", at = @At(value = "TAIL"))
    public void dropWolfHat(boolean killedByPlayer, int lootingLevel, CallbackInfo ci) {
        if ( rand.nextInt( 10 ) == 0 )
        {
            ItemStack hat = new ItemStack( SHItems.hat, 1, HatsUtil.BEAST);
            entityDropItem( hat, 0 );
        }
    }

    @Override
    protected void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.DOG), 0F );
    }
}


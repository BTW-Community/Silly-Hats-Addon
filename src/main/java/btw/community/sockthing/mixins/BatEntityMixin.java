package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.BatEntity;
import btw.entity.mob.SlimeEntity;
import net.minecraft.src.EntityBat;
import net.minecraft.src.EntitySlime;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BatEntity.class)
public abstract class BatEntityMixin extends EntityBat {
    public BatEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropFewItems", at = @At(value = "TAIL"))
    public void dropHat(boolean killedByPlayer, int lootingModifier, CallbackInfo ci) {
        if ( rand.nextFloat() <= 0.10F )
        {
            // drop bat hat
            entityDropItem( new ItemStack( SHItems.hat.itemID, 1, HatsUtil.BAT), 0F );
        }
    }


    @Override
    public void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.BAT), 0F );
    }
}

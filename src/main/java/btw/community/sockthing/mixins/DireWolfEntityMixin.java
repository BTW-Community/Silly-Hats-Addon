package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.DireWolfEntity;
import net.minecraft.src.EntityCreature;
import net.minecraft.src.IAnimals;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DireWolfEntity.class)
public abstract class DireWolfEntityMixin extends EntityCreature implements IAnimals {
    public DireWolfEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropFewItems", at = @At(value = "TAIL"))
    public void dropWolfHat(boolean killedByPlayer, int lootingLevel, CallbackInfo ci) {
        if (!this.worldObj.isRemote && rand.nextInt( 10 ) == 0 )
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


package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.entity.mob.JungleSpiderEntity;
import btw.entity.mob.SpiderEntity;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(JungleSpiderEntity.class)
public abstract class JungleSpiderEntityMixin extends SpiderEntity {
    public JungleSpiderEntityMixin(World world) {
        super(world);
    }

    @Inject(method = "dropFewItems", at = @At(value = "TAIL"))
    public void dropHat(boolean killedByPlayer, int lootingModifier, CallbackInfo ci) {
        if ( !this.worldObj.isRemote && rand.nextFloat() <= 0.10F )
        {
            // drop jungle spiderhat

            entityDropItem( new ItemStack( SHItems.hat.itemID, 1, HatsUtil.SPIDER), 0F );
        }
    }

    //head dropped in Spider Entity
}

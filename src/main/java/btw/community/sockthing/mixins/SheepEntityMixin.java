package btw.community.sockthing.mixins;

import btw.community.sockthing.interfaces.DomesticSheepAccessor;
import btw.community.sockthing.interfaces.PumpkinStatusAccessor;
import btw.community.sockthing.item.SHItems;
import btw.entity.mob.SheepEntity;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(SheepEntity.class)
public abstract class SheepEntityMixin extends EntitySheep implements DomesticSheepAccessor {
    public SheepEntityMixin(World world) {
        super(world);
    }

//    @Inject(method = "dropFewItems", at = @At(value = "HEAD"))
    @Inject(method = "dropFewItems", at = @At(value = "HEAD"))
    public void dropSquidHat(boolean killedByPlayer, int lootingModifier, CallbackInfo ci) {
        if ( !this.worldObj.isRemote && getIsDomestic() == 1 )
        {
            int fleeceColor = this.getFleeceColor();
            ItemStack mobHead = new ItemStack( SHItems.mobHead, 1, 16);

            if (this.isFamished())
            {
                mobHead = new ItemStack( SHItems.mobHead, 1, 17);
            }
            else if (this.isStarving())
            {
                mobHead = new ItemStack( SHItems.mobHead, 1, 18);
            }

            NBTTagCompound newTag = new NBTTagCompound();
            mobHead.setTagCompound(newTag);
            mobHead.getTagCompound().setInteger( "fleeceColor", fleeceColor );

            entityDropItem( mobHead, 0 );
        }
    }

    @Inject(method = "spawnHardcoreBaby",
            at = @At(value = "INVOKE",
                    target = "Ljava/util/Random;nextInt(I)I",
                    shift = At.Shift.BEFORE),
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    public void setSheepDomestic(EntityAgeable parentAnimal, CallbackInfoReturnable<SheepEntity> cir, SheepEntity parentSheep, SheepEntity babySheep) {
        ((DomesticSheepAccessor)babySheep).setIsDomestic(1);
    }

    public int isDomestic = 0;

    @Inject(method = "writeEntityToNBT", at = @At(value = "TAIL"))
    public void writeEntityToNBT(NBTTagCompound tag, CallbackInfo ci )
    {
        tag.setInteger("isDomestic", isDomestic);
    }

    @Inject(method = "writeEntityToNBT", at = @At(value = "TAIL"))
    public void readEntityFromNBT(NBTTagCompound tag, CallbackInfo ci )
    {
        if ( tag.hasKey( "isDomestic" ) )
        {
            isDomestic = tag.getInteger("isDomestic");
        }
    }

    public int getIsDomestic() {
        return isDomestic;
    }

    @Override
    public void setIsDomestic(int isDomestic) {
        this.isDomestic = isDomestic;
    }
}

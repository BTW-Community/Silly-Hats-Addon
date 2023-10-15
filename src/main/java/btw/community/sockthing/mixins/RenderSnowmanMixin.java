package btw.community.sockthing.mixins;

import btw.community.sockthing.interfaces.PumpkinStatusAccessor;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ModelBase;
import net.minecraft.src.RenderLiving;
import net.minecraft.src.RenderSnowMan;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderSnowMan.class)
public abstract class RenderSnowmanMixin extends RenderLiving {
    public RenderSnowmanMixin(ModelBase model, float par2) {
        super(model, par2);
    }

    @Inject(method = "renderEquippedItems",
            at = @At(value = "HEAD"), cancellable = true)
    public void dropPumpkinHat(EntityLiving entityLiving, float par2, CallbackInfo ci){
        int neutered = 0;
        if (entityLiving instanceof PumpkinStatusAccessor) {
            neutered = ((PumpkinStatusAccessor)entityLiving).hasPumpkin();
        }
        if (neutered == 1) {
            ci.cancel();
        }
    }
}
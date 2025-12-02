package btw.community.sockthing.mixins;

import btw.community.sockthing.item.items.HatItem;
import btw.community.sockthing.item.items.MobHeadItem;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityLiving.class)
public class EntityLivingMixin {

    @Inject(method = "getArmorPosition",
            at = @At(value = "HEAD"), cancellable = true)
    private static void getArmorPosition(ItemStack par0ItemStack, CallbackInfoReturnable<Integer> cir){
        if (par0ItemStack.getItem() instanceof MobHeadItem || par0ItemStack.getItem() instanceof HatItem)
        {
            cir.setReturnValue(4);
            cir.cancel();
        }
    }
}

package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SlotArmor.class)
public abstract class SlotArmorMixin extends Slot {

    @Shadow
    final int armorType;

    public SlotArmorMixin(ContainerPlayer par1ContainerPlayer, IInventory par2IInventory, int par3, int par4, int par5, int par6) {
        super(par2IInventory, par3, par4, par5);
        this.armorType = par6;
    }

    @Inject(method = "isItemValid", at = @At(value = "HEAD"), cancellable = true)
    public void isItemValid(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir)
    {
        if (itemStack.itemID == SHItems.hat.itemID && this.armorType == 0)
        {
            cir.setReturnValue(true);
        }
        else if (itemStack.itemID == SHItems.mobHead.itemID && this.armorType == 0)
        {
            cir.setReturnValue(true);
        }
    }
}

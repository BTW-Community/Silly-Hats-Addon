package btw.community.sockthing.mixins;

import btw.community.sockthing.block.SHBlocks;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemSkull.class)
public abstract class ItemSkullMixin extends Item {
    public ItemSkullMixin(int par1) {
        super(par1);
    }

    @Inject(method = "onItemUse", at = @At(value = "HEAD"), cancellable = true)
    public void onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int facing, float clickX, float clickY, float clickZ, CallbackInfoReturnable<Boolean> cir) {
        if (world.getBlockId(x, y, z) == SHBlocks.mobHead.blockID
                || world.getBlockId(x, y, z) == Block.skull.blockID) {
            cir.setReturnValue(false);
        }
    }
}

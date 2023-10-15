package btw.community.sockthing.mixins;

import btw.community.sockthing.block.tileentity.HatTileEntityRenderer;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import btw.community.sockthing.item.SHItems;
import net.minecraft.src.*;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderPlayer.class)
public abstract class RenderPlayerMixin extends RenderLiving {
    @Shadow private ModelBiped modelArmor;

    @Shadow protected abstract void renderSpecials(EntityPlayer par1EntityPlayer, float par2);

    public RenderPlayerMixin(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }

    @Inject(method = "renderSpecials",
        at = @At(
                value = "INVOKE",
                target = "Lorg/lwjgl/opengl/GL11;glPopMatrix()V",
                shift = At.Shift.BEFORE,
                ordinal = 0,
                remap = false
        ))
    public void renderHats(EntityPlayer player, float par2, CallbackInfo ci) {

        ItemStack armorItemInSlot = player.inventory.armorItemInSlot(3);

        if (armorItemInSlot != null)
        {
            if ( armorItemInSlot.getItem().itemID < 4096 && Block.blocksList[armorItemInSlot.itemID] != null ) {
            }
            else if (armorItemInSlot.getItem().itemID == Item.skull.itemID) {
            }
            else if (armorItemInSlot.getItem().itemID == SHItems.hat.itemID )
            {
                float scale = 1.0625F;
                GL11.glScalef(scale, -scale, -scale);

                HatTileEntityRenderer.hatRenderer.drawHat(-0.5F, 0.0F, -0.5F, 1, 0.0F, armorItemInSlot.getItemDamage(),0F, 6/16F, 0F, true, 0F, 0F, 0F);
            }
            else if (armorItemInSlot.getItem().itemID == SHItems.mobHead.itemID )
            {
                float scale = 1.0625F;
                GL11.glScalef(scale, -scale, -scale);

                int fleeceColor = 0;
                boolean isSheepHead = armorItemInSlot.getItemDamage() == 16 || armorItemInSlot.getItemDamage() == 17 || armorItemInSlot.getItemDamage() == 18;

                if (isSheepHead && armorItemInSlot.hasTagCompound())
                {
                    if (armorItemInSlot.getTagCompound().hasKey("fleeceColor"))
                    {
                        fleeceColor = armorItemInSlot.getTagCompound().getInteger("fleeceColor");
                    }
                }

                MobHeadTileEntityRenderer.headRenderer.renderMobHead(-0.5F, 0.0F, -0.5F, 1, 180.0F, armorItemInSlot.getItemDamage(), fleeceColor);
            }
        }
    }
}

package btw.community.sockthing.mixins;

import btw.community.sockthing.block.tileentity.HatTileEntityRenderer;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.community.sockthing.utils.SheepHeadType;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.RenderBiped;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderBiped.class)
public class RenderBipedMixin {

    @Shadow protected ModelBiped modelBipedMain;

    @Inject(method = "renderEquippedItems",
            at = @At(
                    value = "INVOKE",
                    target = "Lorg/lwjgl/opengl/GL11;glPopMatrix()V",
                    shift = At.Shift.BEFORE,
                    ordinal = 0,
                    remap = false
            ))
    protected void renderEquippedItems(EntityLiving par1EntityLiving, float par2, CallbackInfo ci){

        GL11.glPushMatrix();

        ItemStack armorItemInSlot = par1EntityLiving.getCurrentArmor(3);

        if (armorItemInSlot != null)
        {
            if (armorItemInSlot.getItem().itemID == SHItems.hat.itemID )
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

                if (MobHeadsUtil.mobHeads.get(armorItemInSlot.getItemDamage()) instanceof SheepHeadType && armorItemInSlot.hasTagCompound())
                {
                    if (armorItemInSlot.getTagCompound().hasKey("fleeceColor"))
                    {
                        fleeceColor = armorItemInSlot.getTagCompound().getInteger("fleeceColor");
                    }
                }

                MobHeadTileEntityRenderer.headRenderer.renderMobHead(par1EntityLiving.ticksExisted, -0.5F, 0.0F, -0.5F, 1, 180.0F, armorItemInSlot.getItemDamage(), fleeceColor);
            }
        }

        GL11.glPopMatrix();
    }

}

package btw.community.sockthing.block.models;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class SilverfishHeadModel extends MobHeadModel
{
    public ModelRenderer mobHead;
    public SilverfishHeadModel(int par1, int par2, int textureWidth, int textureHeight)
    {
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        this.mobHead = new ModelRenderer(this, par1, par2);
        this.mobHead.addBox(-1.5F, -2.0F, -1.0F, 3, 2, 2, 0.0F);
        this.mobHead.setRotationPoint(0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        this.mobHead.render(par7);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        this.mobHead.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.mobHead.rotateAngleX = par5 / (180F / (float)Math.PI);
    }
}

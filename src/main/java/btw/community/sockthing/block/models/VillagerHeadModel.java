// Made with Blockbench 4.8.2
// Exported for Minecraft version 1.5.2
// Paste this class into your mod and call render() in your Entity Render class
// Note: You may need to adjust the y values of the 'setRotationPoint's

package btw.community.sockthing.block.models;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class VillagerHeadModel extends MobHeadModel {
    private final ModelRenderer head;
    private final ModelRenderer nose;
    private final ModelRenderer wart;

    public VillagerHeadModel(boolean renderNose, boolean renderOverlay, boolean renderWart) {
        textureWidth = 32;
        textureHeight = 36;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);

        if (renderOverlay)
        {
            this.head.setTextureOffset(0, 18).addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.125F);
        }

        nose = new ModelRenderer(this);
        wart = new ModelRenderer(this);

        if (renderNose)
        {
            nose.setRotationPoint(0.0F, -2.0F, 0.0F);
            head.addChild(nose);
            this.nose.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);

            if (renderWart)
            {
                wart.setRotationPoint(0.0F, 1.0F, 0.0F);
                nose.addChild(wart);
                this.wart.setTextureOffset(0, 0).addBox(0.0F, 0.0F, -6.75F, 1, 1, 1, -0.25F);
            }
        }
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        head.render(f5);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, f and f1 are used for animating the movement of arms
     * and legs, where f represents the time(so that arms and legs swing back and forth) and f1 represents how
     * "far" arms and legs can swing at most.
     */
    @Override
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
    }

    /**
     *	Sets the rotation of a ModelRenderer. Only called if the ModelRenderer has a rotation
     */
    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
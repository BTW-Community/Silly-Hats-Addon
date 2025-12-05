package btw.community.sockthing.block.models;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelRenderer;

public class DragonHeadModel extends MobHeadModel {

    private final ModelRenderer dragon;
    private final ModelRenderer jaw;

    public DragonHeadModel() {
        textureWidth = 128;
        textureHeight = 128;

        dragon = new ModelRenderer(this);
        dragon.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dragon.setTextureOffset(0, 32).addBox(-6.0F, -9.0F, -22.0F, 12, 5, 16, 0.0F);
        this.dragon.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F);
        this.dragon.setTextureOffset(65, 0).addBox(-5.0F, -20.0F, -2.0F, 2, 4, 6, 0.0F);
        this.dragon.setTextureOffset(64, 10).addBox(-5.0F, -11.0F, -20.0F, 2, 2, 4, 0.0F);
        this.dragon.setTextureOffset(81, 0).addBox(3.0F, -20.0F, -2.0F, 2, 4, 6, 0.0F);
        this.dragon.setTextureOffset(76, 10).addBox(3.0F, -11.0F, -20.0F, 2, 2, 4, 0.0F);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.0F, -4.0F, -5.0F);
        dragon.addChild(jaw);
        this.jaw.setTextureOffset(0, 53).addBox(-6.0F, 0.0F, -17.0F, 12, 4, 16, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        dragon.render(f5);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, f and f1 are used for animating the movement of arms
     * and legs, where f represents the time(so that arms and legs swing back and forth) and f1 represents how
     * "far" arms and legs can swing at most.
     */
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        this.dragon.rotateAngleY = f3 / (180F / (float)Math.PI);
        this.dragon.rotateAngleX = f4 / (180F / (float)Math.PI);
    }
}

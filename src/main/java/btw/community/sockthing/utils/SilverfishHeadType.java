package btw.community.sockthing.utils;

import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.models.SilverfishHeadModel;
import net.minecraft.src.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class SilverfishHeadType extends MobHeadType{
    public SilverfishHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model){
        super(id, name, sound, volume, pitch, model);
        this.texture = setupTexture(texture);
        this.glowingTexture = setupTexture(glowingTexture);
        this.blockBounds = getBlockBounds();
    }

    @Override
    public AxisAlignedBB getBlockBounds() {
        return new AxisAlignedBB(
                13/32F, 0/16F, 13/32F,
                19/32F, 3/16F, 19/32F);
    }

    @Override
    public float translateModel(float xPos, float yPos, float zPos, int direction, float rotation, int type, int fleeceColor, boolean entityWearing){

        GL11.glTranslatef(xPos + 0.5F, yPos, zPos + 0.5F);

        if (entityWearing) {
            GL11.glTranslatef(0F, 0.47F, 0F);
        }

        AxisAlignedBB bounds = getBlockBounds();

        float[] offsets = MobHeadsUtil.computeOffsets(bounds, direction);

        GL11.glTranslatef(offsets[0], offsets[1], offsets[2]);

        return rotation + offsets[3];
    }
}

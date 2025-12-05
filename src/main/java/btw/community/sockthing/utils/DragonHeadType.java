package btw.community.sockthing.utils;

import btw.community.sockthing.block.models.MobHeadModel;
import net.minecraft.src.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public class DragonHeadType extends MobHeadType{
    public DragonHeadType(int id, String name, String sound, float pitch, float volume, MobHeadModel model, String texture, String glowingEyes) {
        super(id, name, sound, pitch, volume, model, texture, glowingEyes);
    }

    @Override
    public AxisAlignedBB getBlockBounds() {
        return new AxisAlignedBB(
                1/16F, 0/16F, 1/16F,
                15/16F, 14/16F, 15/16F);
    }

    @Override
    public void preRender(float xPos, float yPos, float zPos, int meta, float par5, int type, int fleeceColor, float var10){
        GL11.glScalef(14/16F, 14/16F, 14/16F);
    }
}

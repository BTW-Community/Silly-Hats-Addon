package btw.community.sockthing.utils;

import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import org.lwjgl.opengl.GL11;

public class SlimeHeadType extends MobHeadType{

    public SlimeHeadType(int id, String name, String sound){
        super(id, name, sound,
                1F, 1F,
                MobHeadTileEntityRenderer.BASE,
                "/shmodtex/heads/" + name + ".png", null);
    }

    @Override
    public void preRender(float xPos, float yPos, float zPos, int meta, float par5, int type, int fleeceColor, float var10) {
        GL11.glEnable(GL11.GL_NORMALIZE);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
    }
}

package btw.community.sockthing.utils.heads;

import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import net.minecraft.src.Entity;
import net.minecraft.src.EntitySheep;
import org.lwjgl.opengl.GL11;

public class SheepHeadType extends MobHeadType{
    public SheepHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model, String texture, String overlayTexture) {
        super(id, name, sound, volume, pitch, model, texture, overlayTexture);
    }

    @Override
    public void postRender(float xPos, float yPos, float zPos, int meta, float rotation, int type, int fleeceColor, float var10){
        float var4 = 1.0F;
        GL11.glColor3f(var4 * EntitySheep.fleeceColorTable[fleeceColor][0], var4 * EntitySheep.fleeceColorTable[fleeceColor][1], var4 * EntitySheep.fleeceColorTable[fleeceColor][2]);

//        System.out.println("FleeceColor: " + fleeceColor);

        MobHeadTileEntityRenderer.SHEEP_OVERLAY.render((Entity)null, 0.0F, 0.0F, 0.0F, rotation, 0.0F, var10);
    }
}

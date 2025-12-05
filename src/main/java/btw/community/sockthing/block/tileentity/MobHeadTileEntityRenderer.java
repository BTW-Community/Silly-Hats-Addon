package btw.community.sockthing.block.tileentity;

import btw.community.sockthing.block.models.DragonHeadModel;
import btw.community.sockthing.utils.MobHeadType;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.models.VillagerHeadModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@Environment(value = EnvType.CLIENT)
public class MobHeadTileEntityRenderer extends TileEntitySpecialRenderer
{
    public static MobHeadTileEntityRenderer headRenderer;
    public static final MobHeadModel BASE = new MobHeadModel(0, 0, 32, 32);
    public static final MobHeadModel SNOWMAN = new MobHeadModel(0, 0, 64, 64);
    public static final MobHeadModel SPIDER = new MobHeadModel(32, 4, 64, 32, false);
    public static final MobHeadModel MOB = new MobHeadModel(0, 0, 64, 32, false);
    public static final MobHeadModel OVERLAY = new MobHeadModel(0, 0, 32, 32, true);
    public static final MobHeadModel SHEEP_OVERLAY = new MobHeadModel(0, 16, 32, 32, true);
    public static final VillagerHeadModel VILLAGER = new VillagerHeadModel(true, true, false);
    public static final VillagerHeadModel WITCH = new VillagerHeadModel(true, false, true);
    public static final DragonHeadModel DRAGON = new DragonHeadModel();

    /**
     * Render a skull tile entity.
     */
    public void renderTileEntityMobHeadAt(MobHeadTileEntity par1TileEntitySkull, double par2, double par4, double par6, float par8)
    {
        this.renderMobHead((float)par2, (float)par4, (float)par6, par1TileEntitySkull.getBlockMetadata() & 7, (float)(par1TileEntitySkull.getHeadRotation() * 360) / 16.0F, par1TileEntitySkull.getHeadType(), par1TileEntitySkull.getFleeceColor());
    }

    /**
     * Associate a TileEntityRenderer with this TileEntitySpecialRenderer
     */
    public void setTileEntityRenderer(TileEntityRenderer tileEntityRenderer)
    {
        super.setTileEntityRenderer(tileEntityRenderer);
        headRenderer = this;
    }

    public void renderMobHead(float par1, float par2, float par3, int meta, float rot, int type, int fleeceColor)
    {
        MobHeadType mobHead = MobHeadsUtil.mobHeads.get(type);
        MobHeadModel model = MOB;
        this.bindTextureByName("/mob/char.png");

        if (mobHead != null){
            this.bindTextureByName( mobHead.getModelTexture() );
            model = mobHead.getModel();
        }

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);


        if (mobHead != null){
            rot = mobHead.translateModel(par1, par2, par3, meta, rot, type, fleeceColor);
        }

        float var10 = 0.0625F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);

        if (mobHead != null){
            mobHead.preRender(par1, par2, par3, meta, rot, type, fleeceColor, var10);
        }

        model.render((Entity)null, 0.0F, 0.0F, 0.0F, rot, 0.0F, var10);

        if (mobHead != null){
            if (mobHead.getGlowingTexture() != null) renderGlowingEyes( model, rot, mobHead.getGlowingTexture());
        }

        if (mobHead != null){
            mobHead.postRender(par1, par2, par3, meta, rot, type, fleeceColor, var10);
        }

        GL11.glPopMatrix();
    }

    private void renderCreeperGlow(MobHeadModel model, float fYaw) {

        bindTextureByName("/armor/power.png");
        //GL11.glMatrixMode(GL11.GL_TEXTURE);
        float var4 = 0.5F;
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        //GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDepthMask(true);
        char var5 = 61680;
        int var6 = var5 % 65536;
        int var7 = var5 / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var6 / 1.0F, (float)var7 / 1.0F);
        //GL11.glMatrixMode(GL11.GL_MODELVIEW);
        //GL11.glEnable(GL11.GL_BLEND);
        float var8 = 0.5F;
        GL11.glColor4f(var8, var8, var8, 1.0F);
        //GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
        GL11.glEnable(GL11.GL_LIGHTING);

//    	float var4 = 0F;
//        this.bindTextureByName("/armor/power.png");
//        GL11.glMatrixMode(GL11.GL_TEXTURE);
//        GL11.glLoadIdentity();
//        float var5 = var4 * 0.01F;
//        float var6 = var4 * 0.01F;
//        GL11.glTranslatef(var5, var6, 0.0F);
//        model = mobOverlay;
//        GL11.glMatrixMode(GL11.GL_MODELVIEW);
//        GL11.glEnable(GL11.GL_BLEND);
//        float var7 = 0.5F;
//        GL11.glColor4f(var7, var7, var7, 1.0F);
//        GL11.glDisable(GL11.GL_LIGHTING);
//        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

        model.render((Entity)null, 0.0F, 0.0F, 0.0F, fYaw, 0.0F, 0.0625F);
    }

    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float par8)
    {
        this.renderTileEntityMobHeadAt((MobHeadTileEntity) te, x, y, z, par8);
    }

    public void renderGlowingEyes( MobHeadModel model, float fYaw, String texture )
    {
        this.bindTextureByName(texture);
        float var4 = 1.0F;
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDepthMask(true);
        char var5 = 61680;
        int var6 = var5 % 65536;
        int var7 = var5 / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var6 / 1.0F, (float)var7 / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);

        GL11.glScalef(1.0001F, 1.0001F, 1.0001F);

        model.render((Entity)null, 0.0F, 0.0F, 0.0F, fYaw, 0.0F, 0.0625F);
    }

    // FCMOD: Added
    private void RenderInfusedEyes( MobHeadModel model, float fYaw )
    {
        bindTextureByName("/btwmodtex/fcInfusedSkullEyes.png");
        float var4 = 1.0F;
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDepthMask(true);
        char var5 = 61680;
        int var6 = var5 % 65536;
        int var7 = var5 / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var6 / 1.0F, (float)var7 / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);

        model.render((Entity)null, 0.0F, 0.0F, 0.0F, fYaw, 0.0F, 0.0625F);
    }
    // END FCMOD
}

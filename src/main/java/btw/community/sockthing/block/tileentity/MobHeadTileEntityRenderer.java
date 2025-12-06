package btw.community.sockthing.block.tileentity;

import btw.community.sockthing.block.models.DragonHeadModel;
import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.models.SilverfishHeadModel;
import btw.community.sockthing.block.models.VillagerHeadModel;
import btw.community.sockthing.utils.SilverfishHeadType;
import btw.community.sockthing.utils.MobHeadType;
import btw.community.sockthing.utils.MobHeadsUtil;
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
    public static final SilverfishHeadModel SILVERFISH = new SilverfishHeadModel(0, 0, 32, 32);

    /**
     * Render a skull tile entity.
     */
    public void renderTileEntityMobHeadAt(MobHeadTileEntity par1TileEntitySkull, double par2, double par4, double par6, float par8)
    {
        this.renderMobHead(par1TileEntitySkull.ticksExisted, (float)par2, (float)par4, (float)par6, par1TileEntitySkull.getBlockMetadata() & 7, (float)(par1TileEntitySkull.getHeadRotation() * 360) / 16.0F, par1TileEntitySkull.getHeadType(), par1TileEntitySkull.getFleeceColor(), false);
    }

    /**
     * Associate a TileEntityRenderer with this TileEntitySpecialRenderer
     */
    public void setTileEntityRenderer(TileEntityRenderer tileEntityRenderer)
    {
        super.setTileEntityRenderer(tileEntityRenderer);
        headRenderer = this;
    }

    public void renderMobHead(float partialTicks, float par1, float par2, float par3, int meta, float rot, int type, int fleeceColor, boolean entityWearing)
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
            rot = mobHead.translateModel(par1, par2, par3, meta, rot, type, fleeceColor, entityWearing);
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
            mobHead.postRender(par1, par2, par3, meta, rot, type, fleeceColor, var10);
        }

        if (mobHead != null){
            if (mobHead.getGlowingTexture() != null) {
                if (mobHead.getId() == MobHeadsUtil.CREEPER_SPECIAL){
                    renderCreeperGlow( model, partialTicks, rot, mobHead.getGlowingTexture());
                }
                else renderGlowingEyes( model, rot, mobHead.getGlowingTexture());
            }
        }


        GL11.glPopMatrix();
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
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDepthMask(true);
        char var5 = 61680;
        int var6 = var5 % 65536;
        int var7 = var5 / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var6 / 1.0F, (float)var7 / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//        GL11.glEnable(GL11.GL_LIGHTING);
//        GL11.glEnable(GL11.GL_ALPHA_TEST);
//        GL11.glDisable(GL11.GL_BLEND);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);

        GL11.glScalef(1.001F, 1.001F, 1.001F);

        model.render((Entity)null, 0.0F, 0.0F, 0.0F, fYaw, 0.0F, 0.0625F);

        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_BLEND);
    }

    public void renderCreeperGlow(MobHeadModel model, float partialTicks, float fYaw, String texture)
    {
        this.bindTextureByName(texture);
        float alpha = 1.0F;

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);

        // Disable world lighting to avoid darkening
        GL11.glDisable(GL11.GL_LIGHTING);

        // Fullbright lightmap coords override
        char light = 61680;
        int lx = light % 65536;
        int ly = light / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lx, ly);

        float time = partialTicks;

        GL11.glMatrixMode(GL11.GL_TEXTURE);
        GL11.glLoadIdentity();

        float scroll = time * 0.01F;      // speed, same as creeper
        GL11.glTranslatef(scroll, scroll, 0F);

        GL11.glMatrixMode(GL11.GL_MODELVIEW);

        GL11.glScalef(1.001F, 1.001F, 1.001F);
        model.render((Entity)null, 0F, 0F, 0F, fYaw, 0F, 0.0625F);

        GL11.glMatrixMode(GL11.GL_TEXTURE);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_BLEND);
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

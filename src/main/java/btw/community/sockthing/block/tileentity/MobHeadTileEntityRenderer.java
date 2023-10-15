package btw.community.sockthing.block.tileentity;

import btw.community.sockthing.utils.MobHeadsUtil;
import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.models.VillagerHeadModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@Environment(EnvType.CLIENT)
public class MobHeadTileEntityRenderer extends TileEntitySpecialRenderer
{
    public static MobHeadTileEntityRenderer headRenderer;
    private MobHeadModel base = new MobHeadModel(0, 0, 32, 32);
    private MobHeadModel snowman = new MobHeadModel(0, 0, 64, 64);
    private MobHeadModel spider = new MobHeadModel(32, 4, 64, 32, false);
    private MobHeadModel mob = new MobHeadModel(0, 0, 64, 32, false);
    private MobHeadModel endermanEyes = new MobHeadModel(0, 0, 32, 16, false);
    private MobHeadModel overlay = new MobHeadModel(0, 0, 32, 32, true);
    private MobHeadModel sheepOverlay = new MobHeadModel(0, 16, 32, 32, true);
    private VillagerHeadModel villagerHead = new VillagerHeadModel(true, true, false);
    private VillagerHeadModel witchHead = new VillagerHeadModel(true, false, true);

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

    public void renderMobHead(float par1, float par2, float par3, int meta, float par5, int type, int fleeceColor)
    {
        MobHeadModel model = this.base;

        switch (type) {

            default:
                this.bindTextureByName("/mob/char.png");
                model = mob;
                break;

            case MobHeadsUtil.OCELOT:
                this.bindTextureByName("/shmodtex/heads/ocelot.png");
                break;

            case 1:
                this.bindTextureByName("/shmodtex/heads/catBlack.png");
                break;

            case 2:
                this.bindTextureByName("/shmodtex/heads/catOrange.png");
                break;

            case 3:
                this.bindTextureByName("/shmodtex/heads/catWhite.png");
                break;

            case 4:
                this.bindTextureByName("/shmodtex/heads/catTabby.png");
                break;

            case 5:
                this.bindTextureByName("/shmodtex/heads/chicken.png");
                break;

            case 6:
                this.bindTextureByName("/shmodtex/heads/chickenFamished.png");
                break;

            case 7:
                this.bindTextureByName("/shmodtex/heads/chickenStarving.png");
                break;

            case 8:
                this.bindTextureByName("/shmodtex/heads/cow.png");
                break;

            case 9:
                this.bindTextureByName("/shmodtex/heads/cowFamished.png");
                break;

            case 10:
                this.bindTextureByName("/shmodtex/heads/cowStarving.png");
                break;

            case 11:
                this.bindTextureByName("/shmodtex/heads/cowHarness.png");
                model = overlay;
                break;

            case 12:
                this.bindTextureByName("/shmodtex/heads/pig.png");
                break;

            case 13:
                this.bindTextureByName("/shmodtex/heads/pigFamished.png");
                break;

            case 14:
                this.bindTextureByName("/shmodtex/heads/pigStarving.png");
                break;

            case 15:
                this.bindTextureByName("/shmodtex/heads/pigHarness.png");
                model = overlay;
                break;

            case 16:
                this.bindTextureByName("/shmodtex/heads/sheep.png");
                //model = overlay;
                break;

            case 17:
                this.bindTextureByName("/shmodtex/heads/sheepFamished.png");
                break;

            case 18:
                this.bindTextureByName("/shmodtex/heads/sheepStarving.png");
                break;

            case 19:
                this.bindTextureByName("/shmodtex/heads/sheepHarness.png");
                model = overlay;
                break;

            case 20:
                this.bindTextureByName("/shmodtex/heads/mooshroom.png");
                break;

            case 21:
                this.bindTextureByName("/shmodtex/heads/mooshroomFamished.png");
                break;

            case 22:
                this.bindTextureByName("/shmodtex/heads/mooshroomStarving.png");
                break;

            case 23:
                this.bindTextureByName("/shmodtex/heads/mooshroomHarness.png");
                model = overlay;
                break;

            case 24:
                this.bindTextureByName("/shmodtex/heads/dog.png");
                break;

            case 25:
                this.bindTextureByName("/shmodtex/heads/wolf.png");
                break;

            case 26:
                this.bindTextureByName("/shmodtex/heads/wolfAngry.png");
                break;

            case 27:
                this.bindTextureByName("/shmodtex/heads/wolfHungry.png");
                break;

            case 28:
                this.bindTextureByName("/shmodtex/heads/wolfDire.png");
                break;

            case 29:
                this.bindTextureByName("/shmodtex/heads/villager.png");
                model = villagerHead;
                break;

            case 30:
                this.bindTextureByName("/shmodtex/heads/villagerDirty.png");
                model = villagerHead;
                break;

            case 31:
                this.bindTextureByName("/shmodtex/heads/villagerLibrarian.png");
                model = villagerHead;
                break;

            case 32:
                this.bindTextureByName("/shmodtex/heads/villagerPriest.png");
                model = villagerHead;
                break;

            case 33:
                this.bindTextureByName("/shmodtex/heads/villagerButcher.png");
                model = villagerHead;
                break;

            case 34:
                this.bindTextureByName("/shmodtex/heads/witch.png");
                model = witchHead;
                break;

            case 35:
                this.bindTextureByName("/shmodtex/heads/villagerZombie.png");
                model = villagerHead;
                break;

            case 36:
                this.bindTextureByName("/shmodtex/heads/golem.png");
                model = villagerHead;
                break;

            case 37:
                this.bindTextureByName("/mob/snowman.png");
                model = snowman;
                break;

            case 38:
                this.bindTextureByName("/btwmodtex/fcCreeperDepressed.png");
                model = mob;
                break;

            case 39:
                this.bindTextureByName("/mob/spider.png");
                model = spider;
                break;

            case 40:
                this.bindTextureByName("/mob/cavespider.png");
                model = spider;
                break;

            case 41:
                this.bindTextureByName("/btwmodtex/fcSpiderJungle.png");
                model = spider;
                break;

            case 42:
                this.bindTextureByName("/shmodtex/heads/enderman.png");
                break;

            case 43:
                this.bindTextureByName("/mob/fire.png");
                model = mob;
                break;

            case 44:
                this.bindTextureByName("/shmodtex/heads/ghast.png");
                break;

            case 45:
                this.bindTextureByName("/shmodtex/heads/ghastScreaming.png");
                break;

            case 46:
                this.bindTextureByName("/shmodtex/heads/magmacube.png");
                break;

            case 47:
                this.bindTextureByName("/shmodtex/heads/pigman.png");
                model = overlay;
                break;

            case 48:
                this.bindTextureByName("/shmodtex/heads/slime.png");
                model = overlay;
                break;

            case 49:
                this.bindTextureByName("/shmodtex/heads/squid.png");
                break;

            case 50:
                this.bindTextureByName("/shmodtex/heads/bat.png");
                break;

        }

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);

        if (meta != 1)
        {
            switch (meta)
            {
                case 2:
                    GL11.glTranslatef(par1 + 0.5F, par2 + 0.25F, par3 + 0.74F);
                    break;

                case 3:
                    GL11.glTranslatef(par1 + 0.5F, par2 + 0.25F, par3 + 0.26F);
                    par5 = 180.0F;
                    break;

                case 4:
                    GL11.glTranslatef(par1 + 0.74F, par2 + 0.25F, par3 + 0.5F);
                    par5 = 270.0F;
                    break;

                case 5:
                default:
                    GL11.glTranslatef(par1 + 0.26F, par2 + 0.25F, par3 + 0.5F);
                    par5 = 90.0F;
            }
        }
        else
        {
            GL11.glTranslatef(par1 + 0.5F, par2, par3 + 0.5F);
        }

        float var10 = 0.0625F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);

        if( type == MobHeadsUtil.SLIME)
        {
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        }

        model.render((Entity)null, 0.0F, 0.0F, 0.0F, par5, 0.0F, var10);

        if (type == MobHeadsUtil.SHEEP
         || type == MobHeadsUtil.SHEEP_FAMISHED
         || type == MobHeadsUtil.SHEEP_STARVING )
        {
            float var4 = 1.0F;
            GL11.glColor3f(var4 * EntitySheep.fleeceColorTable[fleeceColor][0], var4 * EntitySheep.fleeceColorTable[fleeceColor][1], var4 * EntitySheep.fleeceColorTable[fleeceColor][2]);

            sheepOverlay.render((Entity)null, 0.0F, 0.0F, 0.0F, par5, 0.0F, var10);
        }
        else if ( MobHeadsUtil.isSpiderType(type) )
        {
            renderGlowingEyes( model, par5, "/mob/spider_eyes.png");
        }
        else if( type == MobHeadsUtil.ENDERMAN )
        {
            model = endermanEyes;
            renderGlowingEyes( model, par5, "/btwmodtex/fcInfusedSkullEyes.png");
        }
        else if ( type == MobHeadsUtil.VILLAGER_PRIEST )
        {
            renderGlowingEyes( model, par5, "/shmodtex/heads/villagerPriestEyes.png");
        }
        else if ( type == MobHeadsUtil.GHAST_SCREAMING )
        {
            renderGlowingEyes( model, par5, "/shmodtex/heads/ghastScreamingEyes.png");
        }
        else if ( type == MobHeadsUtil.WOLF_ANGRY || type == MobHeadsUtil.WOLF_DIRE )
        {
            renderGlowingEyes( model, par5, "/shmodtex/heads/wolfEyes.png");
        }
        else if ( type == MobHeadsUtil.MAGMACUBE )
        {
            renderGlowingEyes( model, par5, "/shmodtex/heads/magmacubeEyes.png");
        }
//        else if (par6 == 38)
//        {
//        	renderCreeperGlow( mobOverlay, par5);
//        }

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

    private void renderGlowingEyes( MobHeadModel model, float fYaw, String texture )
    {
        bindTextureByName(texture);
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

package btw.community.sockthing.block.tileentity;

import btw.community.sockthing.block.models.HatModel;
import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.*;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@Environment(EnvType.CLIENT)
public class HatTileEntityRenderer extends TileEntitySpecialRenderer {
    public static HatTileEntityRenderer hatRenderer;
    private HatModel model = new HatModel();

    /**
     * Render a skull tile entity.
     */
    public void renderTileEntityHatAt(HatTileEntity tileEntityHat, double par2, double par4, double par6, float par8)
    {
        this.drawHat((float)par2, (float)par4, (float)par6,
                tileEntityHat.getBlockMetadata() & 7,
                (float)(tileEntityHat.getHatRotation() * 360) / 16.0F,
                tileEntityHat.getHatType(),
                tileEntityHat.getXShift(),
                tileEntityHat.getYShift(),
                tileEntityHat.getZShift(),
                false,
                0F, 0F, 0F
        );
    }

    /**
     * Associate a TileEntityRenderer with this TileEntitySpecialRenderer
     */
    public void setTileEntityRenderer(TileEntityRenderer tileEntityRenderer)
    {
        super.setTileEntityRenderer(tileEntityRenderer);
        hatRenderer = this;
    }

    public void drawHat(float xPos, float yPos, float zPos, int facing, float rot, int type, float xShift, float yShift, float zShift,boolean renderPlayer, float rotX, float rotY, float rotZ)
    {
        HatModel hatModel = this.model;
        float scale = 0.0625F;

        //Switch texture
        switch (type)
        {
            case HatsUtil.FARMER:
            default:
                this.bindTextureByName("/shmodtex/hats/farmer.png");
                break;

            case HatsUtil.WITCH:
                this.bindTextureByName("/shmodtex/hats/witch.png");
                break;

            case HatsUtil.TOP:
                this.bindTextureByName("/shmodtex/hats/top.png");
                break;

            case HatsUtil.CHEF:
                this.bindTextureByName("/shmodtex/hats/chef.png");
                break;

            case HatsUtil.FLOWER:
                this.bindTextureByName("/shmodtex/hats/flower.png");
                break;

            case HatsUtil.WOLF:
                this.bindTextureByName("/shmodtex/hats/wolf.png");
                break;

            case HatsUtil.BEAST:
                this.bindTextureByName("/shmodtex/hats/direwolf.png");
                break;

            case HatsUtil.BIG:
                this.bindTextureByName("/shmodtex/hats/big.png");
                break;

            case HatsUtil.CROWN:
                this.bindTextureByName("/shmodtex/hats/crown.png");
                break;

            case HatsUtil.SQUID:
                this.bindTextureByName("/shmodtex/hats/babysquid.png");
                break;

            case HatsUtil.USHANKA:
                this.bindTextureByName("/shmodtex/hats/ushanka.png");
                break;

            case HatsUtil.FROG:
                this.bindTextureByName("/shmodtex/hats/frog.png");
                break;

            case HatsUtil.PUMPKIN:
                this.bindTextureByName("/shmodtex/hats/pumpkin.png");
                break;

            case HatsUtil.CAP:
                this.bindTextureByName("/shmodtex/hats/cap.png");
                break;

            case HatsUtil.DINO:
                this.bindTextureByName("/shmodtex/hats/dino.png");
                break;

            case HatsUtil.FEZ:
                this.bindTextureByName("/shmodtex/hats/fez.png");
                break;

            case HatsUtil.SANTA:
                this.bindTextureByName("/shmodtex/hats/santa.png");
                break;

            case HatsUtil.FRUIT:
                this.bindTextureByName("/shmodtex/hats/fruit.png");
                break;

            case HatsUtil.BAT:
                this.bindTextureByName("/shmodtex/hats/bat.png");
                break;

            case HatsUtil.SPIDER:
                this.bindTextureByName("/shmodtex/hats/spider.png");
                break;

            case HatsUtil.ARROW:
                this.bindTextureByName("/shmodtex/hats/arrow.png");
                break;

            case HatsUtil.PIRATE:
                this.bindTextureByName("/shmodtex/hats/pirate.png");
                break;

            case HatsUtil.COWBOY:
                this.bindTextureByName("/shmodtex/hats/cowboy.png");
                break;

            case HatsUtil.DEVIL:
                this.bindTextureByName("/shmodtex/hats/devil.png");
                break;

            case HatsUtil.BANDANNA:
                this.bindTextureByName("/shmodtex/hats/bandanna.png");
                break;

            case HatsUtil.CAT:
                this.bindTextureByName("/shmodtex/hats/cat.png");
                break;

            case HatsUtil.MUSHROOM_RED:
                this.bindTextureByName("/shmodtex/hats/mushroom_red.png");
                break;

            case HatsUtil.MUSHROOM_BROWN:
                this.bindTextureByName("/shmodtex/hats/mushroom_brown.png");
                break;

        }

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);

        //Rotate Hat
        if (facing != 1)
        {
            switch (facing)
            {
                case 2:
                    GL11.glTranslatef(xPos + 0.5F, yPos + 0.5F, zPos + 1F);
                    GL11.glRotatef(-90F, 1F, 0F, 0F);
                    break;

                case 3:
                    GL11.glTranslatef(xPos + 0.5F, yPos + 0.5F, zPos + 0F);
                    rot = 180.0F;
                    GL11.glRotatef(90F, 1F, 0F, 0F);
                    break;

                case 4:
                    GL11.glTranslatef(xPos + 1F, yPos + 0.5F, zPos + 0.5F);
                    rot = 270.0F;
                    GL11.glRotatef(90F, 0F , 0F, 1F);
                    break;

                case 5:
                default:
                    GL11.glTranslatef(xPos + 0F, yPos + 0.5F, zPos + 0.5F);
                    rot = 90.0F;
                    GL11.glRotatef(-90F, 0F , 0F, 1F);
            }

        }
        else
        {
            GL11.glTranslatef(xPos + 0.5F, yPos, zPos + 0.5F);
        }

        //Render hat on player
        if (renderPlayer)
        {
            GL11.glRotatef(180F, 0F, 1F, 0F);

            switch (type)
            {
                default:
                    yShift = 6/16F;

                case HatsUtil.FARMER: //Farmer
                    yShift = 4/16F;
                    break;

                case HatsUtil.WITCH: //Witch
                case HatsUtil.SANTA: //Santa
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 11/32F;
                    break;

                case HatsUtil.TOP: //Top
                    yShift = 7/16F;
                    break;

                case HatsUtil.CHEF: //Chef
                    yShift = 5/16F;
                    break;

                case HatsUtil.FLOWER: //Flower
                    yShift = 5/16F;
                    break;

                case HatsUtil.WOLF: //Wolf
                case HatsUtil.BEAST: //Direwolf
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 4/16F;
                    break;

                case HatsUtil.BIG: //Big
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 4/16F;
                    break;

                case HatsUtil.CROWN: //Crown
                    yShift = 5/16F;
                    break;

                case HatsUtil.SQUID: //BabySquid
                    GL11.glRotatef(-45F, 0F, 1F, 0F);
                    GL11.glRotatef(30F, 1F, 0F, 0F);
                    GL11.glTranslatef(0, 0, - 1/16F);
                    yShift = 6/16F;
                    break;

                case HatsUtil.USHANKA: //Ushanka
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 2/16F;
                    break;

                case HatsUtil.PUMPKIN: //Pumpkin
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 0/16F;
                    break;

                case HatsUtil.CAP: //Cap
                   // GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 5/16F;
                    break;

                case HatsUtil.DINO: //Dino
                   // GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 0/16F;
                    break;

                case HatsUtil.FEZ: //Fez
                   // GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 7/16F;
                    break;

                case HatsUtil.FRUIT: //Fruit
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 15/32F;
                    break;

                case HatsUtil.BAT: //Bat
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 0/16F;
                    break;

                case HatsUtil.SPIDER: //Spider
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 1/16F;
                    break;

                case HatsUtil.ARROW: //Arrow
                    //GL11.glRotatef(180F, 0F, 1F, 0F);
                    yShift = 4/16F;
                    break;

                case HatsUtil.PIRATE:
                    yShift = 11/32F;
                    break;

                case HatsUtil.COWBOY:
                    yShift = 6/16F;
                    break;

                case HatsUtil.BANDANNA:
                    yShift = -1/32F;
                    break;

                case HatsUtil.MUSHROOM_RED:
                case HatsUtil.MUSHROOM_BROWN:
                    GL11.glRotatef(15F, 1F, 0F, 0F);
                    yShift = 5/16F;
                    break;

            }
        }

        //Special Render Settings
        switch (type)
        {
            case HatsUtil.FROG: //Frog
                scale = 0.0625F * 1.125F;
                break;
        }

        GL11.glTranslatef(xShift, yShift, zShift);

        GL11.glRotatef(rotX, 1F , 0F, 0F);
        GL11.glRotatef(rotY, 0F , 1F, 0F);
        GL11.glRotatef(rotZ, 0F , 0F, 1F);


        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);

        hatModel.render((Entity)null, type, 0.0F, 0.0F, rot, 0.0F, scale);

        if ( type == HatsUtil.SPIDER )
        {
            renderGlowingEyes( hatModel, type, rot, scale, "/shmodtex/hats/overlays/spiderEyes.png");
        }
        else if ( type == HatsUtil.BEAST )
        {
            renderGlowingEyes( hatModel, type, rot, scale, "/shmodtex/hats/overlays/direwolfEyes.png");
        }

        GL11.glPopMatrix();
    }

    public void renderTileEntityAt(TileEntity tileEntity, double par2, double par4, double par6, float par8)
    {
        this.renderTileEntityHatAt((HatTileEntity)tileEntity, par2, par4, par6, par8);
    }

    private void renderGlowingEyes(HatModel model, int type, float fYaw, float scale, String texture )
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

        model.render((Entity)null, type, 0.0F, 0.0F, fYaw, 0.0F, scale);
    }
}

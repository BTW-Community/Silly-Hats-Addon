package net.minecraft.src;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class SHTileEntityHatRenderer extends TileEntitySpecialRenderer
{
    public static SHTileEntityHatRenderer hatRenderer;
    private SHModelHat model = new SHModelHat();

    /**
     * Render a skull tile entity.
     */
    public void renderTileEntityHatAt(SHTileEntityHat tileEntityHat, double par2, double par4, double par6, float par8)
    {
        this.drawHat((float)par2, (float)par4, (float)par6, tileEntityHat.getBlockMetadata() & 7, (float)(tileEntityHat.getHatRotation() * 360) / 16.0F, tileEntityHat.getHatType() );
    }

    /**
     * Associate a TileEntityRenderer with this TileEntitySpecialRenderer
     */
    public void setTileEntityRenderer(TileEntityRenderer tileEntityRenderer)
    {
        super.setTileEntityRenderer(tileEntityRenderer);
        hatRenderer = this;
    }

    public void drawHat(float xPos, float yPos, float zPos, int meta, float rot, int type)
    {
        SHModelHat var8 = this.model;

        switch (type)
        {
            case 0:
            default:
                this.bindTextureByName("/hats/farmer.png");
                break;

            case 1:
                this.bindTextureByName("/hats/witch.png");
                break;

            case 2:
                this.bindTextureByName("/hats/top.png");
                break;
                
            case 3:
                this.bindTextureByName("/hats/chef.png");
                break;
                
            case 4:
                this.bindTextureByName("/hats/flower.png");
                break;
                
            case 5:
                this.bindTextureByName("/hats/wolf.png");
                break;
                
            case 6:
                this.bindTextureByName("/hats/direwolf.png");
                break;   
                
            case 7:
                this.bindTextureByName("/hats/big.png");
                break;
                
            case 8:
                this.bindTextureByName("/hats/crown.png");
                break;
                
            case 9:
                this.bindTextureByName("/hats/babysquid.png");
                break;
                
            case 10:
                this.bindTextureByName("/hats/ushanka.png");
                break;  
                
            case 11:
                this.bindTextureByName("/hats/frog.png");
                break;   

        }

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);

        if (meta != 1)
        {
            switch (meta)
            {
                case 2:
                    GL11.glTranslatef(xPos + 0.5F, yPos + 0.25F, zPos + 0.74F);
                    break;

                case 3:
                    GL11.glTranslatef(xPos + 0.5F, yPos + 0.25F, zPos + 0.26F);
                    rot = 180.0F;
                    break;

                case 4:
                    GL11.glTranslatef(xPos + 0.74F, yPos + 0.25F, zPos + 0.5F);
                    rot = 270.0F;
                    break;

                case 5:
                default:
                    GL11.glTranslatef(xPos + 0.26F, yPos + 0.25F, zPos + 0.5F);
                    rot = 90.0F;
            }
        }
        else
        {
            GL11.glTranslatef(xPos + 0.5F, yPos, zPos + 0.5F);
            
        }
        
        GL11.glRotatef(180F, 0, 1, 0);
        
        float var10 = 0.0625F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        
        var8.render((Entity)null, type, 0.0F, 0.0F, rot, 0.0F, var10);
        
        GL11.glPopMatrix();
    }

    public void renderTileEntityAt(TileEntity tileEntity, double par2, double par4, double par6, float par8)
    {
        this.renderTileEntityHatAt((SHTileEntityHat)tileEntity, par2, par4, par6, par8);
    }
 
}

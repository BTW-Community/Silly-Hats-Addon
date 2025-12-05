package btw.community.sockthing.utils;

import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import net.minecraft.src.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class MobHeadType {
    @NotNull
    protected int id;
    @NotNull
    protected String name;
    protected String sound;
    @NotNull
    protected MobHeadModel model;
    @NotNull
    protected String texture;
    protected String glowingTexture;
    @NotNull
    protected float pitch;
    @NotNull
    protected float volume;

    protected AxisAlignedBB blockBounds;

    public MobHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model, String texture, String glowingTexture){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
        this.model = model;
        this.texture = setupTexture(texture);
        this.glowingTexture = setupTexture(glowingTexture);
        this.blockBounds = getBlockBounds();
    }


    public MobHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model, String texture){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
        this.model = model;
        this.texture = setupTexture(texture);
        this.glowingTexture = null;
        this.blockBounds = getBlockBounds();
    }

    public MobHeadType(int id, String name, String sound){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = 1F;
        this.pitch = 1F;
        this.model = MobHeadTileEntityRenderer.BASE;
        this.texture = setupTexture(name);
        this.glowingTexture = null;
        this.blockBounds = getBlockBounds();
    }

    public MobHeadType(int id, String name, String sound, float volume, float pitch){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
        this.model = MobHeadTileEntityRenderer.BASE;
        this.texture = setupTexture(name);
        this.glowingTexture = null;
        this.blockBounds = getBlockBounds();
    }

    public MobHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
        this.model = model;
        this.texture = setupTexture(name);
        this.glowingTexture = null;
        this.blockBounds = getBlockBounds();
    }

    public MobHeadType(int id, String name, String sound, MobHeadModel model){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = 1F;
        this.pitch = 1F;
        this.model = model;
        this.texture = setupTexture(name);
        this.glowingTexture = null;
        this.blockBounds = getBlockBounds();
    }

    public MobHeadType(int id, String name, String sound, MobHeadModel model, String glowingTexture){
        this.id = id;
        this.name = name;
        this.sound = sound;
        this.volume = 1F;
        this.pitch = 1F;
        this.model = model;
        this.texture = setupTexture(name);
        this.glowingTexture = setupTexture(glowingTexture);
        this.blockBounds = getBlockBounds();
    }

    protected String setupTexture(String texture) {
        if (texture == null) return null;

        if (texture.startsWith("/")) {
            return texture;
        }
        else return "/shmodtex/heads/" + texture + ".png";
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public float getPitch() {
        return pitch;
    }

    public float getVolume() {
        return volume;
    }

    public MobHeadModel getModel() {
        return model;
    }

    public String getModelTexture() {
        return texture;
    }

    public String getGlowingTexture() {
        return glowingTexture;
    }

    public AxisAlignedBB getBlockBounds() {
        return new AxisAlignedBB(
                0.25F, 0.0F, 0.25F,
                0.75F, 8/16F, 0.75F);
    }

    public float translateModel(float xPos, float yPos, float zPos, int direction, float rotation, int type, int fleeceColor){

        GL11.glTranslatef(xPos + 0.5F, yPos, zPos + 0.5F);  // ← kept exactly

        AxisAlignedBB bounds = getBlockBounds();

        float[] offsets = MobHeadsUtil.computeOffsets(bounds, direction);

        GL11.glTranslatef(offsets[0], offsets[1], offsets[2]);

        return rotation + offsets[3];
    }

    public void preRender(float xPos, float yPos, float zPos, int meta, float par5, int type, int fleeceColor, float var10){

    }

    public void postRender(float xPos, float yPos, float zPos, int meta, float par5, int type, int fleeceColor, float var10){

    }
}

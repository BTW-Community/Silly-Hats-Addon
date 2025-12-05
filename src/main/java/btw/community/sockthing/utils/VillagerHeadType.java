package btw.community.sockthing.utils;

import btw.community.sockthing.block.models.MobHeadModel;
import btw.community.sockthing.block.models.VillagerHeadModel;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Entity;
import net.minecraft.src.EntitySheep;
import org.lwjgl.opengl.GL11;

public class VillagerHeadType extends MobHeadType{
    public VillagerHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model, String texture, String glowingTexture) {
        super(id, name, sound, volume, pitch, model, texture, glowingTexture);
    }

    public VillagerHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model) {
        super(id, name, sound, volume, pitch, model);
    }

    public VillagerHeadType(int id, String name, String sound, float volume, float pitch, MobHeadModel model, String glowingTexture){
        super(id, name, sound, model, glowingTexture);
        this.volume = volume;
        this.pitch = pitch;
    }

    @Override
    public AxisAlignedBB getBlockBounds() {
        return new AxisAlignedBB(
                0.25F, 0.0F, 0.25F,
                0.75F, 10/16F, 0.75F);
    }
}

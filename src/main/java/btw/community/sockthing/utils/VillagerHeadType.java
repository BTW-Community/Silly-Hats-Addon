package btw.community.sockthing.utils;

import btw.community.sockthing.block.models.MobHeadModel;
import net.minecraft.src.AxisAlignedBB;

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

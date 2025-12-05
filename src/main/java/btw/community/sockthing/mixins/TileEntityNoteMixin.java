package btw.community.sockthing.mixins;

import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TileEntityNote.class)
public abstract class TileEntityNoteMixin extends TileEntity {

    @Inject(method = "triggerNote", at = @At(value = "HEAD"),cancellable = true)
    public void playMobSounds(World world, int x, int y, int z, CallbackInfo ci){
        if (world.getBlockId(x,y+1,z) == Block.skull.blockID)
        {
            TileEntity te = world.getBlockTileEntity(x,y+1,z);
            int headType = ((TileEntitySkull)te).getSkullType();

            String sound = null;
            switch (headType){
                case 0: //Skeleton
                    sound = "mob.skeleton.say";
                    break;

                case 1: //Wither Skeleton
                    sound = "mob.skeleton.hurt";
                    break;

                case 2: //Zombie
                    sound = "mob.zombie.say";
                    break;

                case 3: //Player
                    sound = "random.eat";
                    break;

                case 4: //Creeper
                    sound = "random.fuse";
                    break;

                case 5: //Infused Skull
                    sound = "mob.endermen.scream";
                    break;
            }

            if (sound != null)
            {
                world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, sound, 1F, 1F);
            }

            ci.cancel();

        }
        else if (world.getBlockId(x,y+1,z) == SHBlocks.ID_MOB_HEAD)
        {
            TileEntity te = world.getBlockTileEntity(x,y+1,z);
            int headType = ((MobHeadTileEntity)te).getHeadType();

            String sound = MobHeadsUtil.mobHeads.get(headType).getSound();
            float volume = MobHeadsUtil.mobHeads.get(headType).getVolume();
            float pitch = MobHeadsUtil.mobHeads.get(headType).getPitch();

            if (sound != null)
            {
                world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, sound, volume, pitch);
            }

            ci.cancel();
        }

    }
}

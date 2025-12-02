package btw.community.sockthing.mixins;

import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.SkeletonEntity;
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
                    sound = "";
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

            String sound = null;
            float volume = 1.0F;
            float pitch = 1.0F;

            switch (headType) {
                case MobHeadsUtil.OCELOT:
                    sound = "mob.cat.hitt";
                    break;

                case MobHeadsUtil.CAT_BLACK:
                case MobHeadsUtil.CAT_ORANGE:
                case MobHeadsUtil.CAT_WHITE:
                    sound = "mob.cat.meow";
                    break;

                case MobHeadsUtil.CAT_TABBY:
                    sound = "mob.cat.purr";
                    break;


                case MobHeadsUtil.CHICKEN:
                    sound = "mob.chicken.say";
                    break;

                case MobHeadsUtil.CHICKEN_FAMISHED:
                    sound = "mob.chicken.say";
                    pitch = 0.9F;
                    break;

                case MobHeadsUtil.CHICKEN_STARVING:
                    sound = "mob.chicken.hurt";
                    break;

                case MobHeadsUtil.COW:
                    sound = "mob.cow.say";
                    break;

                case MobHeadsUtil.COW_FAMISHED:
                    sound = "mob.cow.say";
                    pitch = 0.9F;
                    break;

                case MobHeadsUtil.COW_STARVING:
                    sound = "mob.cow.hurt";
                    break;

                case MobHeadsUtil.COW_HARNESS:
                    sound = "mob.cow.hurt";
                    volume = 0.5F;
                    pitch = 0.8F;
                    break;

                case MobHeadsUtil.PIG:
                    sound = "mob.pig.say";
                    break;

                case MobHeadsUtil.PIG_FAMISHED:
                    sound = "mob.pig.say";
                    pitch = 0.9F;
                    break;

                case MobHeadsUtil.PIG_STARVING:
                    sound = "mob.pig.hurt";
                    break;

                case MobHeadsUtil.PIG_HARNESS:
                    sound = "mob.pig.hurt";
                    volume = 0.5F;
                    pitch = 0.8F;
                    break;

                case MobHeadsUtil.SHEEP:
                    sound = "mob.sheep.say";
                    break;

                case MobHeadsUtil.SHEEP_FAMISHED:
                    sound = "mob.sheep.say";
                    pitch = 0.9F;
                    break;

                case MobHeadsUtil.SHEEP_STARVING:
                    sound = "mob.sheep.hurt";
                    break;

                case MobHeadsUtil.SHEEP_HARNESS:
                    sound = "mob.sheep.hurt";
                    volume = 0.5F;
                    pitch = 0.8F;
                    break;

                case MobHeadsUtil.MOOSHROOM:
                    sound = "mob.cow.say";
                    break;

                case MobHeadsUtil.MOOSHROOM_FAMISHED:
                    sound = "mob.cow.say";
                    pitch = 0.9F;
                    break;

                case MobHeadsUtil.MOOSHROOM_STARVING:
                    sound = "mob.cow.hurt";
                    break;

                case MobHeadsUtil.MOOSHROOM_HARNESS:
                    sound = "mob.cow.hurt";
                    volume = 0.5F;
                    pitch = 0.8F;
                    break;

                case MobHeadsUtil.DOG:
                    sound = "mob.wolf.panting";
                    break;

                case MobHeadsUtil.WOLF:
                    sound = "mob.wolf.bark";
                    break;

                case MobHeadsUtil.WOLF_ANGRY:
                    sound = "mob.wolf.growl";
                    break;

                case MobHeadsUtil.WOLF_HUNGRY:
                    sound = "mob.wolf.whine";
                    break;

                case MobHeadsUtil.WOLF_DIRE:
                    sound = "mob.wolf.growl";
                    volume = 3.0F;
                    pitch = 0.9F;
                    break;

                case MobHeadsUtil.VILLAGER:
                    break;

                case MobHeadsUtil.VILLAGER_DIRTY:
                    break;

                case MobHeadsUtil.VILLAGER_LIBRARIAN:
                    break;

                case MobHeadsUtil.VILLAGER_PRIEST:
                    break;

                case MobHeadsUtil.VILLAGER_BUTCHER:
                    break;

                case MobHeadsUtil.WITCH:
                    sound = "mob.ghast.affectionate scream";
                    volume *= 0.25F;
                    pitch = 0.5F + world.rand.nextFloat() * 0.25F;
                    break;

                case MobHeadsUtil.VILLAGER_ZOMBIE:
                    sound = "mob.zombie.say";
                    pitch = (world.rand.nextFloat() - world.rand.nextFloat() ) * 0.2F + 0.7F;
                    break;

                case MobHeadsUtil.GOLEM:
                    sound = "mob.irongolem.hit";
                    break;

                case MobHeadsUtil.SNOWMAN:
                    break;

                case MobHeadsUtil.CREEPER_NEUTERED:
                    sound = "mob.creeper.say";
                    volume = 0.25F;
                    pitch += 0.25F;
                    break;

                case MobHeadsUtil.SPIDER:
                    sound = "mob.spider.say";
                    break;

                case MobHeadsUtil.SPIDER_CAVE:
                    sound = "mob.spider.say";
                    break;

                case MobHeadsUtil.SPIDER_JUNGLE:
                    sound = "mob.spider.say";
                    break;

                case MobHeadsUtil.ENDERMAN:
                    sound = "mob.endermen.stare";
                    break;

                case MobHeadsUtil.BLAZE:
                    sound = "mob.blaze.breathe";
                    break;

                case MobHeadsUtil.GHAST:
                    sound = "mob.ghast.moan";
                    break;

                case MobHeadsUtil.GHAST_SCREAMING:
                    sound = "mob.ghast.scream";
                    break;

                case MobHeadsUtil.MAGMACUBE:
                    sound = "mob.magmacube.big";
                    break;

                case MobHeadsUtil.PIGMAN:
                    sound = "mob.zombiepig.zpig";
                    break;

                case MobHeadsUtil.SLIME:
                    sound = "mob.slime.big";
                    break;

                case MobHeadsUtil.SQUID:
                    break;

                case MobHeadsUtil.BAT:
                    sound = "mob.bat.idle";
                    break;

            }

            if (sound != null)
            {
                world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, sound, volume, pitch);
            }

            ci.cancel();
        }

    }
}

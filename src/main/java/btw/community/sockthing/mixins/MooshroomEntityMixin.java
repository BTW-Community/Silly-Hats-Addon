package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.CowEntity;
import btw.entity.mob.PigEntity;
import net.minecraft.src.EntityMooshroom;
import net.minecraft.src.EntityPig;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityMooshroom.class)
public abstract class MooshroomEntityMixin extends CowEntity {
    public MooshroomEntityMixin(World world) {
        super(world);
    }

    @Override
    protected void dropFewItems( boolean killedByPlayer, int lootingModifier )
    {
        if (!this.worldObj.isRemote && rand.nextFloat() <= 0.10F)
        {
            if (rand.nextFloat() <= 0.50F) {
                entityDropItem( new ItemStack(SHItems.hat.itemID, 1, HatsUtil.MUSHROOM_RED), 0F );
            }
            else entityDropItem( new ItemStack(SHItems.hat.itemID, 1, HatsUtil.MUSHROOM_BROWN), 0F );
        }

        super.dropFewItems(killedByPlayer, lootingModifier);
    }

    @Override
    protected void dropHead() {
        if (getWearingBreedingHarness())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.MOOSHROOM_HARNESS), 0F );
        }
        else {
            if (isFamished())
            {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.MOOSHROOM_FAMISHED), 0F );
            }
            else if (isStarving())
            {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.MOOSHROOM_STARVING), 0F );
            }
            else {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.MOOSHROOM), 0F );
            }
        }
    }
}

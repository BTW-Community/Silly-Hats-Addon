package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.ChickenEntity;
import btw.entity.mob.PigEntity;
import net.minecraft.src.EntityChicken;
import net.minecraft.src.EntityPig;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PigEntity.class)
public abstract class PigEntityMixin extends EntityPig {
    public PigEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        if (getWearingBreedingHarness())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.PIG_HARNESS), 0F );
        }
        else {
            if (isFamished())
            {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.PIG_FAMISHED), 0F );
            }
            else if (isStarving())
            {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.PIG_STARVING), 0F );
            }
            else {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.PIG), 0F );
            }
        }
    }
}

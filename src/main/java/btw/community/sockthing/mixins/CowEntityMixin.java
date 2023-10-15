package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.ChickenEntity;
import btw.entity.mob.CowEntity;
import net.minecraft.src.EntityChicken;
import net.minecraft.src.EntityCow;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CowEntity.class)
public abstract class CowEntityMixin extends EntityCow {
    public CowEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        if (getWearingBreedingHarness())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.COW_HARNESS), 0F );
        }
        else {
            if (isFamished())
            {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.COW_FAMISHED), 0F );
            }
            else if (isStarving())
            {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.COW_STARVING), 0F );
            }
            else {
                entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.COW), 0F );
            }
        }
    }
}
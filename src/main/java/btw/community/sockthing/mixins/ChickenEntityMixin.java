package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.ChickenEntity;
import net.minecraft.src.EntityChicken;
import net.minecraft.src.EntityOcelot;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ChickenEntity.class)
public abstract class ChickenEntityMixin extends EntityChicken {
    public ChickenEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        if (isFamished())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.CHICKEN_FAMISHED), 0F );
        }
        else if (isStarving())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.CHICKEN_STARVING), 0F );
        }
        else {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.CHICKEN), 0F );
        }
    }
}

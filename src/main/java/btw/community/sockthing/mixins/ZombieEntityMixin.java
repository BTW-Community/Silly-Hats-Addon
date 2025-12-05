package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.ZombieEntity;
import net.minecraft.src.EntityZombie;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ZombieEntity.class)
public abstract class ZombieEntityMixin extends EntityZombie {
    public ZombieEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        if (isVillager())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.VILLAGER_ZOMBIE), 0F );
        }
        else entityDropItem( new ItemStack( Item.skull.itemID, 1, 2 ), 0F );
    }
}


package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntitySilverfish.class)
public abstract class EntitySilverfishMixin extends EntityMob {
    public EntitySilverfishMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SILVERFISH), 0F );
    }
}

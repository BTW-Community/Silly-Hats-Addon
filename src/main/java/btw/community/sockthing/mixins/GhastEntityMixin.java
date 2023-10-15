package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.EndermanEntity;
import btw.entity.mob.GhastEntity;
import net.minecraft.src.EntityEnderman;
import net.minecraft.src.EntityGhast;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(GhastEntity.class)
public abstract class GhastEntityMixin extends EntityGhast {
    public GhastEntityMixin(World world) {
        super(world);
    }

    @Override
    protected void dropHead() {
        boolean mouthOpen = dataWatcher.getWatchableObjectByte( 16 ) != 0;
        if (mouthOpen)
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.GHAST_SCREAMING), 0F );
        }
        else entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.GHAST), 0F );
    }
}

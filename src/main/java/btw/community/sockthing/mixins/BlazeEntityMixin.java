package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.BlazeEntity;
import net.minecraft.src.EntityBlaze;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlazeEntity.class)
public abstract class BlazeEntityMixin extends EntityBlaze {
    public BlazeEntityMixin(World world) {
        super(world);
    }

    @Override
    protected void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.BLAZE), 0F );
    }
}

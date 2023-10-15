package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.EndermanEntity;
import btw.entity.mob.JungleSpiderEntity;
import btw.entity.mob.SpiderEntity;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SpiderEntity.class)
public abstract class SpiderEntityMixin extends EntitySpider {
    public SpiderEntityMixin(World world) {
        super(world);
    }

    @Override
    protected void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SPIDER), 0F );
    }
}

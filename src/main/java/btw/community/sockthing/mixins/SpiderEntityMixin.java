package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.CaveSpiderEntity;
import btw.entity.mob.JungleSpiderEntity;
import btw.entity.mob.SpiderEntity;
import net.minecraft.src.EntitySpider;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SpiderEntity.class)
public abstract class SpiderEntityMixin extends EntitySpider {
    public SpiderEntityMixin(World world) {
        super(world);
    }

    @Override
    protected void dropHead() {
        SpiderEntity thisSpider = (SpiderEntity)(Object)this;

        if (thisSpider instanceof CaveSpiderEntity){
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SPIDER_CAVE), 0F );
        }
        else if (thisSpider instanceof JungleSpiderEntity){
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SPIDER_JUNGLE), 0F );
        }
        else {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SPIDER), 0F );
        }

    }
}

package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.JungleSpiderEntity;
import btw.entity.mob.SpiderEntity;
import net.minecraft.src.EntityCaveSpider;
import net.minecraft.src.EntitySpider;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityCaveSpider.class)
public abstract class EntityCaveSpiderMixin extends EntitySpider {
    public EntityCaveSpiderMixin(World world) {
        super(world);
    }

    @Override
    protected void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SPIDER_CAVE), 0F );
    }
}
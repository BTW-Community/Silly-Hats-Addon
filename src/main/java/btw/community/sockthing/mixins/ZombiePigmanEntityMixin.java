package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.MagmaCubeEntity;
import btw.entity.mob.ZombiePigmanEntity;
import net.minecraft.src.EntityMagmaCube;
import net.minecraft.src.EntityPigZombie;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ZombiePigmanEntity.class)
public abstract class ZombiePigmanEntityMixin extends EntityPigZombie {
    public ZombiePigmanEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.PIGMAN), 0F );
    }
}

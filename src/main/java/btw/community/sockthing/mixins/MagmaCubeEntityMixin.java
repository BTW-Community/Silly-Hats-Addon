package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.EndermanEntity;
import btw.entity.mob.MagmaCubeEntity;
import net.minecraft.src.EntityEnderman;
import net.minecraft.src.EntityMagmaCube;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MagmaCubeEntity.class)
public abstract class MagmaCubeEntityMixin extends EntityMagmaCube {
    public MagmaCubeEntityMixin(World world) {
        super(world);
    }

    @Override
    protected void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.MAGMACUBE), 0F );
    }
}

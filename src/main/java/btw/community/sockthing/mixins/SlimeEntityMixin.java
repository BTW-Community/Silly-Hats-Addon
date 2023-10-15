package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.MagmaCubeEntity;
import btw.entity.mob.SlimeEntity;
import net.minecraft.src.EntityMagmaCube;
import net.minecraft.src.EntitySlime;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SlimeEntity.class)
public abstract class SlimeEntityMixin extends EntitySlime {
    public SlimeEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.SLIME), 0F );
    }
}

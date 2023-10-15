package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.OcelotEntity;
import net.minecraft.src.EntityOcelot;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(OcelotEntity.class)
public abstract class OcelotEntityMixin extends EntityOcelot {
    public OcelotEntityMixin(World world) {
        super(world);
    }

    @Override
    public void dropHead() {
        if (!isTamed())
        {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, MobHeadsUtil.OCELOT), 0F );
        }
        else {
            int type = 0;
            switch (this.getTameSkin())
            {
                default:
                case 0:
                    type = MobHeadsUtil.OCELOT;
                    break;
                case 1:
                    type = MobHeadsUtil.CAT_BLACK;
                    break;
                case 2:
                    type = MobHeadsUtil.CAT_ORANGE;
                    break;
                case 3:
                    type = MobHeadsUtil.CAT_WHITE;
                    break;
                case 22:
                    type = MobHeadsUtil.CAT_TABBY;
                    break;
            }

            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, type), 0F );
        }
    }
}

package btw.community.sockthing.mixins;

import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.entity.mob.CowEntity;
import btw.entity.mob.villager.VillagerEntity;
import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(VillagerEntity.class)
public abstract class VillagerEntityMixin extends EntityVillager {
    @Shadow public abstract int getCurrentTradeLevel();

    @Shadow public abstract int getCurrentTradeXP();

    @Shadow public abstract int getDirtyPeasant();

    public VillagerEntityMixin(World world) {
        super(world);
    }

    @Override
    public void onDeath(DamageSource par1DamageSource) {
        dropVillagerHead();

        super.onDeath(par1DamageSource);
    }

    protected void dropVillagerHead() {
        int headType;
        int profession = getProfession();
        int tradeLevel = getCurrentTradeLevel();

        if (tradeLevel == 5)
        {
            switch (profession) {
                default:
                case VillagerEntity.PROFESSION_ID_FARMER:
                case VillagerEntity.PROFESSION_ID_BLACKSMITH:
                    headType = MobHeadsUtil.VILLAGER;
                    break;

                case VillagerEntity.PROFESSION_ID_LIBRARIAN:
                    headType = MobHeadsUtil.VILLAGER_LIBRARIAN;
                    break;

                case VillagerEntity.PROFESSION_ID_PRIEST:
                    headType = MobHeadsUtil.VILLAGER_PRIEST;
                    break;

                case VillagerEntity.PROFESSION_ID_BUTCHER:
                    headType = MobHeadsUtil.VILLAGER_BUTCHER;
                    break;
            }
        }
        else {
            if (profession == VillagerEntity.PROFESSION_ID_FARMER && getDirtyPeasant() == 0) {
                headType = MobHeadsUtil.VILLAGER_DIRTY;
            }
            else {
                headType = MobHeadsUtil.VILLAGER;
            }
        }

        if (!worldObj.isRemote) {
            entityDropItem( new ItemStack(SHItems.mobHead.itemID, 1, headType), 0F );
        }

    }
}
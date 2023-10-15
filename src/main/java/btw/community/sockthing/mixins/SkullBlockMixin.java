package btw.community.sockthing.mixins;

import btw.block.blocks.SkullBlock;
import net.minecraft.src.BlockSkull;
import net.minecraft.src.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SkullBlock.class)
public abstract class SkullBlockMixin extends BlockSkull {
    protected SkullBlockMixin(int blockID) {
        super(blockID);
    }

    @Override
    public boolean hasCenterHardPointToFacing(IBlockAccess blockAccess, int i, int j, int k, int iFacing, boolean bIgnoreTransparency) {
        return iFacing == 1;
    }

}

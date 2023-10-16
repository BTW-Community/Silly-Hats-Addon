package btw.community.sockthing.block.tileentity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.TileEntityRenderer;

@Environment(EnvType.CLIENT)
public class TileEntityRenderMapper {
    public static void initTileEntityRender() {
        TileEntityRenderer.instance.addSpecialRendererForClass (HatTileEntity.class, new HatTileEntityRenderer() );

        TileEntityRenderer.instance.addSpecialRendererForClass (MobHeadTileEntity.class, new MobHeadTileEntityRenderer() );
    }
}

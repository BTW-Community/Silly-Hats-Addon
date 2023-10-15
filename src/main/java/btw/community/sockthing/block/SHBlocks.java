package btw.community.sockthing.block;

import btw.community.sockthing.block.blocks.HatBlock;
import btw.community.sockthing.block.blocks.MobHeadBlock;
import btw.community.sockthing.block.tileentity.HatTileEntity;
import btw.community.sockthing.block.tileentity.HatTileEntityRenderer;
import btw.community.sockthing.block.tileentity.MobHeadTileEntity;
import btw.community.sockthing.block.tileentity.MobHeadTileEntityRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.src.Block;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntityRenderer;

public class SHBlocks {

    public static int ID_HAT = 2900;
    public static int ID_MOB_HEAD = 2902;

    public static Block hat;
    public static Block mobHead;
    public static void initBlocks() {
        hat = new HatBlock(ID_HAT);
        TileEntity.addMapping(HatTileEntity.class, "SHHat");

        mobHead = new MobHeadBlock(ID_MOB_HEAD);
        TileEntity.addMapping(MobHeadTileEntity.class, "SHMobHead");
    }


}

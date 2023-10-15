package btw.community.sockthing.item;

import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.item.items.HatItem;
import btw.community.sockthing.item.items.MobHeadItem;
import net.minecraft.src.Item;

public class SHItems {

    public static int ID_HAT = 21000;
    public static int ID_MOB_HEAD = 21001;

    public static Item hat;
    public static Item mobHead;
    public static void initItems() {
        hat = new HatItem( ID_HAT - 256 )
                .setBuoyant()
                .setIncineratedInCrucible()
                .setFilterableProperties(Item.FILTERABLE_SOLID_BLOCK)
                .setUnlocalizedName( "SHItemHat" );

        mobHead = new MobHeadItem( ID_MOB_HEAD - 256, SHBlocks.mobHead)
                .setBuoyant().setIncineratedInCrucible()
                .setFilterableProperties(Item.FILTERABLE_SOLID_BLOCK)
                .setUnlocalizedName( "SHItemMobHead" );
    }
}

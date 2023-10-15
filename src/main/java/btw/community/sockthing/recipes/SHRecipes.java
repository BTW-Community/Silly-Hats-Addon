package btw.community.sockthing.recipes;

import btw.block.BTWBlocks;
import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.utils.HatsUtil;
import btw.community.sockthing.utils.MobHeadsUtil;
import btw.crafting.recipe.RecipeManager;
import btw.inventory.util.InventoryUtils;
import btw.item.BTWItems;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.NBTTagCompound;

public class SHRecipes {
    private static final int BLACK_WOOL = 0;
    private static final int RED_WOOL = 1;
    private static final int GREEN_WOOL = 2;
    private static final int BROWN_WOOL = 3;
    private static final int BLUE_WOOL = 4;
    private static final int PURPLE_WOOL = 5;
    private static final int CYAN_WOOL = 6;
    private static final int LIGHTGRAY_WOOL = 7;
    private static final int GRAY_WOOL = 8;
    private static final int PINK_WOOL = 9;
    private static final int LIME_WOOL = 10;
    private static final int YELLOW_WOOL = 11;
    private static final int LIGHTBLUE_WOOL = 12;
    private static final int MAGENTA_WOOL = 13;
    private static final int ORANGE_WOOL = 14;
    private static final int WHITE_WOOL = 15;
    public static void addRecipes() {
        /** FARMER */
        RecipeManager.addRecipe( new ItemStack(SHItems.hat, 1, HatsUtil.FARMER), new Object[] {
                " W ",
                "WWW",
                'W', BTWItems.wickerPane
        });

        /** WITCH */
        //Dropped by witches

        /** TOP */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.TOP), new Object[] {
                " L ",
                "LLL",
                'L', BTWItems.tannedLeather,
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.TOP ), new Object[] {
                " L ",
                "LLL",
                'L', BTWItems.cutTannedLeather,
        } );

        /** CHEF */

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.CHEF ), new Object[] {
                "PP",
                "PP",
                "PP",
                'P', Item.paper
        } );

        /** FLOWER */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FLOWER ), new Object[] {
                "DRD",
                "RSR",
                "DRD",
                'D', Block.plantYellow,
                'R', Block.plantRed,
                'S', Item.silk,
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FLOWER ), new Object[] {
                "RDR",
                "DSD",
                "RDR",
                'D', Block.plantYellow,
                'R', Block.plantRed,
                'S', Item.silk,
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FLOWER ), new Object[] {
                "DRD",
                "RHR",
                "DRD",
                'D', Block.plantYellow,
                'R', Block.plantRed,
                'H', BTWItems.hempFibers,
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FLOWER ), new Object[] {
                "RDR",
                "DHD",
                "RDR",
                'D', Block.plantYellow,
                'R', Block.plantRed,
                'H', BTWItems.hempFibers,
        } );

        /** WOLF */
        //Dropped by wolves

        /** BEAST */
        //Dropped by beasts

        /** BIG */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.BIG), new Object[] {
                " W ",
                "WWW",
                'W', new ItemStack( BTWItems.woolKnit, 1, WHITE_WOOL),
        } );

        /** CROWN */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.CROWN ), new Object[] {
                "GLG",
                "E E",
                "GLG",
                'G', Item.ingotGold,
                'L', new ItemStack( Item.dyePowder, 1, 4),
                'E', Item.emerald,
        } );

        /** SQUID */
        //Dropped by squid

        /** USHANKA */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.USHANKA), new Object[] {
                "RWR",
                "R R",
                'W', new ItemStack( BTWItems.woolKnit, 1, WHITE_WOOL),
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
        } );

        /** FROG */
        //Dropped by witches

        /** PUMPKIN */
        //Dropped by snowmen

        /** CAP */
        NBTTagCompound tag = new NBTTagCompound();
        tag.setInteger("color", 0x4C4C4C);
        ItemStack grayWoolHat = new ItemStack( BTWItems.woolHelmet );
        grayWoolHat.setTagCompound(tag);

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.CAP), new Object[] {
                "TW",
                "G ",
                'T', grayWoolHat,
                'W', new ItemStack( BTWItems.woolKnit, 1, GRAY_WOOL),
                'G', new ItemStack( Block.thinGlass )
        } );

        /** DINO */
//        NBTTagCompound tag2 = new NBTTagCompound();
//        tag2.setInteger("color", 0x667F33);
//        ItemStack greenWoolHat = new ItemStack( BTWItems.woolHelmet );
//        grayWoolHat.setTagCompound(tag2);
//        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.DINO), new Object[] {
//                "Y ",
//                "TY",
//                'T', greenWoolHat,
//                'Y', new ItemStack( BTWItems.woolKnit, 1, YELLOW_WOOL)
//        } );

        /** FEZ */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FEZ), new Object[] {
                " S ",
                "RR ",
                "RR ",
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
                'S', new ItemStack( Item.silk)
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FEZ), new Object[] {
                " S ",
                " RR",
                " RR",
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
                'S', new ItemStack( Item.silk)
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FEZ), new Object[] {
                " H ",
                "RR ",
                "RR ",
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
                'H', new ItemStack( BTWItems.hempFibers)
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FEZ), new Object[] {
                " H ",
                " RR",
                " RR",
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
                'H', new ItemStack( BTWItems.hempFibers)
        } );

        /** SANTA */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.SANTA), new Object[] {
                "  S",
                " RR",
                "WWW",
                'W', new ItemStack( BTWItems.woolKnit, 1, WHITE_WOOL),
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
                'S', new ItemStack( Item.snowball)
        } );

        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.SANTA), new Object[] {
                " S ",
                " RR",
                "WWW",
                'W', new ItemStack( BTWItems.woolKnit, 1, WHITE_WOOL),
                'R', new ItemStack( BTWItems.woolKnit, 1, RED_WOOL),
                'S', new ItemStack( Item.snowball)
        } );

        /** FRUIT */
        RecipeManager.addShapelessRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.FRUIT), new Object[] {
                new ItemStack( Item.bowlEmpty),
                new ItemStack( Item.appleRed),
                new ItemStack( Item.carrot),
                new ItemStack( Item.melon),
                new ItemStack( BTWBlocks.freshPumpkin),
        } );

        /** BAT */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.BAT), new Object[] {
                "WHW",
                'W', new ItemStack( BTWItems.batWing ),
                'H', new ItemStack( SHItems.mobHead, 1, MobHeadsUtil.BAT)
        } );

        /** SPIDER */
        //Dropped by Jungle Spiders

        /** ARROW */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.ARROW), new Object[] {
                "SAS",
                'A', new ItemStack( Item.arrow ),
                'S', new ItemStack( BTWItems.leatherStrap)
        } );

        /** PIRATE */
        //Dropped by player

        /** COWBOY */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.COWBOY), new Object[] {
                "L",
                "S",
                'L', new ItemStack( BTWItems.tannedLeatherHelmet ),
                'S', new ItemStack( BTWItems.leatherStrap)
        } );

        /** DEVIL */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.DEVIL), new Object[] {
                "BSB",
                'B', new ItemStack( Item.blazeRod ),
                'S', new ItemStack( BTWItems.leatherStrap)
        } );

        /** BANDANNA */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.BANDANNA), new Object[] {
                "BBB",
                " BB",
                " B ",
                'B', new ItemStack( BTWItems.woolKnit, 1, BLACK_WOOL)
        } );

        /** CAT */
        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.CAT), new Object[] {
                "W W",
                "SSS",
                'W', new ItemStack( BTWItems.woolKnit, 1, WHITE_WOOL),
                'S', new ItemStack( BTWItems.leatherStrap)
        } );

        /** MUSHROOM_RED */
        //Dropped by Mooshrooms
//        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.MUSHROOM_RED), new Object[] {
//                "RRR",
//                "RMR",
//                "RRR",
//                'R', new ItemStack( BTWItems.redMushroom ),
//                'M', new ItemStack( Block.mushroomCapRed )
//        } );

        /** MUSHROOM_BROWN */
        //Dropped by Mooshrooms
//        RecipeManager.addRecipe( new ItemStack( SHItems.hat, 1, HatsUtil.MUSHROOM_BROWN), new Object[] {
//                "BBB",
//                "BMB",
//                "BBB",
//                'B', new ItemStack( BTWItems.brownMushroom ),
//                'M', new ItemStack( Block.mushroomCapBrown )
//        } );
    }
}

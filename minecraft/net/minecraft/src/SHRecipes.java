package net.minecraft.src;

public class SHRecipes {

	public static void addRecipes() {

		//Farmer
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 0), new Object[] {
				" W ",
				"WWW",
				'W', FCBetterThanWolves.fcItemWickerPiece,
		} );

		//Witch
		// - dropped by witches

		//Top
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 2), new Object[] {
				" L ",
				"LLL",
				'L', FCBetterThanWolves.fcItemTannedLeather,
		} );
		
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 2 ), new Object[] {
				" L ",
				"LLL",
				'L', FCBetterThanWolves.fcItemTannedLeatherCut,
		} );
		
		//Chef
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 3 ), new Object[] {
				"PP",
				"PP",
				"PP",
				'P', Item.paper
		} );

		//Flower
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 4 ), new Object[] {
				"DRD",
				"RSR",
				"DRD",
				'D', Block.plantYellow,
				'R', Block.plantRed,
				'S', Item.silk,
		} );
		
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 4 ), new Object[] {
				"RDR",
				"DSD",
				"RDR",
				'D', Block.plantYellow,
				'R', Block.plantRed,
				'S', Item.silk,
		} );

		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 4 ), new Object[] {
				"DRD",
				"RHR",
				"DRD",
				'D', Block.plantYellow,
				'R', Block.plantRed,
				'H', FCBetterThanWolves.fcItemHempFibers,
		} );
		
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 4 ), new Object[] {
				"RDR",
				"DHD",
				"RDR",
				'D', Block.plantYellow,
				'R', Block.plantRed,
				'H', FCBetterThanWolves.fcItemHempFibers,
		} );

		//Wolf
		FCRecipes.AddShapelessRecipe( new ItemStack( SHMod.hat, 1, 5 ), new Object[] {	    		
				new ItemStack( FCBetterThanWolves.fcCompanionCube )
		} );

		//Icys Big Hat
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 6), new Object[] {
				" W ",
				"WWW",
				'W', new ItemStack( FCBetterThanWolves.fcItemWoolKnit, 1, FCUtilsInventory.m_iIgnoreMetadata ),
		} );
		
		//Crown
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 7 ), new Object[] {
				"GLG",
				"E E",
				"GLG",
				'G', Item.ingotGold,
				'L', new ItemStack( Item.dyePowder, 1, 4),
				'E', Item.emerald,
		} );
		
		//Squid
		// - dropped by Squid

		//Ushanka
		FCRecipes.AddRecipe( new ItemStack( SHMod.hat, 1, 9), new Object[] {
				"RWR",
				"R R",
				'W', new ItemStack( FCBetterThanWolves.fcItemWoolKnit, 1, 15),
				'R', new ItemStack( FCBetterThanWolves.fcItemWoolKnit, 1, 1),
		} );

	}

}

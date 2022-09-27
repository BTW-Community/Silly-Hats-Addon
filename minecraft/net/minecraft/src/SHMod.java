package net.minecraft.src;

public class SHMod extends FCAddOn {

	public static SHMod instance = new SHMod();

	private static final String ADDON_NAME = "Silly Hats";
	private static final String ADDON_VERSION = "1.0.0";
	private static final String LANGUAGE_PREFIX = "SH";

	private SHMod()
	{
		super(ADDON_NAME, ADDON_VERSION, LANGUAGE_PREFIX);
	}

	private static int id_hatBlock = 2900;
	private static int id_hat = 2901;

	public static Block hatBlock;
	public static Item hat;

	@Override
	public void Initialize()
	{
		FCAddOnHandler.LogMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");

		SHDecoIntegration.init();

		System.out.println("Deco Installed? " + SHDecoIntegration.isDecoInstalled());

		hatBlock = new SHBlockHat(id_hatBlock);
		hat = new SHItemHat( id_hat - 256 ).SetBuoyant().SetIncineratedInCrucible().SetFilterableProperties( Item.m_iFilterable_SolidBlock ).setUnlocalizedName( "SHItemHat" );

		TileEntity.addMapping(SHTileEntityHat.class, "SHHat");
		TileEntityRenderer.instance.addSpecialRendererForClass (SHTileEntityHat.class, new SHTileEntityHatRenderer() );

		EntityList.replaceExistingMappingSafe(SHEntityWitch.class, "Witch");
		EntityList.replaceExistingMappingSafe(SHEntitySquid.class, "Squid");

		SHRecipes.addRecipes();

		FCAddOnHandler.LogMessage(this.getName() + " Initialized");
	}

	@Override
	public String GetLanguageFilePrefix() {
		return LANGUAGE_PREFIX;
	}

}

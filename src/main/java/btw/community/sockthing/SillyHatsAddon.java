package btw.community.sockthing;

import btw.AddonHandler;
import btw.BTWAddon;
import btw.community.sockthing.block.SHBlocks;
import btw.community.sockthing.block.tileentity.TileEntityRenderMapper;
import btw.community.sockthing.item.SHItems;
import btw.community.sockthing.recipes.SHRecipes;
import net.minecraft.server.MinecraftServer;

public class SillyHatsAddon extends BTWAddon {
    private static SillyHatsAddon instance;

    private SillyHatsAddon() {
        super("Silly Hats", "1.0.0", "SH");
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");

        SHBlocks.initBlocks();
        SHItems.initItems();

        SHRecipes.addRecipes();
    }

    @Override
    public void postInitialize() {
        if (!MinecraftServer.getIsServer()) {
            TileEntityRenderMapper.initTileEntityRender();
        }
    }

    public static SillyHatsAddon getInstance() {
        if (instance == null)
            instance = new SillyHatsAddon();
        return instance;
    }
}
